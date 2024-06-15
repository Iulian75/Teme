package Teme.DiscordHomeWork.Homework28029;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import static Teme.DiscordHomeWork.Homework28029.MondaysInYear.getAllMondays;

public class Main {
    //-Using Java's built-in date/time libraries, generate a list of all Mondays in the
    // upcoming year. Print out each Monday's date.

    public static void main(String[] args) {
        int nextYear = Year.now().getValue() + 1;
        List<LocalDate> mondays = getAllMondays(nextYear);

        System.out.println("All Mondays in " + nextYear + ":");
        for (LocalDate monday : mondays) {
            System.out.println(monday);
        }
    }


}
