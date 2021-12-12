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
    <title>MyFamily</title>
    <style>
        input[type=text] {
            width: 30%;
            padding: 7px 15px;
            margin: 8px 0;
            box-sizing: border-box;
            border: none;
            border: 1px solid Black;
            background-color: HotPink;
            color: black;
        }
    </style>
</head>
<body style="background-color:Plum;">
<%@include file="Menu.html"%>

<form name="MyFamilyform" method="post" action="MyFamily.jsp">
    <br/>
    <br/>
    Dad's Name: <input type="text" name="myDad"><br/><br/>
    Mom's Name: <input type="text" name="myMom"><br/><br/>
    Sibling's Name: <input type="text" name="mySibling"><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%! int cube(int n)
{
    return n*n*n;
}
%>

<%
    String mytext = request.getParameter("myDad");

    if (mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyDad", request.getParameter("myDad"));
        session.setAttribute("MyMom", request.getParameter("myMom"));
        session.setAttribute("MySibling", request.getParameter("mySibling"));

        out.println("Session Created");
        out.println("<br/>");
        out.println( "Cube of 3 is:"+cube(3));
    }
%>

<h1><%= "MyFamily Page" %></h1>
<jsp:include page="MyFamilyServlet"/>
</body>
</html>
