package com.scm.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.mchange.v1.db.sql.ResultSetUtils;
import com.mchange.v1.db.sql.StatementUtils;
import com.mchange.v2.c3p0.AbstractConnectionTester;
import com.mchange.v2.c3p0.cfg.C3P0Config;
import com.mchange.v2.log.MLevel;
import com.mchange.v2.log.MLog;
import com.mchange.v2.log.MLogger;

public class DefaultConnectionTester extends AbstractConnectionTester {

	// Field descriptor #90 Ljava/lang/String;
	private static final java.lang.String PROP_KEY = "com.mchange.v2.c3p0.impl.DefaultConnectionTester.querylessTestRunner";

	// Field descriptor #90 Ljava/lang/String;
	private static final java.lang.String IS_VALID_TIMEOUT_KEY = "com.mchange.v2.c3p0.impl.DefaultConnectionTester.isValidTimeout";

	static final MLogger logger = MLog.getLogger(DefaultConnectionTester.class);

	// Field descriptor #96 I
	static final int IS_VALID_TIMEOUT;

	// Field descriptor #90 Ljava/lang/String;
	static final java.lang.String CONNECTION_TESTING_URL = "http://www.mchange.com/projects/c3p0/#configuring_connection_testing";

	// Field descriptor #96 I
	static final int HASH_CODE = DefaultConnectionTester.class.getName().hashCode();

	// Field descriptor #101 Ljava/util/Set;
	static final java.util.Set INVALID_DB_STATES;

	public static boolean propableInvalidDb(SQLException sqle) {
		return INVALID_DB_STATES.contains(sqle.getSQLState());
	}

	static final QuerylessTestRunner METADATA_TABLESEARCH = new QuerylessTestRunner() {
		public int activeCheckConnectionNoQuery(Connection c, Throwable[] rootCauseOutParamholder) {
			ResultSet rs = null;

			try {
				rs = c.getMetaData().getTables(null, null, "PROBABLYNOT", new String[] { "TABLE" });

				return 0;
			} catch (SQLException e) {

				if (DefaultConnectionTester.logger.isLoggable(MLevel.FINE)) {
					DefaultConnectionTester.logger.log(MLevel.FINE,
							"Connection " + c + " failed default system table Connection test with an Exception!", e);
				}

				if (rootCauseOutParamholder != null) {
					rootCauseOutParamholder[0] = e;
				}

				String state = e.getSQLState();

				if (DefaultConnectionTester.INVALID_DB_STATES.contains(state)) {
					if (DefaultConnectionTester.logger.isLoggable(MLevel.WARNING)) {
						DefaultConnectionTester.logger.log(MLevel.WARNING, "SQL State '" + state
								+ "' of Exception which occurred durin a Connection test (fallback DatabaseMetaData test) implies that the database is invalid, and the pool should refill itself with fresh Connections.",
								e);
					}
					return -8;
				}
				return -1;
			} catch (Exception e) {
				if (DefaultConnectionTester.logger.isLoggable(MLevel.FINE)) {
					DefaultConnectionTester.logger.log(MLevel.FINE,
							"Connection " + c + " failed default system table Connection test with an Exception!", e);
				}
				if (rootCauseOutParamholder != null) {
					rootCauseOutParamholder[0] = e;
				}
				return -1;
			} finally {
				ResultSetUtils.attemptClose(rs);
			}
		}
	};
	static final QuerylessTestRunner IS_VALID = new QuerylessTestRunner() {

		public int activeCheckConnectionNoQuery(Connection c, Throwable[] rootCauseOutParamholder) {
			try {
				boolean okay = c.isValid(DefaultConnectionTester.IS_VALID_TIMEOUT);
				if (okay) {
					return 0;
				}

				if (rootCauseOutParamholder != null) {
					rootCauseOutParamholder[0] = new SQLException(
							"Connection.isValid(" + DefaultConnectionTester.IS_VALID_TIMEOUT + ") returned false.");
				}

				return -1;
			} catch (SQLException e) {
				if (rootCauseOutParamholder != null) {
					rootCauseOutParamholder[0] = e;
				}

				String state = e.getSQLState();

				if (DefaultConnectionTester.INVALID_DB_STATES.contains(state)) {
					if (DefaultConnectionTester.logger.isLoggable(MLevel.WARNING)) {
						DefaultConnectionTester.logger.log(MLevel.WARNING, "SQL State '" + state
								+ "' of Exception which occurred durin a Connection test (fallback DatabaseMetaData test) implies that the database is invalid, and the pool should refill itself with fresh Connections.",
								e);
					}
					return -8;
				}
				return -1;
			} catch (Exception e) {
				if (rootCauseOutParamholder != null) {
					rootCauseOutParamholder[0] = e;
				}
				return -1;
			}
		}
	};
	static final QuerylessTestRunner SWITCH = new QuerylessTestRunner() {
		public int activeCheckConnectionNoQuery(Connection c, Throwable[] rootCauseOutParamholder) {
			int out;
			try {
				out = DefaultConnectionTester.IS_VALID.activeCheckConnectionNoQuery(c, rootCauseOutParamholder);
			} catch (AbstractMethodError e) {
				out = DefaultConnectionTester.METADATA_TABLESEARCH.activeCheckConnectionNoQuery(c,
						rootCauseOutParamholder);
			}
			return out;
		}

	};

	private final QuerylessTestRunner querylessTestRunner;

	private static QuerylessTestRunner reflectTestRunner(String propval) {
		try {
			if (propval.indexOf(".") >= 0) {
				return (QuerylessTestRunner) Class.forName(propval).newInstance();
			}

			Field staticField = DefaultConnectionTester.class.getDeclaredField(propval);
			return (QuerylessTestRunner) staticField.get(null);
		} catch (Exception e) {
			if (logger.isLoggable(MLevel.WARNING)) {
				logger.log(MLevel.WARNING, "Specified QuerylessTestRunner '" + propval
						+ "' could not be found or instantiated. Reverting to default 'SWITCH'", e);

			}
			return null;
		}
	}

