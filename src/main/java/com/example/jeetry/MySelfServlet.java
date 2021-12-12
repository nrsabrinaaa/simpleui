package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MySelfServlet", value = "/MySelfServlet")
public class MySelfServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobbies = (String) session.getAttribute("MyHobbies");

//        MySelf mySelf = new MySelf( "Nur Sabrina" , 21, "watching drama, sleeping and playing games");

        MySelf mySelf = new MySelf(myname, myage, myhobbies);

        out.println("<html><body>");

        out.println("<h1>" +"Name : "+ mySelf.getMyName()+ "</h1>");
        out.println("<h1>" +"Age : "+ mySelf.getMyAge()+ "</h1>");
        out.println("<h1>" +"Hobbies : "+ mySelf.getMyHobbies()+ "</h1>");

        out.println(mySelf.PrintInfo());

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
