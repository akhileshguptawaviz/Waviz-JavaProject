package com.waviz.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SignupDao {
	
	public int SignupConnection(String userid,String email
			,String password,String cpassword,
			String address,String hobbies,String gender){
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
			   
			   if(userid == ""||email==""||password==""||
						cpassword==""||address==""||hobbies==""||gender=="")
			   {
				   System.out.println("Some Field Are Empty in Form...");
			   } 
			   else{
				   int i=ps.executeUpdate();
			       System.out.println("Execute Update");   
			       if(i>0){
			       System.out.println("Reg success full");
			    return 1;
			   }else {
				   System.out.println("Reg Values not store in databases");
				   
				   return 0;}
			   }
			   
			  }catch(Exception e){e.printStackTrace();	
			  System.out.println(e); 
			  
			  //return 0;
			 
				 
			  }
		return 0;  
	    
	}

}
