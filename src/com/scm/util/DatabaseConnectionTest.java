package com.scm.util;

import java.net.InetAddress;
import java.sql.Connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DatabaseConnectionTest extends DefaultConnectionTester {
	static {
		try {
			System.setProperty("smtp.err.db.subject", " " + InetAddress.getLocalHost().getHostName() + " ");
		} catch(Exception e) {
			
		}
	}
	private static String DB_ERROR_EMAIL_LIMIT = "DB_ERROR_EMAIL_LIMIT";
	
	private Logger logger = LogManager.getLogger("SCMCORE");
	
	public static int counter = 0;
	private static String limit = null;
	
	@Override
	public int activeCheckConnection(Connection c, String query, Throwable[] rootCauseOutParamholder) {
		return super.activeCheckConnection(c, query, rootCauseOutParamholder);
	}
	
	@Override
	public int statusOnException(Connection c, Throwable th , String query, Throwable[] rootCauseOutParamholder ) {
		
		int result = super.statusOnException(c, th, query, rootCauseOutParamholder);
		if(result != CONNECTION_IS_OKAY) {
			logger.error(" Connection not okay ", th);
		}
		return result;
	}
	

}
