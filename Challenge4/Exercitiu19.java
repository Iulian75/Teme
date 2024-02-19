package Teme.Challenge4;

public class Exercitiu19 {
    public static void main(String args[]){

        int age = 30;

        String category = (age < 12) ? "Child" :
                (age >=12 && age <=17) ? "Teenager" :
                        (age >= 18 && age <= 64) ? "Adult" : "Senior";

        System.out.println(category);


    }
}
