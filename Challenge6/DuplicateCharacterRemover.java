package Teme.Challenge6;

public class DuplicateCharacterRemover {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();

        boolean[] encountered = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (!encountered[currentChar]) {
                result.append(currentChar);

                encountered[currentChar] = true;
            }
        }

        return result.toString();
    }
}




