<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <title>A simple calculator</title>
  
      <link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
  <div id="clouds">
	<div class="cloud x1"></div>
	<!-- Time for multiple clouds to dance around -->
	<div class="cloud x2"></div>
	<div class="cloud x3"></div>
	<div class="cloud x4"></div>
	<div class="cloud x5"></div>
</div>

 <div class="container">

      <div id="login">

        <form method="get" action="Servletcontroller">

          <fieldset class="clearfix">
            <p><span class="fa fa-hand-o-right" style="font-size:36px;color:pink"></span><input type="number"  name="a" value="a"  required></p> 
            <p><span class="fa fa-calculator" style="font-size:36px;color:pink"></span>  
			<select name ="operation">
  				<option value="Add">Add</option>
				<option value="Subtract">Subtract</option>
				<option value="Multiply">Multiply</option>
				<option value="Divide">Divide</option>
			</select></p> 																				</select></p> 
			<p><span class="fa fa-hand-o-right" style="font-size:36px;color:pink"></span><input type="number"  name="b" value="b"  required></p> 	
            <p><input type="submit" value="Calculate"></p>
          </fieldset>
         

        </form>
        <%
        
        Object value=request.getAttribute("answer"); 
        	 //ans=request.getattribute("answer");
        
        	%>
      <p id="ans"><span class="fa fa-smile-o" style="font-size:36px;color:pink"></span><input type="text" name="answer" value=<%=value%>> </p>	
    </div>
    </div>
  
</body>
</html>
    
