package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MoreAboutMeServlet", value = "/MoreAboutMeServlet")
public class MoreAboutMeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobbies = (String) session.getAttribute("MyHobbies");
        String mypersonality= (String) session.getAttribute("MyPersonality");
        String myfavsong = (String) session.getAttribute("MyFavSong");
        String myambition = (String) session.getAttribute("MyAmbition");
        String myfavfood = (String) session.getAttribute("MyFavFood");
        String myfriend = (String) session.getAttribute("MyFriend");

//        MoreAboutMe moreAboutMe = new MoreAboutMe("Nur Sabrina","21","watching drama, sleeping and playing games","Loyalty, Openness, Feelers ","Somebody - Keshi","Software Engineering","Ikan Patin Tempoyak, Udang sambal petai","Dina, Nurin, Kak bina, Meen, Izzah, Nurin Jaslina, Hazirah, Athirah");

        MoreAboutMe moreAboutMe = new MoreAboutMe(myname, myage, myhobbies, mypersonality, myfavsong, myambition, myfavfood, myfriend);

        out.println("<html><body>");

        out.println("<h1>" +"Personality : "+ moreAboutMe.getMyPersonality()+ "</h1>");
        out.println("<h1>" +"Favorite Song : "+ moreAboutMe.getMyFavSong()+ "</h1>");
        out.println("<h1>" +"Ambition : "+ moreAboutMe.getMyAmbition()+ "</h1>");
        out.println("<h1>" +"Favorite Food : "+ moreAboutMe.getMyFavFood()+ "</h1>");
        out.println("<h1>" +"Friends: "+ moreAboutMe.getMyFriend()+ "</h1>");

        out.println(moreAboutMe.PrintInfo());

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
