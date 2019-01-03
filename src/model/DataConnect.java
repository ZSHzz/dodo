package model;

import java.sql.*;


public class DataConnect {
     
	private static Statement stat;
	private static void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("连接数据库...");
		Connection conn = DriverManager.getConnection("jdbc:mysql://10.51.163.135:3306/dodo","root","123123");
 		stat = conn.createStatement();

	}
	public static  Statement getStat() throws ClassNotFoundException, SQLException{
		
		if(stat==null)
		init();
		
		return stat;
		
	}
	
}