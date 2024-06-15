package Teme.DiscordHomeWork.Homework30031;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcesser {

    public static List<String> processStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() >= 5) // S cu mai putin de 5 caractere
                .map(String::toUpperCase) // Uppercase
                .sorted(Comparator.reverseOrder()) // Sortare inversa
                .collect(Collectors.toList()); //convertire in lista
    }
}
