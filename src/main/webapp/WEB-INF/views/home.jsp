<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
        	
        .navbar{
        	padding:20px;
        	border:2px solid white;
        }
        .navbar li a{
        	
        	
        }
        .navbar li a:hover{
        	background-color:red;
        	border-radius:5px;
        }
        
        </style>
        <link rel="stylesheet" href="<c:url value="/resources/style.css"/>"/>
    </head>
    <body>
        
        <ul class="navbar">
        	<li><a href='login1'>User-Login</a></li>
        	<li><a href='adminlogin1'>Admin-Login</a></li>
        
        </ul>
    </body>
</html>
