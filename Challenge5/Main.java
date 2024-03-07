package Teme.Challenge5;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //Write a Java program that takes an integer as input.
        // If the number is even, print "Even". If it's odd, print "Odd".

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("integer: ");
//        int number = scanner.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }


        //Exercitiu 2
        //Write a program that asks the user to enter a number between 1 and 12.
        // Print the name of the corresponding month or "Invalid Month" if out of range.


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 12: ");
//        int monthNumber = scanner.nextInt();
//
//        String monthName;
//
//        switch (monthNumber) {
//            case 1:
//                monthName = "January";
//                break;
//            case 2:
//                monthName = "February";
//                break;
//            case 3:
//                monthName = "March";
//                break;
//            case 4:
//                monthName = "April";
//                break;
//            case 5:
//                monthName = "May";
//                break;
//            case 6:
//                monthName = "June";
//                break;
//            case 7:
//                monthName = "July";
//                break;
//            case 8:
//                monthName = "August";
//                break;
//            case 9:
//                monthName = "September";
//                break;
//            case 10:
//                monthName = "October";
//                break;
//            case 11:
//                monthName = "November";
//                break;
//            case 12:
//                monthName = "December";
//                break;
//            default:
//                monthName = "Invalid Month";
//        }
//
//        System.out.println("Number corespond with month: " + monthName);


        //Exercitiul 3
        //Given an array of integers,
        //write a program to count and print the number of negative integers in the array.

//        int[] array = {5, -3, 0, -8, 10, -2, 7};
//
//        int sum = 0;
//
//        for (int num : array) {
//            if (num < 0) {
//                sum++;
//            }
//        }
//
//        System.out.println("Sum of negative numbers: " + sum);


        //Exercitiul 4     ???
        // Ask the user to enter a string. Print the reversed version of this string.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String originalStr = scanner.nextLine();
//
//        String reversedStr = reverseString(originalStr);
//
//        System.out.println("Reversed string: " + reversedStr);
//
//    }
//
//    public static String reverseString(String str) {        //intellij
//        return new StringBuilder(str).reverse().toString();


        //Exercitiu 5     ???
        //Write a program that generates and prints the first n numbers of the Fibonacci series,
        // where n is provided by the user.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Fibonacci number:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//
//    }
//
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//}

        //Exercitiu 6
//Write a program that asks the user to enter numbers.
// The program should continue prompting the user until they enter -1.
// After they enter -1, print the sum of all numbers entered (excluding -1).

//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        int number;
//
//        System.out.println("Enter numbers (enter -1 to stop):");
//        do {
//            System.out.print("Enter a number: ");
//            number = scanner.nextInt();
//
//            if (number != -1) {
//                sum += number;
//            }
//        } while (number != -1);
//
//        System.out.println("Sum of numbers entered (excluding -1): " + sum);
//
//    }
//}

        //Exercitiu 7
        //Create a program where the user is prompted to guess a predefined number.
        // After each guess, the program should inform the user if the guess is too high or too low.
        // The program should keep prompting the user until they guess correctly. Using a do-while loop,
        // ensure the user is always asked at least once.

//        Scanner scanner = new Scanner(System.in);
//
//        int secretNumber = 27;
//        int guess;
//
//        do {
//            System.out.print("Enter your guess: ");
//            guess = scanner.nextInt();
//
//            if (guess < secretNumber) {
//                System.out.println("Too low! Try again.");
//            } else if (guess > secretNumber) {
//                System.out.println("Too high! Try again.");
//            } else {
//                System.out.println("Congratulations! You guessed the number: " + secretNumber);
//            }
//        } while (guess != secretNumber);

        //Exercitiu 8
        //Write a program that prints the first 10 numbers
        // in the Fibonacci series. Use a for loop to accomplish this.


//        int n = 10;
//
//        System.out.println("First " + n + " numbers in the Fibonacci numbers:");
//        int a = 0, b = 1;
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;

        //Exercitiu 9
        //Given an array of integers, write a program that prints each number in the array followed by
        // "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.

//        int[] numbers = {3, 8, 9, 12, 17};
//
//        for (int number : numbers) {
//
//            String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
//
//            System.out.println(number + " is " + evenOrOdd);
//        }

        //Exercitiu 10
//        Create a menu-driven program where the user is presented with options:
//
//        Print "Hello World"
//        Print the user's name.
//        Exit.
//        Based on the user's input, perform the necessary action.
//        Once an action is completed, show the menu again, unless the user chooses the Exit option.
//        Use jump statements to control the flow of the program.

//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (true) {
//
//            System.out.println("Menu:");
//            System.out.println("1. Print Hello World");
//            System.out.println("2. Print your name");
//            System.out.println("3. Exit");
//            System.out.print("Enter your choice: ");
//
//
//            int variable = scanner.nextInt();
//
//
//            switch (variable) {
//                case 1:
//                    System.out.println("Hello World");
//                    break;
//                case 2:
//                    if (name.isEmpty()) {
//                        System.out.print("Enter your name: ");
//                        name = scanner.next();
//                    }
//                    System.out.println("Your name is: " + name);
//                    break;
//                case 3:
//                    System.out.println("Exiting...");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Invalid choice");
//
//            }
//        }

               //Exercitiu11
        //Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
        // If the user enters 0, break out of the input loop and then print the average of the numbers
        // entered so far.

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//
//        while (true) {
//            System.out.print("Enter a number (0=stop): ");
//            int number = scanner.nextInt();
//
//
//            if (number == 0) {
//                break;
//            }
//            sum += number;
//            count++;
//
//        }
//        double average = (double) sum / count;
//        System.out.println("Suma numerelor: " + average);


        //Exercitiu12
        //Create a program that asks the user for 10 numbers.
        // Print the sum of all numbers that are greater than 5.
        // If the user enters a number less than or equal to 5, use the continue statement to skip
        // the addition for that number.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number <= 5) {
                continue;
            }
            sum += number;
        }

        System.out.println("Sum of numbers > 5: " + sum);

    }
}















