package com.waviz.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waviz.Captcha.CaptchaGenerationCode;
import com.waviz.DAO.LoginDao;


/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	
	
	private int counterCaptcha=3;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	String userid=request.getParameter("uname");
	String email=request.getParameter("mail");
	String password=request.getParameter("pass");
	
	LoginDao ld=new LoginDao();
	int login=ld.connectionCode(userid,email,password);
	if(login==1){
		response.sendRedirect("welcome.jsp");
		
	}
	else{
		
		
		
		System.out.println("error page");
		counterCaptcha--;
		System.out.println(counterCaptcha);
		
		if(counterCaptcha==0){
			
			
			CaptchaGenerationCode captcha = new CaptchaGenerationCode();
			  String str = captcha.generateCaptcha();
			  
			  request.setAttribute("captcha", str);
    
			  RequestDispatcher requestDispatcher=
					  request.getRequestDispatcher("Login.jsp");
			  
			  requestDispatcher.forward(request, response);
			  
			 // System.out.println(captcha);
						
		}
		else{
			response.sendRedirect("Login.jsp");

		}
	}
	
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

	


