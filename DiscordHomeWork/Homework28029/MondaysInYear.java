package Teme.DiscordHomeWork.Homework28029;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MondaysInYear {

    public static List<LocalDate> getAllMondays(int year) {
        List<LocalDate> mondays = new ArrayList<>();
        LocalDate date = LocalDate.of(year, 1, 1);


        while (date.getDayOfWeek() != DayOfWeek.MONDAY) {
            date = date.plusDays(1);
        }


        while (date.getYear() == year) {
            mondays.add(date);
            date = date.plusWeeks(1);
        }

        return mondays;
    }
}
