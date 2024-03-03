package Teme.DiscordHomeWork.Homework10;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

//        for (int i = 1; i <= 1000; i++) {
//            if (i == 10) {
//                System.out.println("Indexul este 10.");
//            } else if (i == 100) {
//                System.out.println("Indexul este 100.");
//            } else if (i == 900) {
//                System.out.println("Indexul este 900.");
//            }
//        }
//    }
        // Exercitiu 2

//        int index = 1;
//        while (index <= 1000) {
//            if (index == 10) {
//                System.out.println("Indexul este 10.");
//            } else if (index == 100) {
//                System.out.println("Indexul este 100.");
//            } else if (index == 900) {
//                System.out.println("Indexul este 900.");
//            }
//            index++;
//        }


//        int index = 1;
//        do {
//            if (index == 10) {
//                System.out.println("Indexul este 10.");
//            } else if (index == 100) {
//                System.out.println("Indexul este 100.");
//            } else if (index == 900) {
//                System.out.println("Indexul este 900.");
//            }
//            index++;
//        } while (index <= 1000);


        //Exercitiu 3

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        switch (numar) {
            case 1:
                System.out.println("Numarul este 1.");
                break;
            case 2:
                System.out.println("Numarul este 2.");
                break;
            default:
                if (numar > 100) {
                    System.out.println("Numarul este mai mare decat 100.");
                }
                break;
        }
    }
}






