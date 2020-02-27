package com.Size4U.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Database utility class
 * @author Ruitong.Su
 *
 */
public class DbUtil {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/db_size4u"; //Database url
	private String dbUserName = "root"; //User name
	private String dbPassword = "123456"; //Password
	private String jdbcName = "com.mysql.jdbc.Driver"; //Driver name
	
	/**
	 * Connect with database
	 * @return connection
	 * @throws Exception
	 */
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	/**
	 * Close the connection
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("Database connection successful!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Database connection failed!");
		}
	}

}
