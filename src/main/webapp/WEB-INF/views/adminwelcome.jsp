<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Welcome</title>
<style>
.ctrl{
	border:2px solid black;
	width:200px;
	height:350px;
	margin-left:400px;
	margin-top:90px;
	padding:50px;
}
.ctrl input{
	width:100px;
	height:40px;
	
}

</style>
</head>
<body>
<div class="ctrl">
	<h1>welcome admin</h1>
	<form name="frm" action="viewusername" method="GET">
	<input type="submit" name="s" value="view users">
	</form>
	<!-- <h1>specific user data</h1>
	<form name="frm" action="specificuserdata" method="GET">
	<input type="submit" name="s" value="view users">
	</form> -->
</div>	
</body>
</html>