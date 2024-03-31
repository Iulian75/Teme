package Teme.Challenge6;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

}
