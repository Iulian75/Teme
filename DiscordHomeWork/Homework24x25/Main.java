package Teme.DiscordHomeWork.Homework24x25;

import static Teme.DiscordHomeWork.Homework24x25.DayMessage.printDayMessage;

public class Main {

    public static void main(String args[]) {

        //-Create a method that takes a Day enum as a parameter and uses a switch case
        // statement to print a message depending on the day input.


            printDayMessage(DayMessage.Day.MONDAY);
            printDayMessage(DayMessage.Day.valueOf("WEDNESDAY"));
        }
}


