package jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class transaction_commit {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Connection cc;
		   Statement ss;
		   
		   Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded and registered");
			cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
			System.out.println("connection established");
			ss=cc.createStatement();
			
			cc.setAutoCommit(false);
			
	try {		
		ss.execute("update hdfc set balance=5000 where anumb=123");
		ss.execute("update icic set balance=5000 where anumb=124");
			cc.commit();
			System.out.println("transcation successfull");
	}
	
	catch(Exception e) {
		cc.rollback();
		System.out.println("transcation failed");
		System.out.println("Boss,server is down.Please try after sometime... ");
	}
	cc.setAutoCommit(true);
	}

}
