<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> User's Policies</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="text-align: center;background-color: #E0FFFF">

<div style="height: 100px; width: 100%; background-color: #bce6eb;">
<h3 style="padding-top: 2%;"class="text-center">Policy List</h3><br>
</div>

<h3 style="padding-top: 50px; font-size: medium;" class="text-center text-muted">Username:${usernameFromQueryParam} 
<!--${sessionScope.currentUser.username}  --></h3><br>

<!--RoleCode: ${sessionScope.currentUser.roleCode}<br>-->



  <table class="table table-bordered table-hover" border="1" style=" margin-left: auto;
  margin-right: auto;">
    <caption>List of Policies</caption>
    <tr>
    <th>PolicyNumber</th>
    <th>PolicyPremium</th>
    <th>AccountNumber</th>
    <th>Link to Create Claim</th>
    </tr>
    <c:forEach items="${lis}" var="list">
    
        <tr>
            <td>${list.policyNumber}</td>
            <td><c:out value="${list.policyPremium}" /></td>
            <td>${list.accountNumber}</td>
            <td><a href="create.htm?username=${usernameFromQueryParam}&policynumber=${list.policyNumber }">Click to Create Claim</a>
        </tr>
    </c:forEach>
</table><br><br>

<button  class="btn btn-secondary" onclick="window.history.back();">Back</button>
</body>
</html>