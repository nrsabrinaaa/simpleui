<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 17/11/2021
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MoreAboutMe</title>
    <style>
        input[type=text] {
            width: 30%;
            padding: 7px 15px;
            margin: 8px 0;
            box-sizing: border-box;
            border: none;
            border: 1px solid Black;
            background-color: MediumAquaMarine;
            color: black;
        }
    </style>
</head>
<body style="background-color:Plum;">
<%@include file="Menu.html"%>

<form name="Moreaboutmeform" method="post" action="MoreAboutMe.jsp">
    <br/>
    <br/>
    Personality: <input type="text" name="myPersonality"><br/><br/>
    Favorite Songs: <input type="text" name="myFavSong"><br/><br/>
    Ambition: <input type="text" name="myAmbition"><br/><br/>
    Favorite Food: <input type="text" name="myFavFood"><br/><br/>
    Friend's Name: <input type="text" name="myFriend"><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%! int getMessage ()
{
    int num1=10;
    int num2=40;
    int sum = num1+num2;

    return sum;
}
%>

<%
    String mytext = request.getParameter("myPersonality");

    if (mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyPersonality", request.getParameter("myPersonality"));
        session.setAttribute("MyFavSong", request.getParameter("myFavSong"));
        session.setAttribute("MyAmbition", request.getParameter("myAmbition"));
        session.setAttribute("MyFavFood", request.getParameter("myFavFood"));
        session.setAttribute("MyFriend", request.getParameter("myFriend"));

        out.println("Session Created");
        out.println("<br/>");
        out.println("Scriplet Number is " +getMessage());
    }
%>

<h1><%= "More About Me Page" %></h1>
<jsp:include page="MoreAboutMeServlet"/>
</body>
</html>
