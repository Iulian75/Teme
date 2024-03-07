package Teme.DiscordHomeWork.Homework13;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {

          //Exercitiu 1
        //Create a Java program that uses a StringBuilder to concatenate an array of strings.
        // The program should print the final concatenated string. (methods: append())

//        String[] strings = {"Masina ", "este ", "noua", "!"};
//
//
//        StringBuilder stringb = new StringBuilder();
//        for (String str : strings) {
//            stringb.append(str);
//        }
//
//        System.out.println("Final str: " + stringb.toString());


        //Exercitiu 2
        //Create a class named Student with name and age fields.
        // Write a method to display the details of a student.

//        Student student1 = new Student("Marius",14);
//        student1.displayDetails();

        //Exercitiu 3
        //-Write a program that prints the current date.

//        LocalDate currentDate = LocalDate.now();
//
//        System.out.println(currentDate);

        //Exercitiu 4
        //Print the date that will be after 10 days from today.

        LocalDate currentDate = LocalDate.now();

        LocalDate dateAfter10Days = currentDate.plusDays(10);
        // Print the date after 10 days
        System.out.println(dateAfter10Days);


    }
}

