package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyFamilyServlet", value = "/MyFamilyServlet")
public class MyFamilyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobbies = (String) session.getAttribute("MyHobbies");
        String mydad = (String) session.getAttribute("MyDad");
        String mymom = (String) session.getAttribute("MyMom");
        String mysibling = (String) session.getAttribute("MySibling");

//        MyFamily myFamily = new MyFamily("Nur Sabrina","21","watching drama, sleeping and playing games","Muhamad Sabri Bin Muhamad","Fauziah Darwis", "Syafiq, Syafiqah, Syahmi, Syairazy");

        MyFamily myFamily = new MyFamily(myname, myage, myhobbies, mydad, mymom, mysibling);

        out.println("<html><body>");

        out.println("<h1>" +"Dad : "+ myFamily.getMyDad()+ "</h1>");
        out.println("<h1>" +"Mom : "+ myFamily.getMyMom()+ "</h1>");
        out.println("<h1>" +"Siblings : "+ myFamily.getMySiblings()+ "</h1>");

        out.println(myFamily.PrintInfo());

        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