	static {

		Set<String> temp = new HashSet();
		temp.add("08001");
		temp.add("08007");

		INVALID_DB_STATES = Collections.unmodifiableSet(temp);

		int isValidTimeout = -1;

		String timeoutStr = C3P0Config.getMultiPropertiesConfig()
				.getProperty("com.mchange.v2.c3p0.impl.DefaultConnectionTester.isValidTimeout");

		try {
			if (timeoutStr != null)
				isValidTimeout = Integer.parseInt(timeoutStr);
		} catch (NumberFormatException e) {
			if (logger.isLoggable(MLevel.WARNING)) {
				logger.log(MLevel.WARNING,
						"Could not parse value set for com.mchange.v2.c3p0.impl.DefaultConnectionTester.isValidTimeout ['"
								+ timeoutStr + "'] into int.",
						e);
			}
		}

		if (isValidTimeout <= 0) {
			isValidTimeout = 0;
		} else if (logger.isLoggable(MLevel.INFO)) {
			logger.log(MLevel.INFO, "Connection.isValid(...) based Connection tests will timeout and fail after "
					+ isValidTimeout + " seconds.");
		}

		IS_VALID_TIMEOUT = isValidTimeout;
	}

	public DefaultConnectionTester() {
		QuerylessTestRunner defaultQuerylessTestRunner = SWITCH;

		String prop = C3P0Config.getMultiPropertiesConfig()
				.getProperty("com.mchange.v2.c3p0.impl.DefaultConnectionTester.querylessTestRunner");

		if (prop == null) {
			this.querylessTestRunner = defaultQuerylessTestRunner;
		} else {
			QuerylessTestRunner reflected = reflectTestRunner(prop.trim());
			this.querylessTestRunner = (reflected != null) ? reflected : defaultQuerylessTestRunner;
		}
	}

	public int activeCheckConnection(Connection c, String query, Throwable[] rootCauseOutParamholder) {
		if (query == null) {
			return this.querylessTestRunner.activeCheckConnectionNoQuery(c, rootCauseOutParamholder);
		}
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(query);

			return 0;
		} catch (SQLException e) {
			if (DefaultConnectionTester.logger.isLoggable(MLevel.FINE)) {
				DefaultConnectionTester.logger.log(MLevel.FINE,
						"Connection " + c + " failed Connection test with an Exception! [query=" + query + "]", e);
			}

			if (rootCauseOutParamholder != null) {
				rootCauseOutParamholder[0] = e;
			}
			String state = e.getSQLState();

			if (INVALID_DB_STATES.contains(state)) {
				if (logger.isLoggable(MLevel.WARNING)) {
					logger.log(MLevel.WARNING, "SQL State '" + state
							+ "' of Exception which occurred during a Connection test (test with query '" + query
							+ "') implies that the database is invalid, and the pool should refill itself with fresh Connections.",
							e);
				}
				return -8;
			}
			return -1;
		} catch (Exception e) {
			if (DefaultConnectionTester.logger.isLoggable(MLevel.FINE)) {
				DefaultConnectionTester.logger.log(MLevel.FINE,
						"Connection " + c + " failed Connection test with an Exception!", e);
			}

			if (rootCauseOutParamholder != null) {
				rootCauseOutParamholder[0] = e;
			}
			return -1;
		} finally {
			ResultSetUtils.attemptClose(rs);
			StatementUtils.attemptClose(stmt);
		}

	}

	@Override
	public int statusOnException(Connection c, Throwable t, String query, Throwable[] rootCauseOutParamholder) {
		if (logger.isLoggable(MLevel.FINER)) {
			logger.log(MLevel.FINER, "Testing a Connection in response to an Exception:", t);
		}

		try {
			if (t instanceof SQLException) {
				String state = ((SQLException) t).getSQLState();
				if (INVALID_DB_STATES.contains(state)) {
					if (logger.isLoggable(MLevel.WARNING)) {
						logger.log(MLevel.WARNING, "SQL State '" + state
								+ "' of Exception tested by statusOnException() implies that the database is invalid, and the pool should refill with fresh Connections.",
								t);
					}
					return -8;
				}
				return activeCheckConnection(c, query, rootCauseOutParamholder);
			}
			if (DefaultConnectionTester.logger.isLoggable(MLevel.FINE)) {
				DefaultConnectionTester.logger.log(MLevel.FINE,
						"Connection test failed because test-provoking Throwable is an unexpected, non-SQLException.",
						t);
			}

			if (rootCauseOutParamholder != null) {
				rootCauseOutParamholder[0] = t;
			}

			return -1;
		} catch (Exception e) {
			if (DefaultConnectionTester.logger.isLoggable(MLevel.FINE)) {
				DefaultConnectionTester.logger.log(MLevel.FINE,
						"Connection " + c + "failed Connection test with an Exception!", t);
			}
			if (rootCauseOutParamholder != null) {
				rootCauseOutParamholder[0] = e;
			}

			return -1;
		} finally {

		}
	}

	private static String queryInfo(String query) {
		return (query == null) ? "[using Connection.isValid(...) if supported, or else traditional default query]"
				: ("[query=" + query + "]");
	}

	public boolean equals(Object o) {
		return (o != null && o.getClass() == DefaultConnectionTester.class);
	}

	public int hashCode() {
		return HASH_CODE;
	}

	public static interface QuerylessTestRunner extends Serializable {
		int activeCheckConnectionNoQuery(Connection c, Throwable[] rootCauseOutParamholder);
	}
}
