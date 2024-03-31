package Teme.Challenge6;

public class StringInsertion {

    public static String insertAtIndex(String original, String toInsert, int index) {
        if (index < 0 || index > original.length()) {
            throw new IllegalArgumentException("Index is out of bounds");
        }

        StringBuilder result = new StringBuilder(original);

        result.insert(index, toInsert);

        return result.toString();
    }
}
