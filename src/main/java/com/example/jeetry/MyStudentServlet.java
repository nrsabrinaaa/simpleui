package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyStudentServlet", value = "/MyStudentServlet")
public class MyStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobbies = (String) session.getAttribute("MyHobbies");
        String mymatricno = (String) session.getAttribute("MyMatricNo");
        String myprogramcode = (String) session.getAttribute("MyProgramCode");
        String mycampus = (String) session.getAttribute("MyCampus");

//        MyStudent myStudent = new MyStudent("Nur Sabrina","21","watching drama, sleeping and playing games","2021155753","CS266","UiTM Jasin");

        MyStudent myStudent = new MyStudent(myname, myage, myhobbies, mymatricno, myprogramcode, mycampus);

        out.println("<html><body>");

        out.println("<h1>" +"Matric No.: "+ myStudent.getMyMatricNo()+ "</h1>");
        out.println("<h1>" +"Program Code : "+ myStudent.getMyProgramCode()+ "</h1>");
        out.println("<h1>" +"Campus : "+ myStudent.getMyCampus()+ "</h1>");

        out.println(myStudent.PrintInfo());

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
