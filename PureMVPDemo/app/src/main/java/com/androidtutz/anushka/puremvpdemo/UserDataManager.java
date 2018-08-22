package com.androidtutz.anushka.puremvpdemo;

/**
 * Created by K. A. ANUSHKA MADUSANKA on 3/25/2018.
 */

public class UserDataManager implements WelcomeContract.Model{


    private User user;



    public UserDataManager() {
    }

    @Override
    public void setDetails(String firstName, String lastName) {

        user=new User(firstName,lastName);

    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome "+user.getFirstName()+" "+user.getLastName();
    }
}
