<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-Out</title>
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
	<form name="frm" action="saveDate1" method="POST">
        <input type="submit" name="signOut" value="Sign out"/>
    </form>
</div>
</body>
</html>