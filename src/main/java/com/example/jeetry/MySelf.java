package com.example.jeetry;

public class MySelf implements MyVehicle
{
    public String MyName;
    public String MyAge;
    public String MyHobbies;

    public MySelf(String myName, String myAge, String myHobbies)
    {
        MyName = myName;
        MyAge = myAge;
        MyHobbies = myHobbies;
    }

    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public String getMyAge() {
        return MyAge;
    }

    public void setMyAge(String myAge) {
        MyAge = myAge;
    }

    public String getMyHobbies() {
        return MyHobbies;
    }

    public void setMyHobbies(String myHobbies) {
        MyHobbies = myHobbies;
    }

    public String PrintInfo()
    {
        String info = "";
        info +="Name: "+MyName+"<br>";
        info +=" \nAge: "+MyAge+"<br>";
        info +=" \nHobbies: "+MyHobbies+"<br>";
        info +=" \nVehicle Type: "+MyVehicleType+"<br>";
        info +=" \nVehicle Brand: "+MyeVehicleBrand+"<br>";
        info +=" \nVehicle ID: "+MyVehicleID;

        return info;
    }
}
