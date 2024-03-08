package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		//driver load
		
		
		//connection establish
		
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "123456789";
//			Class.forName("oracle.jdbc.driver.oracleDriver");
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			System.out.println("connected successfully");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		//statement create
		//execute-query
		//connection close
		

	}

}
