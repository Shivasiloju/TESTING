package jdbc;
import java.sql.*;
import java.util.*;

import com.mysql.cj.jdbc.CallableStatement;
public class callable1 {

	public static void main(String[] args) throws Exception {
		Scanner ss=new Scanner(System.in);
		// TODO Auto-generated method stub
Connection cc;
    
    Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	
	cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
	System.out.println("connection established");
	 
	java.sql.CallableStatement sc=cc.prepareCall("{call croc2(?,?)}");
	Scanner aa=new Scanner(System.in);
	int dno=aa.nextInt();
	
	sc.setInt(1,dno);
	sc.registerOutParameter(2,Types.VARCHAR);
	
  sc.execute();
  String str=sc.getString(2);
  System.out.println(str);
  
  cc.close();
  sc.close();	
	}
}
