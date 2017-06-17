package com.waviz.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
public	int  connectionCode(String userid,String email,String password){
		ResultSet rs=null;
		
		
		try{  
			   Class.forName("com.mysql.jdbc.Driver");  
			   
			   System.out.println("Connecting to a selected database...");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");  
			     
			   System.out.println("Connected database successfully...");	
			   
			   PreparedStatement ps=(PreparedStatement)con.prepareStatement("select * from signupform where user=? and email=? and password=?  ");  
			   ps.setString(1,userid);  
			   ps.setString(2,email);
			   ps.setString(3, password);
			   rs=ps.executeQuery();
			   
			   if(rs.next())
			   {System.out.println("Reg success full");
			  /// session.setAttribute("userName", rs.getString("user"));
			    //response.sendRedirect("welcome.jsp");
			   return 1;
			   }
			   else return 0;
			  }catch(Exception e){e.printStackTrace();
			  
				 System.out.println(e);  
				return 0; 
			  }  
	}

}
