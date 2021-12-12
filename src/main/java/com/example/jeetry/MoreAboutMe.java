package com.example.jeetry;

public class MoreAboutMe extends MySelf implements MyVehicle
{
    public String MyPersonality;
    public String MyFavSong;
    public String MyAmbition;
    public String MyFavFood;
    public String MyFriend;

    public MoreAboutMe(String myName, String myAge, String myHobbies, String myPersonality, String myFavSong, String myAmbition, String myFavFood, String myFriend)
    {
        super(myName, myAge, myHobbies);
        MyPersonality = myPersonality;
        MyFavSong = myFavSong;
        MyAmbition = myAmbition;
        MyFavFood = myFavFood;
        MyFriend = myFriend;
    }

    public String getMyPersonality() {
        return MyPersonality;
    }

    public void setMyPersonality(String myPersonality) {
        MyPersonality = myPersonality;
    }

    public String getMyFavSong() {
        return MyFavSong;
    }

    public void setMyFavSong(String myFavSong) {
        MyFavSong = myFavSong;
    }

    public String getMyAmbition() {
        return MyAmbition;
    }

    public void setMyAmbition(String myAmbition) {
        MyAmbition = myAmbition;
    }

    public String getMyFavFood() {
        return MyFavFood;
    }

    public void setMyFavFood(String myFavFood) {
        MyFavFood = myFavFood;
    }

    public String getMyFriend() {
        return MyFriend;
    }

    public void setMyFriend(String myFriend) {
        MyFriend = myFriend;
    }

    public String PrintInfo()
    {
        String info = "";
        info += "Name: "+super.MyName+"<br>";
        info += " \nAge: "+super.MyAge+"<br>";
        info += " \nHobbies: "+super.MyHobbies+"<br>";
        info += " \nPersonality: "+MyPersonality+"<br>";
        info += " \nFavourite Song: "+MyFavSong+"<br>";
        info += " \nAmbition: "+MyAmbition+"<br>";
        info += " \nFavourite Food: "+MyFavFood+"<br>";
        info += " \nFriends Name: "+MyFriend+"<br>";
        info += " \nVehicle Type: "+MyVehicleType+"<br>";
        info += " \nVehicle Brand: "+MyeVehicleBrand+"<br>";
        info += " \nVehicle ID: "+MyVehicleID;

        return info;
    }
}
