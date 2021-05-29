<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.cg.model.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Admin Page</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style type="text/css">
html
    {
     
        
         padding-bottom: 20%;
        
    }
@import "https://use.fontawesome.com/releases/v5.5.0/css/all.css";
body{
  margin: 0;
  padding: 0;
  font-family:serif;
  background: linear-gradient(#E6FAFF,#B3F0FF);
  background-size: cover;
}
.textbox{
text-align: center;
text-shadow:black;
font-size:medium;
font-family:cursive;
font-weight:1000%;
 
  
}
.a{
  width:15%;
 
  cursor: pointer;
  margin:1%;
}
 p
    {
    font-family:serif;
     height:100%;  
    font-size:300%;
    text-align: center;  
    color: #800080;  
    padding: 20px;  
    }  
 
 
   
 
}
  
</style>
</head>
<body  >

<h4 class="text-center" style="margin-top: 30px;margin-bottom:100px;font-weight: bold;">${user.roleCode} Login Successful</h4>
<br>
<div class="Admin-box">
<form method="post" action="#"></form>
<br>

<div class="textbox">
<a class="btn btn-primary a" href="createprofile.htm" role="button">New Profile Creation</a>
</div>

<div class="textbox">

<a class="btn btn-primary a" href="viewpolicy.htm?username=${user.username}" role="button">Claim Creation</a></div>

<div class="textbox">

<a class="btn btn-primary a" href="viewclaims.htm?username=${user.username}&rolecode=${user.roleCode }" role="button">View Claim</a>
</div>

<div class="textbox">
<a class="btn btn-primary a" href="newpage.htm" role="button">Report Generation</a>
</div>

<br>
<div class="textbox">
<a href="viewpolicy.htm?username=${user.username}">View Policies</a>
</div>
<br>
<div class="textbox">
<button class="btn btn-secondary" onclick="window.location.href='login.htm'">Logout</button>
</div>
</div>


</body>
</html> 