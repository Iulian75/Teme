package Teme.DiscordHomeWork.Homework30031;

import java.util.List;

import static Teme.DiscordHomeWork.Homework30031.StringProcesser.processStrings;

public class Main {

    //-For a list of strings, create a method that filters out strings with fewer than
    // 5 characters, then converts each string to uppercase, and finally sorts them in reverse order.

    public static void main(String[] args) {
        List<String> strings = List.of("Masa", "Biliard", "Camioneta", "Tren", "masina", "elefant");

        List<String> processedStrings = processStrings(strings);

        // Print the resulting list
        System.out.println("Processed strings: " + processedStrings);
    }
}
