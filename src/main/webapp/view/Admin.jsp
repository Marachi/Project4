<%--
  Created by IntelliJ IDEA.
  User: Potaychuk Sviatoslav
  Date: 27.07.2016
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="../style.css" type="text/css" media="screen" rel="stylesheet" />
<html>
<head>
    <title>admin</title>
</head>
<div>
    <div  class="wrapper ">
        <div class="mainbody ">
            <div class="aboutcontwrapper ">
                <div class="aboutcont ">
                    <a href="/T1Servlet?command=LOGOUT">Logout</a>
                    <form action="/secure/Controller" method="get">
                        <input type="submit" name="command" value="show subs">
                    </form>
                    <form action="/secure/Controller2" method="get">
                        <input type="submit" name="command" value="show services">
                    </form>
                    <form action="/secure/CreateService">
                        <input type="submit" name="command" value="new service">
                    </form>
                    <%--<table>--%>
                    <%--<tr><th>Name</th><TH>Price</TH></tr>--%>
                    <%--<c:forEach var="service" items="${users}"   varStatus="status">--%>
                    <%--<tr>--%>
                    <%--<td>${service.contract}</td>--%>
                    <%--</tr>--%>
                    <%--</c:forEach>--%>
                    <%--&lt;%&ndash;<a href="/T1Servlet?command=SAVE_NEW_INFO">Save info</a>&ndash;%&gt;--%>
                    <%--</table>--%>
                    </body>
                </div>
            </div>
        </div>
    </div>
</div>

</html>
