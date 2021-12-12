<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/11/2021
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyStudent</title>
    <style>
        input[type=text] {
            width: 30%;
            padding: 7px 15px;
            margin: 8px 0;
            box-sizing: border-box;
            border: none;
            border: 1px solid Black;
            background-color: LightCyan;
            color: black;
        }
    </style>
</head>
<body style="background-color:Plum;">
<%@include file="Menu.html"%>

<form name="Mystudentform" method="post" action="MyStudent.jsp">
    <br/>
    <br/>
    Matric No.: <input type="text" name="myMatricNo"><br/><br/>
    Program Code: <input type="text" name="myProgramCode"><br/><br/>
    Campus: <input type="text" name="myCampus"><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%! int getMessage()
{
    int data=50;
    return data;
}
%>

<%
    String mytext = request.getParameter("myMatricNo");

    if (mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyMatricNo", request.getParameter("myMatricNo"));
        session.setAttribute("MyProgramCode", request.getParameter("myProgramCode"));
        session.setAttribute("MyCampus", request.getParameter("myCampus"));

        out.println("Session Created");
        out.println("<br/>");
        out.println("Value of the variable is:"+getMessage());
    }
%>

<h1><%= "MyStudent Page" %></h1>
<jsp:include page="MyStudentServlet"/>
</body>
</html>
