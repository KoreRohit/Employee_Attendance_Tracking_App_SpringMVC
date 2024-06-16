<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<style>
.control {
	width: 700px;
	height: 40px;
	border-top: none;
	border-left: none;
	border-right: none;
}
</style>
</head>
<body>
<jsp:include page="home.jsp"></jsp:include><br /> 
	<br />
	<form name="frm" action="adminlogin2" method="POST">
		<center>
			<input type="text" name="username" value="" class="control"
				placeholder="Enter Admin UserName" /><br />
			<br /> <input type="text" name="password" value="" class="control"
				placeholder="Enter Admin Password" /><br />
			<br /> <input type="submit" name="s" value="Login" class="control" /><br />
			<br /> 
			${msg}
		</center>
	</form>

</body>
</html>