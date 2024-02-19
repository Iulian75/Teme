package Teme.Challenge4;

public class Exercitiu17 {
    public static void main(String args[]){

        boolean hasUsername = true;
        boolean hasPassword = true;

        if (hasUsername && hasPassword){
            System.out.println("Success");     //daca ambele sunt adevarate ok
        } else if (!hasPassword || !hasUsername){
            System.out.println("Failed");      //daca una dintre ele este falsa
        }else if (hasUsername && !hasPassword){
            System.out.println("Password incorect");  //daca parola este falsa
        }

    }
}
