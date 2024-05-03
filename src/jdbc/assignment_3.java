package jdbc;

import java.sql.*;

public class assignment_3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     Connection cc;
     Statement ss;
     Class.forName("com.mysql.cj.jdbc.Driver");
     
     
     cc=DriverManager.getConnection("jdbc:mysql://localhost/shiva","root","shiva@2000");
     
     
     ss=cc.createStatement();
     
     PreparedStatement pp=cc.prepareStatement("insert into dept values(?,?)");
     for(int i=1;i<51;i++) {
    	 
    	 pp.setInt(1,i);
    	 pp.setString(2,"shiva");
    	 pp.executeUpdate();
     }
     System.out.println("inserted rows");
	}
}
