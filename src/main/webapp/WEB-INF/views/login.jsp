<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<form name="frm" action="logindata" method="POST">
		<center>
			<input type="text" name="username" value="" class="control"
				placeholder="Enter UserName" /><br />
			<br /> <input type="text" name="password" value="" class="control"
				placeholder="Enter Password" /><br />
			<br /> <input type="submit" name="s" value="Login" class="control" /><br />
			<br />don't have an account <a href='createNewRecord'>Register here</a>
			${msg}
		</center>
	</form>

</body>
</html>