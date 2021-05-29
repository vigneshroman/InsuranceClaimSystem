<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Questions Form</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
input{
border:none;
font-size: 20px;}</style>
</head>
<body style="text-align: center;background-color: #f1f6f9">
 
 <h4 class="text-center">Provide the Details Below:</h4>

<div class="d-flex justify-content-center">

<br><br>
 
 <form method="post" action="createc.htm">
       
      <input class="form-control col-lg-3" type="hidden" name="policyNumber" value="<%=request.getParameter("policyNumber")%>"  readonly="readonly">
     
      <input type="hidden" name="claimReason" value=<%=request.getParameter("claimReason")%>>
 
      <input type="hidden" name="accidentLocation" value="<%=request.getParameter("accidentLocation")%>">

	  <input type="hidden" name="accidentCity" value="<%=request.getParameter("accidentCity")%>">
	 
	  <input type="hidden" name="accidentState" value="<%=request.getParameter("accidentState")%>">
	 
	  <input type="hidden" name="accidentZip" value="<%=request.getParameter("accidentZip")%>">
	 
	  <input type="hidden" name="claimType" value="<%=request.getParameter("claimType")%>">

      <!-- <h5>Claim Number:</h5> --><input type="hidden" name="claimNumber" value="1">
     
      <%! int i=0; %>
      
 	  <c:forEach items="${quesList }" var="qlist">
 	  
 	  <% i++; %>
 	  
 	  <table>
 	  
 	  <tr>
 	  <td><input type="hidden" name="questionId" value="${qlist.questionId }">
 	  &#8226;<input type="text" name="policyQuestion" value="${qlist.policyQuestion }" readonly>
 	  </td>
 	  </tr>
 	  
 	  
 	  <tr>
 	  <td><input type="radio" name="answt+<%=i %>"  value="${qlist.pol_Ans1_Weightage }" checked readonly>&nbsp;&nbsp;<input type="text" name="ans" value="${qlist.pol_Ans1 }" readonly></td>
 	  <td><input type="radio" name="answt+<%=i %>"  value="${qlist.pol_Ans2_Weightage }" readonly>&nbsp;&nbsp;<input type="text" name="ans" value="${qlist.pol_Ans2 }" readonly></td>
 	  <td><input type="radio" name="answt+<%=i %>" value="${qlist.pol_Ans3_Weightage }" readonly>&nbsp;&nbsp;<input type="text" name="ans" value="${qlist.pol_Ans3 }" readonly></td>
 	  </tr>
 	  
 	  <br><br>
 	  
 	  
 	  </table>
 	  <br>
 	  

  	  </c:forEach>
  	  <br><br>
  	  
  	  <script>
      function  chec()
      {
      var check=document.querySelectorAll("input[type=radio]");
      //document.getElementsByTagName("input")
      var answ=document.querySelectorAll("input[name=ans]");
      //document.getElementsByName("ans")
      var ans=0;
      
      for(var i=0;i<check.length;i++){
      
    	 // if(check[i].getAttribute('type') == 'radio')
    	  //{
    		if(check[i].checked)
    		{
    			answ[i].setAttribute("name","selected");
    	  
    			//console.log(check[i].value);
    	        ans=ans+parseInt(check[i].value)+Math.floor(Math.random()*1000);
    	        }
    	  //}
    	  }
      	//console.log(ans);
      	document.getElementsByName("claimNumber")[0].value=ans;
      }
      </script>
 	  
 	<input  class="btn btn-primary" type="button" onclick="chec();" value="Save" style="position: absolute;left:400px;">
 	
 	<input type="submit" role="button" class="btn btn-success" value="Create Claim" style="position: absolute;left:485px;">
 	
 </form> 
   </div><br><br>
    
<button style="position: absolute;right:400px;" class="btn btn-secondary" onclick="window.history.back();">Back</button>

</body>
</html>