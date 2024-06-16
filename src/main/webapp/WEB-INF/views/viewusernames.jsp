<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Usernames</title>
    <link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
    <style>
    .table{
    		margin:auto;
            margin-top: 100px;
            width: 200px;
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
                    
                    <th scope="col">UserName</th>
                   
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${regservice}">
                    <tr>
                   
                        <td><a href="view/${s.getPid() }">${s.getUsername()}</a></td>
                       
                        <%-- <td>
                            <a href="updateprofile?pid=${s.pid}&name=${s.name}&email=${s.email}&contact=${s.contact}&address=${s.address}&qual=${s.qual}">
                                <img src="<c:url value="/resources/images/update.png"/>"/>
                            </a>
                            <a href="delete?pid=${s.pid}">
                                <img src="<c:url value="/resources/images/delete.png"/>"/>
                            </a>
                        </td> --%>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
