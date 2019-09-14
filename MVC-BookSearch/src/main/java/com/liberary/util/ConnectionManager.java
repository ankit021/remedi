package com.liberary.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

	private static final String Db_uName="system";
	private static final String Db_pWord="system";
	private static final String Db_url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String Db_driverClass="oracle.jdbc.driver.OracleDriver";

	public static Connection con;
	public static Connection getCon() {
		try {
			Class.forName(Db_driverClass);
			con=DriverManager.getConnection(Db_url,Db_uName,Db_pWord);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
