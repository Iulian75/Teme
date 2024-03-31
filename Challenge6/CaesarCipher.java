package Teme.Challenge6;

//public class CaesarCipher {

//    public static String encode(String plaintext, int shift) {
//        StringBuilder ciphertext = new StringBuilder();
//
//        for (int i = 0; i < plaintext.length(); i++) {
//            char originalChar = plaintext.charAt(i);
//
//
//            if (Character.isLetter(originalChar)) {
//                char shiftedChar = (char) (originalChar + shift);
//
//
//                if (Character.isUpperCase(originalChar) && shiftedChar > 'Z') {
//                    shiftedChar = (char) ('A' + (shiftedChar - 'Z' - 1));
//                } else if (Character.isLowerCase(originalChar) && shiftedChar > 'z') {
//                    shiftedChar = (char) ('a' + (shiftedChar - 'z' - 1));
//                }
//
//                ciphertext.append(shiftedChar);
//            } else {
//
//                ciphertext.append(originalChar);
//            }
//        }
//
//        return ciphertext.toString();
//    }
//    public static String decode(String ciphertext, int shift) {
//        // Decoding is equivalent to encoding with negative shift
//        return encode(ciphertext, -shift);
//    }
//}
