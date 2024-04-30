package Teme.DiscordHomeWork.Homework22x23;

import java.util.HashMap;
import java.util.Map;

public class HashMapComplex {

    public Map<String, Integer> getCommonEntries(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> commonEntries = new HashMap<>();


        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();


            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                commonEntries.put(key, value);
            }
        }
        return commonEntries;
    }
}

