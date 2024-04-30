package Teme.DiscordHomeWork.Homework24x25;

public class DayMessage {

    public enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }




}
