<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Creation</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>

.space
{
width: 80px;
display:inline-block;
}
</style>
</head>

<body  style="background-color: #b9fffc;" >

<div style="height: 100px; width: 100%; background-color: #80dfff;">
	<h4 class="text-center" style="padding-top: 2%;">Enter the Claim Details Below:</h4><br><br>
</div>

<br>
<br>

<div class="d-flex justify-content-center">
	<form  method="POST" action ="nextcreate.htm" autocomplete="off">

    	 <h4 style="display:inline-block; font-size: medium;">Policy Number:</h4><div style="display:inline-block;width:82px;"></div> <input type="number" name="policyNumber" value="${policyNumber }"  readonly="readonly"><br><br>
     
     	<h4 style="display:inline-block; font-size: medium;">Claim Reason:</h4><div style="display:inline-block;width:95px;"></div><input  type="text" name="claimReason" required><br><br>
 
     	<h4 style="display:inline-block; font-size: medium;">Accident Location:</h4><div style="display:inline-block;width:65px;"></div><input  type="text" name="accidentLocation" required><br><br>

	 	<h4 style="display:inline-block; font-size: medium;">Accident City:</h4><div style="display:inline-block;width:99px;"></div><input  type="text" name="accidentCity" required><br><br>
	 
	 	<h4 style="display:inline-block; font-size: medium;">Accident State:</h4><div style="display:inline-block;width:90px;"></div><input  type="text" name="accidentState" required><br><br>
	 
	 	<h4 style="display:inline-block; font-size: medium;">Accident Zip:</h4><div style="display:inline-block;width:101px;"></div><input  type="number" name="accidentZip"  required><br><br>
	 
	 	<h4 style="display:inline-block; font-size: medium;">Claim Type:</h4><div style="display:inline-block;width:113px;"></div><select name="claimType">
	 
		 <option  value="Vehicle">Vehicle</option>
	 	<option value="Apartment">Apartment</option>
	 	<option value="Business">Business</option>
	 	<option value="Disability">Disability</option></select><br><br>
	 
	 	<br>
	 	<br>
	 	<!--   <a class="btn btn-secondary" role="button" href="nextcreate.htm">Next</a> -->
	 
	   <input style="float:left; margin-left:139%;" role ="button" class="btn btn-primary" type="submit" value="Next"> 
	 
	</form>
</div>

   <button  style="margin-right:70%;position:absolute;top:589px;right:100px;" class="btn btn-secondary" onclick="window.history.back();">Back</button>

</body>
</html>