<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeration page</title>
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
	<%-- <jsp:include page="home.jsp"></jsp:include><br /> --%>
	<br />
	<form name="frm" action="save" method="POST">
		<center>
			<input type="text" name="username" value="" class="control"
				placeholder="Enter UserName" /><br />
			<br /> <input type="text" name="password" value="" class="control"
				placeholder="Enter Password" /><br />
			<br /> <input type="text" name="email" value="" class="control"
				placeholder="Enter Email" /><br />
			<br /> <input type="text" name="phone" value="" class="control"
				placeholder="Enter Phone" /><br />
			<br /> <input type="submit" name="s" value="Register" class="control" /><br /><br />
				Allready Registered <a href='login1'>LoginHere</a>
			${msg}
		</center>
	</form>

</body>
</html>