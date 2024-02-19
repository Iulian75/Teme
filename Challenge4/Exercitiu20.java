package Teme.Challenge4;

public class Exercitiu20 {
    public static void main(String args[]){
        int a= 15;
        int b= 25;
        int c= 35;

        int largestNumber= (a>b) ? ((a>c) ? a:c) : ((b>c) ? b : c);

        System.out.println(largestNumber);
    }
}
