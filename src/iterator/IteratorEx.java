package iterator;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        // Create a HashMap named 'map' with month names as keys and the number of days as values
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 31);
        map.put("February", 28);
        map.put("March", 31);
        map.put("April", 30);
        map.put("May", 31);
        map.put("June", 30);

        // Get the set of entries (key-value pairs) from the map
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // Iterate through the entries and print them
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());


            List<String> task = new ArrayList<>();
            ArrayList<String> task1 = new ArrayList<>();

        }
    }
}
