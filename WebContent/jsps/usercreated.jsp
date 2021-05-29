<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body style="background-color: #ccf5ff">

<div class="d-flex justify-content-center">
<p class="h2 text-center" > Profile Created Successfully!.</p><br>
</div>

<div class="d-flex justify-content-center" style="margin-top: 6%">
<h4>Username:&nbsp; ${user.username },</h4>
&nbsp;&nbsp;&nbsp;&nbsp; 
<h4>Rolecode:&nbsp;${user.roleCode }</h4>
</div>

<br><br>

<div class="d-flex justify-content-center"  style="margin-top: 5%">
<button class="btn btn-success" onclick="window.history.go(-2)">Back</button>
</div>

</body>
</html>