<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/11/2021
  Time: 5:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MySelf</title>
    <style>
        input[type=text] {
            width: 30%;
            padding: 7px 15px;
            margin: 8px 0;
            box-sizing: border-box;
            border: none;
            border: 1px solid Black;
            background-color:Aquamarine;
            color: black;
        }
    </style>
</head>
<body style="background-color:Plum;">

<%@include file="Menu.html"%>

<form name="Myselfform" method="post" action="Myself.jsp">
    <br/>
    <br/>
    Name: <input type="text" name="myName"><br/><br/>
    Age: <input type="text" name="myAge"><br/><br/>
    Hobbies: <input type="text" name="myHobbies"><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%! String getMessage ()
    {
        return "Session Created in declaration";
    }
%>

<%
    String mytext = request.getParameter("myName");

    if (mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyName", request.getParameter("myName"));
        session.setAttribute("MyAge", request.getParameter("myAge"));
        session.setAttribute("MyHobbies", request.getParameter("myHobbies"));

        out.println(getMessage());
    }
%>

<h1><%= "MySelf Page" %></h1>

<h2><%="This is me, sabrina"%></h2>
<img src="sabrina.png" alt="sabrina" width="473" height="528">

<jsp:include page="MySelfServlet"/>

</body>
</html>
