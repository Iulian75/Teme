package Teme.Challenge6;

public class RunLengthEncoding {

    public static String encode(String input) {
        StringBuilder encodedString = new StringBuilder();

        int count = 1;
        char currentChar = input.charAt(0);


        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);


            if (nextChar == currentChar) {
                count++;
            } else {

                encodedString.append(count).append(currentChar);


                count = 1;
                currentChar = nextChar;
            }
        }


        encodedString.append(count).append(currentChar);

        return encodedString.toString();
    }
}


