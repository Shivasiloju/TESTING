package jdbc;

import java.sql.*;

public class prepared_statement {
public static void main(String[] args) throws Exception {
	
   Connection cc;
   
   Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	
	cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
	System.out.println("connection established");
	
	PreparedStatement ps =cc.prepareStatement("update dept set deptno=(?) where dname=(?)");
	            ps.setInt(1,5);
	            ps.setString(2,"chinn$");
	            int v=ps.executeUpdate();
	            System.out.println("update rows are:  " + v);
	            
	            ps.close();
	            cc.close();
}
}
