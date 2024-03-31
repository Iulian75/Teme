package Teme.Challenge6;

public class StringReplacement {

    public static String replaceSubstring(String original, String target, String replacement) {
        StringBuilder result = new StringBuilder();
        int lastIndex = 0;
        int startIndex;

        // Find and replace all occurrences of the target substring
        while ((startIndex = original.indexOf(target, lastIndex)) != -1) {
            // Append the part of the original string before the target substring
            result.append(original, lastIndex, startIndex);

            // Append the replacement substring
            result.append(replacement);

            // Move the lastIndex to the end of the target substring
            lastIndex = startIndex + target.length();
        }

        // Append the remaining part of the original string
        result.append(original, lastIndex, original.length());

        return result.toString();
    }
}
