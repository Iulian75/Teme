package Teme.DiscordHomeWork.Homework20x21;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        //-Create a class named ListManager. In this class, create a method named initializeList
        // which takes no parameters and returns an ArrayList of integers. The method should create
        // an ArrayList, add the integers 1 to 5 to the list, and then return the list.


        ListManager listaM = new ListManager();

        ArrayList<Integer> mylist = listaM.initializeList();

        System.out.println(mylist);

    }
}
