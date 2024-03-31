package Teme.Challenge6;

import java.util.List;
import java.util.Map;

import static Teme.Challenge6.AnagramChecker.areAnagrams;
//import static Teme.Challenge6.CaesarCipher.decode;
//import static Teme.Challenge6.CaesarCipher.encode;
import static Teme.Challenge6.CamelCaseToSnakeCaseConverter.convertToSnakeCase;
import static Teme.Challenge6.CharacterFrequencyCounter.countCharacterFrequency;
import static Teme.Challenge6.DuplicateCharacterRemover.removeDuplicates;
import static Teme.Challenge6.MorseCodeConverter.convertToMorseCode;
import static Teme.Challenge6.PatternRecognition.hasRepeatingPattern;
import static Teme.Challenge6.RemoveVowels.removeVowels;
import static Teme.Challenge6.RunLengthEncoding.encode;
import static Teme.Challenge6.StringConcatenation.concatenateStrings;
import static Teme.Challenge6.StringExpander.expandCompressedString;
import static Teme.Challenge6.StringInsertion.insertAtIndex;
import static Teme.Challenge6.StringInterleaver.interleaveStrings;
import static Teme.Challenge6.StringReplacement.replaceSubstring;
import static Teme.Challenge6.TogglingCase.toggleCase;
import static Teme.Challenge6.WordCapitalizer.capitalizeWords;

public class Main {

