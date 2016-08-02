<%--
  Created by IntelliJ IDEA.
  User: Славик
  Date: 16.07.2016
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="../style.css" type="text/css" media="screen" rel="stylesheet" />
<html>
<head>
    <title>Home</title>
</head>
<body>

<div>
    <div  class="wrapper ">

        <div class="mainbody ">
            <div class="aboutcontwrapper ">
                <div class="aboutcont ">
                    <%--${pageContext.servletContext.contextPath}--%>

                    <form action="/cabinet" method="get">
                        <a href="/cabinet">Cabinet</a> <a href="/T1Servlet?command=DIRECT_USER_INFO">Direct info</a>

                        <a href="/T1Servlet?command=ORDER_SERVICE">Order service</a>
                        <a href="/T1Servlet?command=FOOT_THE_BILL">Foot the bill</a>
                        <a href="/T1Servlet?command=LOGOUT">Logout</a><br>
                        ${blocked}
                        <table border="1px solid black">
                            <tr>
                                <td>${contractH}:</td>
                                <td>${contract}</td>
                            </tr>
                            <tr>
                                <td>${balanceH}</td>
                                <td>${balance}</td>
                            </tr>
                            <tr>
                                <td>${current_serviceH}:</td>
                                <td>
                                    <c:forEach items="${current_service}" var="item">
                                        ${item.name}<br>
                                    </c:forEach>
                                </td>
                            </tr>
                            <tr>
                                <td>${fNameH}:</td>
                                <td>${fName}</td>
                            </tr>
                            <tr>
                                <td>${sNameH}:</td>
                                <td>${sName}</td>
                            </tr>
                            <tr>
                                <td>${loginH}:</td>
                                <td>${login}</td>
                            </tr>
                            <tr>
                                <td>${passwordH}:</td>
                                <td>${password}</td>
                            </tr>
                        </table>

                    </form>
                </div>
            </div>


        </div>
    </div>
</div>
</body>
</html>