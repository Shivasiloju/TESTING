package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class batch_update {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Statement ss;
		Connection cc;

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		
		cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
		System.out.println("connection established");
		
		ss=cc.createStatement();
		
		for(int i=0;i<=49;i++) {
		
		ss.addBatch("insert into dept values(1,'shiva')");
		}
		int arr1[]=ss.executeBatch();
		System.out.println("rows inserted : "+arr1.length);
		System.out.println("successfully inserted");
		}

}
