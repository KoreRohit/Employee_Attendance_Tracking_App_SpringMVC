<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee All Profie</title>
    <link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
    <style>
    .table{
    	margin:auto;
            margin-top: 100px;
            width: 700px;
            height: auto;
            border: 2px solid black;
            box-shadow: 4px 4px 5px black;
    }
    .table tr td{
    border: 2px solid black;
     text-align: center;
    }
    
    </style>
</head>
<body>
    <%-- <jsp:include page="home.jsp" /> --%>

    <div id="grid" class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">UserName</th>
                    <th scope="col">Password</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone</th>
                    <th scope="col">Date</th>
                    <th scope="col">InTime</th>
                    <th scope="col">OutTime</th>
                </tr>
            </thead>
            <tbody>
                   <c:forEach var="s" items="${regservice}">
                    <tr>
                        <td>${s.registeration.pid}</td>
                        <td>${s.registeration.username}</td>
                        <td>${s.registeration.password}</td>
                        <td>${s.registeration.email}</td>
                        <td>${s.registeration.phone}</td>
                        <td>${s.dateModel.date}</td>
                        <td>${s.dateModel.intime}</td>
                        <td>${s.dateModel.outtime}</td>
                    </tr>
                </c:forEach>
               
            </tbody>
        </table>
    </div>
</body>
</html>
