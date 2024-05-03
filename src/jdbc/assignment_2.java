package jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class assignment_2 {
public static void main(String[] args) throws Exception{
	 Connection cc;
	   
	   Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		
		cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
		System.out.println("connection established");
		
		PreparedStatement ps =cc.prepareStatement("update dept set deptno=(?) where dname=(?)");
		
		System.out.println("enter your updating deptno:");
		Scanner sc=new Scanner(System.in);
		int as=sc.nextInt();
		
		          ps.setInt(1,as);
		          
		     System.out.println("enter your dname:");    
		     Scanner cs=new Scanner(System.in);
		     String bb=cs.nextLine();
		     
		            ps.setString(2,bb);
		            
		            int v=ps.executeUpdate();
		            System.out.println("updated rows are:  " + v);
		            
		            ps.close();
		            cc.close();
}
}
