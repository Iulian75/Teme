package Teme.DiscordHomeWork.Homework18019;

public class Main {

    public static void main(String args[]) {

        //Problem Statement:
        //Design a class named Rectangle that contains:
        //
        //Two private double data fields named width and height that specify the width and height
        // of the rectangle. The default values are 1 for both width and height.

        //A no-arg constructor that creates a default rectangle.
        //A constructor that creates a rectangle with the specified width and height.

        //A method named getArea() that returns the area of this rectangle.
        //A method named getPerimeter() that returns the perimeter.


        Rectangle rectangle1 = new Rectangle(12,5.5);

        double area = rectangle1.getArea();
        System.out.println(area);

        double perimeter =rectangle1.getPerimeter();
        System.out.println(perimeter);
    }
}
