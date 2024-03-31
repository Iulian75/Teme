package Teme.Challenge6;

public class PatternRecognition {

    public static boolean hasRepeatingPattern(String str) {
        int n = str.length();


        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String pattern = str.substring(0, len);
                StringBuilder testString = new StringBuilder();


                while (testString.length() < n) {
                    testString.append(pattern);
                }

                if (testString.toString().equals(str)) {
                    return true;
                }
            }
        }

        return false;
    }
}
