package Teme.Challenge7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {


        //Ex1
        //Displaying Today's Date
        //Description: Write a method named displayTodaysDate that, when called, prints
        // the current date to the console.
        //Expected Output: Today's date in the format YYYY-MM-DD.

//        LocalDate currentDate = LocalDate.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        System.out.println("Today's date: " + currentDate.format(formatter));



        //Ex2
        //Date Decomposition
        //Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
        //Input: A date in the format YYYY-MM-DD.
        //Expected Output:
        //makefile
        //Copy code
        //Year: YYYY
        //Month: MM
        //Day: DD

//        String date = "2024-05-06";
//
//        LocalDate paraseData = LocalDate.parse(date);
//
//        int year = paraseData.getYear();
//        int month = paraseData.getMonthValue();
//        int day = paraseData.getDayOfMonth();
//
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);

        //Ex3
        //Create a Specific Date
        //Description: Write a method named createSpecificDate that returns a date
        // object representing 19th August 2025.
        //Expected Output: A date object for 2025-8-19.

//        LocalDate specificDate = LocalDate.of(2025, 8, 19);
//        System.out.println(specificDate);

        //Ex4
        //Comparing User-Entered Dates
        //Description: Write a method named areDatesEqual that reads two dates from the
        // console and returns true if they are equal, and false otherwise.
        //Input: Two dates entered by the user in the format YYYY-MM-DD.
        //Expected Output:
        //true if both dates are equal.
        //false if they are different.


//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Enter the first date (YYYY-MM-DD): ");
//        String dateString1 = scanner.nextLine();
//        LocalDate date1 = LocalDate.parse(dateString1);
//
//        System.out.print("Enter the second date (YYYY-MM-DD): ");
//        String dateString2 = scanner.nextLine();
//        LocalDate date2 = LocalDate.parse(dateString2);
//
//        if (date1.equals(date2)){
//            System.out.println("The dates are equal");
//        }else {
//            System.out.println("The date are different");
//        }

        //Ex5
        // Is Today a Specific Date?
        //Description: Write a method named isTodaySpecificDate that checks if today's date
        // is 10th December 2019.
        //Expected Output:
        //true if today's date is 2019-12-10.
        //false otherwise

//        LocalDate today = LocalDate.now();
//
//        boolean isSpecificDate = today.equals(LocalDate.of(2019,12,10) );
//
//        System.out.println("Is today 10th December 2019? " + isSpecificDate);

        //Ex6
        //Getting Current Time
        //Description: Write a method named displayCurrentTime that prints the current time to the console.
        //Expected Output: The current time in the format HH:MM:SS.

//        LocalTime currentTime = LocalTime.now();
//        System.out.println("Current Time: " + currentTime);



        //Ex7
        //Date Arithmetic
        //Description: Write a method named addWeeksToToday that accepts an integer
        // as its argument. This integer denotes the number of weeks. The method should
        // add this number of weeks to today's date and return the resultant date.
        //Input: An integer n (e.g., 4).
        //Expected Output: A date object that is n weeks from today.


//        int weeks = 1;
//
//        LocalDate today = LocalDate.now();
//
//        LocalDate afterNweeks = today.plusWeeks(weeks);
//
//        System.out.println("A date object that is n weeks from today" + afterNweeks);

        //Ex8
        //Weekday Identifier
        //Description: Construct a method named findDayOfWeek that takes in a date
        // and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
        //Input: A date in the format YYYY-MM-DD.
        //Expected Output: The day of the week in string format (e.g., "Wednesday").


//        String inpputDate = "2024-03-28";
//
//        LocalDate localDate = LocalDate.parse(inpputDate);
//
//        DayOfWeek dayOfWeek = LocalDate.EPOCH.getDayOfWeek();
//
//        System.out.println("The day of the week in string format" + dayOfWeek);


        //Ex9
        //Interval Between Dates
        //Description: Design a method titled daysBetween that reads two dates from the
        // console and computes the total number of days between them.
        //Input: Two dates given by the user in the format YYYY-MM-DD.
        //Expected Output: An integer showcasing the difference in days between the two dates.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first date (YYYY-MM-DD): ");
//        String date1 = scanner.nextLine();
//
//        System.out.print("Enter the second date (YYYY-MM-DD): ");
//        String date2 = scanner.nextLine();
//
//        LocalDate localDate1 = LocalDate.parse(date1);
//        LocalDate localDate2 = LocalDate.parse(date2);
//
//        long differenceBetwenDays = Math.abs(ChronoUnit.DAYS.between(localDate1,localDate2));
//
//        System.out.println(differenceBetwenDays);

        //Ex10
        //Date Authenticator
        //Description: Engineer a method named isValidDate that captures a date
        // string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD).
        // The method should also consider leap years when validating February dates.
        //Input: A string of a date from the console.
        //Expected Output:
        //true if the input adheres to the date format and denotes a genuine date.
        //false if otherwise.

















    }

    }


