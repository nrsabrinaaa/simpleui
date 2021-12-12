package com.example.jeetry;

public class MyStudent extends MySelf implements MyVehicle
{
    public String MyMatricNo;
    public String MyProgramCode;
    public String MyCampus;

    public MyStudent(String myName, String myAge, String myHobbies, String myMatricNo, String myProgramCode, String myCampus)
    {
        super(myName, myAge, myHobbies);
        MyMatricNo = myMatricNo;
        MyProgramCode = myProgramCode;
        MyCampus = myCampus;
    }

    public String getMyMatricNo() {
        return MyMatricNo;
    }

    public void setMyMatricNo(String myMatricNo) {
        MyMatricNo = myMatricNo;
    }

    public String getMyProgramCode() {
        return MyProgramCode;
    }

    public void setMyProgramCode(String myProgramCode) {
        MyProgramCode = myProgramCode;
    }

    public String getMyCampus() {
        return MyCampus;
    }

    public void setMyCampus(String myCampus) {
        MyCampus = myCampus;
    }

    public String PrintInfo()
    {
        String info = "";
        info += "Name: "+super.MyName+"<br>";
        info += " \nAge: "+super.MyAge+"<br>";
        info += " \nHobbies: "+super.MyHobbies+"<br>";
        info += " \nMatric No.: "+MyMatricNo+"<br>";
        info += " \nProgram Code: "+MyProgramCode+"<br>";
        info += " \nCampus: "+MyCampus+"<br>";
        info += " \nVehicle Type: "+MyVehicleType+"<br>";
        info += " \nVehicle Brand: "+MyeVehicleBrand+"<br>";
        info += " \nVehicle ID: "+MyVehicleID;

        return info;
    }
}
