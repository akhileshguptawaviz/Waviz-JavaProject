<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Signup Form</title>
</head>
<body>
     <h1>Signup Form</h1>
     <form action="Signup" method="get">
        Full Name:<input type="text" name="uname" required><br>    
        Email:<input type="email"  name="mail" required><br>
        mobile:<input type="text"  name="mob" required><br>
        Password:<input type="password" name="pass" required><br>
        Confirm Password:<input type="password" name="cpass" required>
       
        <fieldset>
            <legend>Address:</legend>
            <textarea name="add" rows="10" cols="100">

       </textarea>
        </fieldset>
        
        
           Hobbies:
           
   <select name="hob" required>
    <option value="Singing" selected>Singing
    <option value="Reading" selected>Reading
    <option value="Travelling" selected>Travelling
    <option value="Playing" selected>Playing
    <option value="TV" selected>TV
    <option value="Internet" selected>Internet
  </select>
  <br>
           
    Gender: <input type="radio" name="gender" value="male" > Male<input type="radio" name="gender" value="female"> Female<br>
     
     <input type="submit" value="Submit">
     <input type="reset" value="Reset"> 
 
     </form>
</body>
</html>