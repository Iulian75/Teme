package Teme.DiscordHomeWork.Homework26x27;

public class Main {

    public static void main(String args[]) {

        //-Create a generic class Box<T> that can store a single item of any type. Implement methods
        // to set and get the item from the box.

        //-Design a Movie class with attributes like title, genre, and a list of ratings.
        // Create a method that retrieve the average rating for any movie.

        //EX1:

        Box<Integer> intBox = new Box<>();

        intBox.setItem(75);

        System.out.println(intBox.getItem());


        Box<String> strBox = new Box<>();

        strBox.setItem("Masina");

        System.out.println(strBox.getItem());


        //EX2:

        Movie movie = new Movie("Bordea", "Comedie");


        movie.addRating(5.0);
        movie.addRating(4.0);
        movie.addRating(4.5);


        System.out.println(movie.getAverageRating());
        System.out.println(movie.title);










    }
}
