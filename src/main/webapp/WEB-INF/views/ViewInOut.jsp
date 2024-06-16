<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Profiles</title>
    <link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
    <style>
    .table{
    	margin:auto;
            margin-top: 100px;
            width: 576px;
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

    <div id="grid" class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Date</th>
                    <th scope="col">InTime</th>
                    <th scope="col">OutTime</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${regservice}">
                    <tr>
                        <td>${s.getDate()}</td>
                        <td>${s.getIntime()}</td>
                        <td>${s.getOuttime()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
