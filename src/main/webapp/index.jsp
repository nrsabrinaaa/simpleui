<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        dialog {text-shadow: 0 0 3px cyan, 0 0 5px darkcyan;
            background-color: Aquamarine;
            box-shadow: 10px 10px 5px grey;}
        div {text-align: center;}
        body {background-image: url(sunset.jpg);}
    </style>
    <meta charset="UTF-8">
</head>
<body>
<%@include file="Menu.html"%>
<br/>
<dialog open><%= "Hai! my name is " + session.getAttribute("MyName")%> &#128151;
</dialog>
<br/>
<br/>
<br/>
<br/>
<br/>
<div>
    <a href="hello-servlet">Hello Servlet</a>&ensp;
    <a href="MySelfServlet">MySelf Servlet</a>&ensp;
    <a href="MyFamilyServlet">MyFamilyServlet</a>&ensp;
    <a href="MyStudentServlet">MyStudent Servlet</a>&ensp;
    <a href="MoreAboutMeServlet">More About Me Servlet</a>
</div>
<br/>
<br/>
<br/>
<audio controls>
    <source src="EasyOnMe.mp3" type="audio/mpeg">
    Your browser does not support the audio element.
</audio>
</body>
</html>