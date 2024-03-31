package Teme.Challenge6;

public class StringExpander {

    public static String expandCompressedString(String compressedString) {
        StringBuilder expandedString = new StringBuilder();

        // Iterate over each character in the compressed string
        for (int i = 0; i < compressedString.length(); i++) {
            char currentChar = compressedString.charAt(i);

            if (Character.isLetter(currentChar)) {
                expandedString.append(currentChar);
            } else {

                int count = Character.getNumericValue(currentChar);

                char previousChar = compressedString.charAt(i - 1);
                for (int j = 1; j < count; j++) {
                    expandedString.append(previousChar);
                }
            }
        }

        return expandedString.toString();
    }

}
