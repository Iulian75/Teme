package Teme.Challenge6;

public class StringInterleaver {

    public static String interleaveStrings(String str1, String str2) {
        StringBuilder interleaved = new StringBuilder();

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            interleaved.append(str1.charAt(i)).append(str2.charAt(i));
        }

        if (str1.length() > minLength) {
            interleaved.append(str1.substring(minLength));
        } else if (str2.length() > minLength) {
            interleaved.append(str2.substring(minLength));
        }

        return interleaved.toString();
    }
}
