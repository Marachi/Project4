<%--
  Created by IntelliJ IDEA.
  User: Potaychuk Sviatoslav
  Date: 27.07.2016
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="../../style.css" type="text/css" media="screen" rel="stylesheet" />
<html>
<head>
    <title>admin</title>
</head>
<div>
    <div  class="wrapper ">
        <div class="mainbody ">
            <div class="aboutcontwrapper ">
                <div class="aboutcont ">
                    <form action="/Controller" method="post">
                        <input type="submit" value="${logout}">
                        <input type="hidden" name="command" value="LOGOUT">
                    </form>
                    <form action="/Controller" method="post">
                        <input type="submit" value="${showSubs}">
                        <input type="hidden" name="command" value="SERVICE_SUBSCRIBERS">
                    </form>
                    <form action="/Controller" method="post">
                        <input type="submit" value="${showServices}">
                        <input type="hidden" name="command" value="SERVICE_SERVICES">
                    </form>
                    <%--<form action="/Controller" method="post">--%>
                        <%--<input type="submit" value="${createService}">--%>
                        <%--<input type="hidden" name="command" value="SERVICE_CREATE_NEW">--%>
                    <%--</form>--%>
                    </body>
                </div>
            </div>
        </div>
    </div>
</div>

</html>
