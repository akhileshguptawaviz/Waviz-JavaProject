package com.waviz.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waviz.DAO.LoginDao;


/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	String userid=request.getParameter("uname");
	String email=request.getParameter("mail");
	String password=request.getParameter("pass");
	
	LoginDao ld=new LoginDao();
	ld.connectionCode(userid,email,password);
	/* ResultSet rs=null;
	
	
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
		   session.setAttribute("userName", rs.getString("user"));
		    response.sendRedirect("welcome.jsp");
		   
		   }
		   
		  }catch(Exception e){e.printStackTrace();
		  
			 System.out.println(e);  
			 
		  }  
      */
		}  
	
	
	}

	


