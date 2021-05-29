<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Creation</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="margin-top: 3%; background-color: #c3edea">

<p class="h2 text-center" >New Profile Creation
</p><br><br><br><br><br>

<div class="d-flex justify-content-center">

<form action="createprofile.htm" method="post">

<h5>Enter Login Id:</h5><input class="form-control  " type="text" name="username" required autocomplete="off"><br>

<h5>Enter Password:</h5><input class="form-control " type="password" name="password" pattern="^(?=.{8,12})(?=.*[a-z])(?=.*[A-Z])(?=.*[^\w\d]).*$" required>

<small class="text-muted">password should contain atleast 1 uppercase, 1 lowercase, alphabets and numbers and 1 special character.(min 8 characters , max 12 characters)</small><br><br>

<h5>Enter Role Code:</h5>
<select class="form-control " name="roleCode" id="role">

  <option value="User">User</option>
  <option value="Agent">Agent</option>
  <option value="Admin">Admin</option>

</select><br><br>

<input class="btn btn-primary" type="submit" value="Create">

</form>


</div><br>
<div class="d-flex justify-content-center">
<button class="btn btn-secondary" style="position:relative;bottom:61px;left:270px;" onclick="window.history.back();">Back </button></div>
</body>
</html>