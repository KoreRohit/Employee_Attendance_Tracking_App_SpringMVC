<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
.ctrl{
	border:2px solid black;
	width:200px;
	height:350px;
	margin-left:400px;
	margin-top:90px;
	padding:40px;
}
.ctrl input{
	width:100px;
	height:40px;
	
}

</style>
</head>
<body>
<div class="ctrl">
    <h1>Welcome User</h1>
    <p>Today Date and Time: <%= new java.util.Date() %></p> <!-- Display current date and time -->
    <form name="frm" action="saveDate" method="POST">
        <input type="submit" name="signIn" value="Sign in"/><br/><br/>
    </form>
    <form name="frm" action="viewinout" method="GET">
        <input type="submit" name="V" value="View Report"/><br/><br/>
    </form>
</div>
</body>
</html>
