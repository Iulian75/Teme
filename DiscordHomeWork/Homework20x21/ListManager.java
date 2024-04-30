package Teme.DiscordHomeWork.Homework20x21;

import java.util.ArrayList;

public class ListManager {

    public ArrayList<Integer> initializeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        return list;
    }
}
