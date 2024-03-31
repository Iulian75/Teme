package Teme.Challenge6;

public class RemoveVowels {

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        String lowercaseInput = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = lowercaseInput.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {

                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}
