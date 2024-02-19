package Teme.Challenge4;

public class Exercitiu7 {
    public static void main(String args[]){

        int sideOne = 12;
        int sideTwo = 20;
        int sideThree = 6;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" : "Scalene";

        System.out.println("The triangle is:" + triangleType);

    }
}
