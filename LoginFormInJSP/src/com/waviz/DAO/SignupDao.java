package com.waviz.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SignupDao {
	
	public void SignupConnection(String userid,String email
			,String password,String cpassword,String address,String hobbies,String gender){
		try{  
			   Class.forName("com.mysql.jdbc.Driver");  
			   
			   System.out.println("Connecting to a selected database...");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");  
			     
			   System.out.println("Connected database successfully...");	
			   
			   PreparedStatement ps=(PreparedStatement)con.prepareStatement("insert into signupform values(?,?,?,?,?,?,?)");  
			   ps.setString(1,userid);  
			   ps.setString(2,email);
			   ps.setString(3, password);
			   ps.setString(4, cpassword);
			   ps.setString(5, address);
			   ps.setString(6, hobbies);
			   ps.setString(7, gender);
			  // ResultSet rs=ps.executeQuery();
			   
			   int i=ps.executeUpdate();
			   if(i>0)
			   {System.out.println("Reg success full");}
			   
			  }catch(Exception e){e.printStackTrace();
			  
				 System.out.println(e);  
				 
			  }  
	    
	}

}
