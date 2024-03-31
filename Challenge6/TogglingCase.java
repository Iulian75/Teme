package Teme.Challenge6;

public class TogglingCase {

    public static String toggleCase(String input) {
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                toggledString.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                toggledString.append(Character.toUpperCase(currentChar));
            } else {

                toggledString.append(currentChar);
            }
        }

        return toggledString.toString();
    }

}
