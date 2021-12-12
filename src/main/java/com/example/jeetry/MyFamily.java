package com.example.jeetry;

public class MyFamily extends MySelf implements MyVehicle
{
    public String MyDad;
    public String MyMom;
    public String MySiblings;

    public MyFamily(String myName, String myAge, String myHobbies, String myDad, String myMom, String mySiblings)
    {
        super(myName, myAge, myHobbies);
        MyDad = myDad;
        MyMom = myMom;
        MySiblings = mySiblings;
    }

    public String getMyDad() {
        return MyDad;
    }

    public void setMyDad(String myDad) {
        MyDad = myDad;
    }

    public String getMyMom() {
        return MyMom;
    }

    public void setMyMom(String myMom) {
        MyMom = myMom;
    }

    public String getMySiblings() {
        return MySiblings;
    }

    public void setMySiblings(String mySiblings) {
        MySiblings = mySiblings;
    }

    public String PrintInfo()
    {
        String info = "";
        info += "Name: "+super.MyName+"<br>";
        info += " \nAge: "+super.MyAge+"<br>";
        info += " \nHobbies: "+super.MyHobbies+"<br>";
        info += " \nDad Name: "+MyDad+"<br>";
        info += " \nMom Name: "+MyMom+"<br>";
        info += " \nSiblings Name: "+MySiblings+"<br>";
        info += " \nVehicle Type: "+MyVehicleType+"<br>";
        info += " \nVehicle Brand: "+MyeVehicleBrand+"<br>";
        info += " \nVehicle ID: "+MyVehicleID;

        return info;
    }
}
