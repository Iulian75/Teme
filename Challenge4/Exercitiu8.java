package Teme.Challenge4;

public class Exercitiu8 {
    public static void main(String args[]){

        int x = 4;
        int factorial = 1;

        for (int i = 1; i <= x; i++){
            factorial *= i;
        }

        System.out.println("The factorial of" + x + "is:" + factorial);
    }
}
