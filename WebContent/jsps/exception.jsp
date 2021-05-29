<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User exists</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="margin-top:10%; background-color: #bce6eb;">

<div class="d-flex justify-content-center">
<p class="h2 text-center" >User name 
${user.username } 
already exists!.</p>
</div><br><br>
<img style="position:relative;left:660px;" src="https://www.flaticon.com/svg/static/icons/svg/3770/3770686.svg" height="200px;">
<br><br><br>

<div class="d-flex justify-content-center">
<button class="btn btn-danger" onclick="window.history.go(-2)">Try again</button>
</div>
</body>
</html>