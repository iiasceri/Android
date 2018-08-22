package com.androidtutz.anushka.puremvpdemo;

/**
 * Created by K. A. ANUSHKA MADUSANKA on 3/25/2018.
 */

public interface WelcomeContract {


    interface View{

        void showWelcomeMessage(String welcomeMessage);


    }

    interface Model{

        void setDetails(String firstName,String lastName);

        String getWelcomeMessage();


    }


    interface Presenter{



        void loadWelcomeMessage();

        void submitName(String firstName,String lastName);




    }











}
