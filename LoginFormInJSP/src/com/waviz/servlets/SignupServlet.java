package com.waviz.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.waviz.DAO.SignupDao;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class SignupServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userid=request.getParameter("uname");
		String email=request.getParameter("mail");
		String password=request.getParameter("pass");
		String cpassword=request.getParameter("cpass");
		String address=request.getParameter("add");
		String hobbies=request.getParameter("hob");
		String gender=request.getParameter("gender");
		
		SignupDao signupDao=new SignupDao();
		signupDao.SignupConnection(userid, email, password, cpassword, address, hobbies, gender);
		
		
		/*
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
				 
			  }  */
	      
			}  
		
		
		
	
	
	
	}