    public static void main(String args[]) {

        //Ex1
        //Reverse a String
        //Use the StringBuilder class to write a program that reverses an input string.
        // For example, the input "hello" should return "olleh".

//        String input = "hello";
//        StringBuilder sb = new StringBuilder(input);
//        sb = sb.reverse();
//        System.out.println("Reversed string: " + sb);

        //Ex2
        //Write a program that checks whether a given string is a palindrome
        // using the StringBuilder class.A palindrome
        // is a word, phrase, number, or other sequences of characters that
        // reads the same forward and backward.

//        String input = "radar";
//        boolean isPalindrome = checkPalindrome(input);
//
//        if (isPalindrome) {
//            System.out.println(input + " is a palindrome.");
//        } else {
//            System.out.println(input + " is not a palindrome.");
//        }
//    }
//
//    public static boolean checkPalindrome(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        String reversed = sb.reverse().toString();
//        return str.equals(reversed);


        //Ex3
        //Concatenate Multiple Strings
        //Description: Given a list of strings, use StringBuilder to concatenate
        // them into a single string efficiently.


//        List<String> strings = List.of("Masina ", "accelereaza ", "repede");
//        String concatenatedString = concatenateStrings(strings);
//        System.out.println(concatenatedString);


        //Ex4
        //Removing Vowels
        //Description: Create a Java program that uses the StringBuilder class to remove all
        // the vowels from an input string.

//        String input = "Masina accelereaza";
//        String result = removeVowels(input);
//        System.out.println("Original string: " + input);
//        System.out.println("String without vowels: " + result);


        //EX5
        //Word Capitalizer
        //Description: Write a program that capitalizes the first letter of every word in
        // a sentence using the StringBuilder class.

//        String sentence = "masina accelereaza.";
//        String capitalizedSentence = capitalizeWords(sentence);
//        System.out.println("Original sentence: " + sentence);
//        System.out.println("Capitalized sentence: " + capitalizedSentence);




        //Ex6
        //String Replacement
        //Description: Use the StringBuilder class to replace every occurrence of a substring
        // within a given string with another substring. For instance, replace "cat" with "dog"
        // in the string "The cat sat on the mat."

//        String originalString = "Masina accelereaza";
//        String targetSubstring = "accelereaza";
//        String replacementSubstring = "pe autostrada";
//        String replacedString = replaceSubstring(originalString, targetSubstring, replacementSubstring);
//
//        System.out.println("Original string: " + originalString);
//        System.out.println("Replaced string: " + replacedString);



        //Ex7
        //Duplicate Character Remover
        //Description: Design a program using StringBuilder that removes duplicate characters
        // from a string. For example, "balloon" should become "balon".

//        String input = "Baloon";
//        String result = removeDuplicates(input);
//
//        System.out.println("Original string: " + input);
//        System.out.println("String without duplicates: " + result);


        //Ex8
        //Inserting at Index
        //Description: Write a Java program that inserts a given string into another
        // string at a specified index using the StringBuilder class.

//        String originalString = "Masina rosie accelereaza repede ";
//        String stringToInsert = " albastra ";
//        int insertionIndex = 3;
//
//        try {
//            String modifiedString = insertAtIndex(originalString, stringToInsert, insertionIndex);
//            System.out.println("Original string: " + originalString);
//            System.out.println("String after insertion: " + modifiedString);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


        //Ex9
        //Frequency Counter
        //Description: Using StringBuilder, write a program that counts
        // the frequency of each character in a string.

//        String input = "Masina accelereaza.";
//        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);
//
//        // Print the frequency of each character
//        System.out.println("Character frequencies:");
//        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
//            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
//        }



        //Ex10
        //Morse Code Converter
        //Description: Create a program that takes in a string and converts it
        // to Morse code using the StringBuilder class. For simplicity, you can
        // assume the input string only contains alphabets and numbers.


//            String inputString = "Masina 12";
//            String morseCode = convertToMorseCode(inputString);
//
//            System.out.println("Original string: " + inputString);
//            System.out.println("Morse code: " + morseCode);


        //Ex11
        //Encode and Decode using Caesar Cipher
        //Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class.
        // The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet.
        // For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.

//        String plaintext = "A";
//        int shift = 1;
//
//
//        String encodedText = encode(plaintext, shift);
//        System.out.println("Encoded text: " + encodedText);
//
//
//        String decodedText = decode(encodedText, shift);
//        System.out.println("Decoded text: " + decodedText);


        //Ex12
        //CamelCase to Snake_case Converter
        //Description: Write a program using StringBuilder to convert a given CamelCase
        //string to snake_case. For instance, "thisIsCamelCase" would become "this_is_camel_case".


//        String camelCaseString = "thisIsCamelCase";
//        String snakeCaseString = convertToSnakeCase(camelCaseString);
//        System.out.println("CamelCase string: " + camelCaseString);
//        System.out.println("Snake_case string: " + snakeCaseString);

        //Ex13
        // Expand Compressed Strings
        //Description: Given a compressed string like "a3b2c4", expand it to "aaabbc",
        // making use of the StringBuilder class.

//        String compressedString = "a3b2c4";
//        String expandedString = expandCompressedString(compressedString);
//        System.out.println("Compressed string: " + compressedString);
//        System.out.println("Expanded string: " + expandedString);


        //Ex15
        //Anagram Checker
        //Description: Develop a program that checks if two provided strings are anagrams
        // of each other using the StringBuilder class. Anagrams are words or phrases
        // made up of the same characters.

//        String str1 = "listen";
//        String str2 = "silent";
//
//        if (areAnagrams(str1, str2)) {
//            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
//        } else {
//            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
//        }


        //Ex16
        // Toggling Case
        //Description: Design a program using StringBuilder that toggles the case of every
        // character in a given string. For example, "HelLo" should become "hELlO".


//       String inputString = "HelLo";
//        String toggledString = toggleCase(inputString);
//        System.out.println("Original string: " + inputString);
//        System.out.println("Toggled case string: " + toggledString);

        //Ex17
        // String Interleaver
        //Description: Write a program using StringBuilder that interleaves two strings.
        // For instance, given "abc" and "123", the result should be "a1b2c3".


//        String str1 = "abc";
//        String str2 = "985";
//        String interleaved = interleaveStrings(str1, str2);
//        System.out.println("Interleaved string: " + interleaved);


        //18
        //Pattern Recognition
        //Description: Design a Java program using StringBuilder that checks if a given
        // pattern repeats in a string. For instance, given the string "ababab",
        // the repeating pattern is "ab".


//        String str = "Casa";
//        boolean hasRepeatingPattern = hasRepeatingPattern(str);
//        if (hasRepeatingPattern) {
//            System.out.println("The string \"" + str + "\" has a repeating pattern.");
//        } else {
//            System.out.println("The string \"" + str + "\" does not have a repeating pattern.");
//        }



        //Ex19
        //Encode Strings with Run-Length Encoding (RLE)
        //Description: Using StringBuilder, write a program that implements the Run-Length
        // Encoding algorithm. For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

//        String inputString = "AAABBBCCDAA";
//        String encodedString = encode(inputString);
//        System.out.println("Encoded string: " + encodedString);











    }


}






































































