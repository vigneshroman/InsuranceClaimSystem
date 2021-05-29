<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Claims</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="text-align: center;background-color: #E0FFFF">

<div style="height: 100px; width: 100%; background-color: #61f2f5;">
<h3 style="padding-top: 2%;"class="text-center">Claim List</h3><br>
</div>

<h3 style="padding-top: 50px; font-size: medium;" class="text-center text-muted">
</h3><br>


  <table class="table table-bordered table-hover" border="1" style=" margin-left: auto;
  margin-right: auto;">
    <caption>List of Claims</caption>
    <tr>
    <th>Policy Number</th>
    <th>Claim Number</th>
    <th>Claim Type</th>
    <th>View Button</th>
    </tr>
    <c:forEach items="${claimList}" var="clist">
    
        <tr>
            <td>${clist.policyNumber }</td>
            <td><c:out value="${clist.claimNumber }" /></td>
            <td>${clist.claimType }</td>
            <td><a role="button" class="btn btn-primary" href="detailedclaim.htm?username=${username }&rolecode=${rolecode}&claimnum=${clist.claimNumber}">View Claim</a></td>
        </tr>
    </c:forEach>
</table><br><br>
<!-- style="position: absolute;right:30px;" -->
<button   class="btn btn-secondary" onclick="window.history.back();">Back</button><br><br>
</body>
</html>