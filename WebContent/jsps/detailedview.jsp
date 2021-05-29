<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Detail</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="background-color: #c6fced">


<div style="height: 100px; width: 100%; background-color: #8ad7c1;">
<h3 style="padding-top: 2%;" class="text-center" >Claim Details:</h3>
</div>
<br>

 <table class="table table-bordered table-hover" border="1" style=" 
   margin: 3.5em auto ">
<tr>

<th> Policy Number</th>
<th> Claim Number</th>
<th> Claim Type</th>
<th> Claim Reason</th>
<th> Accident Location</th>
<th> Accident City </th>
<th> Accident State</th>
<th> Accident Zip</th>
</tr>

<tr>
<td> ${currentcobj.policyNumber }</td>
<td> ${currentcobj.claimNumber }</td>
<td> ${currentcobj.claimType }</td>
<td> ${currentcobj.claimReason }</td>
<td> ${currentcobj.accidentLocation }</td>
<td> ${currentcobj.accidentCity }</td>
<td> ${currentcobj.accidentState }</td>
<td> ${currentcobj.accidentZip}</td>
</tr>
</table>
<br>

<button  class="btn btn-secondary" onclick="window.history.back();">Back</button>
</body>
</html>