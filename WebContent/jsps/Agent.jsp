<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Page</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="text-align: center;margin-top: 5%;background-color: #dbf6e9">
<h4 class="text-center" style="margin-top: 10px;margin-bottom:100px;">Welcome ${user.roleCode}</h4>


<a class="btn btn-primary" href="viewpolicy.htm?username=${user.username}" role="button">Claim Creation</a>

<a class="btn btn-primary" href="viewclaims.htm?username=${user.username}&rolecode=${user.roleCode }" role="button">View Claim</a>
<br><br><br><br><br>


<a href="viewpolicy.htm?username=${user.username}">View Policies</a>&nbsp;&nbsp;&nbsp;&nbsp;

<button  class="btn btn-secondary" onclick="window.location.href='login.htm'">Logout</button>

</body>
</html>