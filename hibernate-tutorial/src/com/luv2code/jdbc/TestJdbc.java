package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		// for MySQL, need &serverTimezone=UTC
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pwd = "hbstudent";
		
		try {
			System.out.println("Connecting to database: "+ jdbcurl);
			
			Connection myConn = DriverManager.getConnection(jdbcurl, user, pwd);
			
			System.out.println("Connection successful!!!");
			
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
