package Teme.Challenge6;

import java.util.List;

public class StringConcatenation {

    public static String concatenateStrings(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : strings) {
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }
}
