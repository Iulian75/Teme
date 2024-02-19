package Teme.Challenge4;

public class Exercitiu21 {
    public static void main(String args[]){

        double score = 75.5;

        String grade= (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                                (score >= 60) ? "D" : "F";

                System.out.println(grade); //printeaza nota
    }
}
