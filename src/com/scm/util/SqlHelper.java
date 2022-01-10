package com.scm.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.scm.constants.SCMConstants;

/**
 * @author v549566
 * 
 */
public class SqlHelper {
	private String connectionUrl = "";
	private String connectionUserID = "";
	private String connectionPwd = "";
	private Connection con;
	private Statement stmt;
	private Properties connectionProperties = new Properties();

	private void loadDbProperties(String dbSystem) {
		FileInputStream fileInputStream = null;
		try {
			Properties ptsConfigs = new Properties();
			ptsConfigs.load(new FileInputStream(
					SCMConstants.CSSOP_CONFIG_FILE_URL));
			
			connectionUrl = ptsConfigs.getProperty(dbSystem+"."+SCMConstants.DBCONFIGJDBCURL);
			connectionUserID = ptsConfigs.getProperty(dbSystem+"."+SCMConstants.DBCONFIGUSER);
			connectionPwd = ptsConfigs.getProperty(dbSystem+"."+SCMConstants.DBCONFIGJPWD);/*DesEncrypter
					.decrypt(
							ptsConfigs.getProperty(SCMConstants.DBCONFIGJPWD),
							ptsConfigs
									.getProperty(SCMConstants.USER_KEY_FOR_PWD_ENCRYPT_OR_DECRYPT));*/

			

		} catch (Exception exception) {
			throw new RuntimeException(exception);
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (Exception exception) {
					throw new RuntimeException(exception);
				}
			}
		}

	}

	private void loadProperties(String rowPreFetchValue, String dbSystem) {
		loadDbProperties(dbSystem);
		connectionProperties.put(SCMConstants.DBCONFIGUSER,
				connectionUserID);
		connectionProperties.put(SCMConstants.DBCONFIGJPASSWORD,
				connectionPwd);
		connectionProperties.put(SCMConstants.DBCONFIGDEFAULTROWPREFETCH,
				rowPreFetchValue);
	}

	public boolean getConnection(String rowPreFetchValue, String dbSystem) throws Exception {
		try {
			Class.forName(SCMConstants.DBORACLEDRIVER);
			loadProperties(rowPreFetchValue, dbSystem);
			con = DriverManager.getConnection(connectionUrl,
					connectionProperties);

		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	public void closeConnection() throws Exception {
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();
	}

	public ResultSet getResultSetWithQuery(String query) throws Exception {

		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet = stmt.executeQuery(query);
		return resultSet;
	}

}
