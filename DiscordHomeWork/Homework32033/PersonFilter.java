package Teme.DiscordHomeWork.Homework32033;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {

    public static List<String> filterAndSortPersons(List<Person> persons) {
        return persons.stream()
                .filter(p -> p.getAge() >= 18 && !p.getCity().equalsIgnoreCase("Metropolis"))
                .map(Person::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
