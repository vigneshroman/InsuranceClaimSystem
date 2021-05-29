<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report View</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="text-align:center; background-color: #f2f2f2">


<h4 >Policy Detailed Report View</h4>

<p style="text-align: justify; margin:5% auto 3%;padding-left: 43%; font-weight: bold;">
Claim Reason:&nbsp;&nbsp;${claimObject.claimReason}<br>

Accident Location Street:&nbsp;&nbsp;${claimObject.accidentLocation}<br>

Accident City:&nbsp;&nbsp;${claimObject.accidentCity}<br>

Accident State:&nbsp;&nbsp;${claimObject.accidentState}<br>

Accident Zip:&nbsp;&nbsp;${claimObject.accidentZip}<br>

Claim Type:&nbsp;&nbsp;${claimObject.claimType}<br>

<p>

 <table class="table table-bordered table-hover" border="1" style=" margin-left: auto;
  margin-right: auto;">
  
    <tr>
    <th>Policy Question</th>
    <th>Answer(value)</th>
    </tr>
    
    <c:forEach items="${policydetails}" var="plist">
    
        <tr>
            <td class="text-muted" style="font-weight: bold;">${plist.policyQuestion }</td>
            <td>${plist.answer }</td>

        </tr>
    </c:forEach>
    
</table>
<br><br>

<button  class="btn btn-secondary" onclick="window.history.back();">Back</button><br><br>

</body>
</html>