<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
<script src="loginValidation.js" type="text/javascript"></script>
</head>
<body>
    
   <form  name="myForm" action="home" method="get" >
   FullName:<input type="text" name="uname" required><br>
   Email:<input type="email" name="mail" required><br>
   Password:<input type="text" name="pass" required><br>
   <input type="submit" value="Submit" onclick="validateForm()"><input type="reset" value="Rest"> 
   <a href="Signup.jsp">New Register</a>
   </form>

<% 
String captchaResult= (String) request.getAttribute("captcha"); 
%>

<h3>Genrated Captcha:<%=captchaResult %>></h3>

</body>
</html>