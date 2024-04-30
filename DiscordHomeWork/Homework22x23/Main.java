package Teme.DiscordHomeWork.Homework22x23;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {

       // Finding Common Entries in Two HashMap
        // Create a class named HashMapComplex. In this class, create a method named getCommonEntries
        // which takes two HashMaps both with String keys and Integer values as parameters.
        // The method should return a new HashMap containing only the entries that exist in
        // both input maps (i.e., the keys are present in both maps and associated with the same values
        // in both maps).


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("D", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 1);
        map2.put("B", 5);
        map2.put("D", 3);


        HashMapComplex hashMapComplex = new HashMapComplex();


        Map<String, Integer> commonEntries = hashMapComplex.getCommonEntries(map1, map2);
        System.out.println("Common entries: " + commonEntries);
    }
}









