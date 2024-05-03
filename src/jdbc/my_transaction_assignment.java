package jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class my_transaction_assignment {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Connection cc;
		   Statement ss;
		   ResultSet rs;
		   Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded and registered");
			cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
			System.out.println("connection established");
			ss=cc.createStatement();
			cc.setAutoCommit(false);
			
	try {		
		
			PreparedStatement abc=cc.prepareStatement("update hdfc set balance=(?) where anumb=(?)");
			System.out.println("amount:");
			Scanner sc=new Scanner(System.in);
			int ab=sc.nextInt();
			abc.setInt(1,ab);
			
			System.out.println("acnumber");
			Scanner cs=new Scanner(System.in);
			int cd=cs.nextInt();
			abc.setInt(2,cd);
			
			int ll=abc.executeUpdate();
			
			PreparedStatement xyz=cc.prepareStatement("update icic set balance=(?) where anumb=(?)");
			xyz.setInt(1,ab);
			
			System.out.println("acnumber");
			Scanner dd=new Scanner(System.in);
			int zz=dd.nextInt();
			xyz.setInt(2,zz);
			
			int ii=xyz.executeUpdate();
			
				System.out.println("successfull transcation");
				cc.commit();
	}
	
	catch(Exception e) {
		cc.rollback();
		System.out.println("transcation failed");
		System.out.println("Boss,server is down.Please try after sometime...");
	}
	cc.setAutoCommit(true);
	rs=ss.executeQuery("select * from icic");
	rs.next();
	int oo=rs.getInt(1);
	int pp=rs.getInt(2);
	System.out.println(oo+"\n"+pp);
	}

}


