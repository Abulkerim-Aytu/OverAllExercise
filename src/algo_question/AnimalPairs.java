package algo_question;

import java.util.HashMap;
import java.util.Map;
/*

The Animals Went in Two by Two
        A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs. We are only interested in getting one pair of each animal, and not interested in any animals where there are less than 2. They need to mate to repopulate the planet after all!
        Write a function that takes a list of animals as a parameter, which you need to check to see which animals there are at least two of, and then return a Map<String, Integer> that contains the name of the animal along with the fact that there are 2 of them to bring onto the ark.
        Examples:
        Input: [] Output: {}
        Input: ['goat'] Output: {}
        Input : ["dog", "goat", "dog"] Output: {dog=2}
        Input : ["dog", "cat", "dog", "cat", "beaver", "cat"] Output: {cat=2, dog=2}
        Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"] Output: {horse=2, rabbit=2, goat=2}
        ChatGPT
*/


public class AnimalPairs {

    public static Map<String, Integer> findAnimalPairs(String[] animals) {

        Map<String, Integer> animalCounts = new HashMap<>();

        // Count the occurrences of each animal in the array
        for (String animal : animals) {
            animalCounts.put(animal, animalCounts.getOrDefault(animal, 0) + 1);
        }

        // Create a result map for animals with at least two pairs
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : animalCounts.entrySet()) {
            if (entry.getValue() >= 2) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String[] animals1 = {};
        String[] animals2 = {"goat"};
        String[] animals3 = {"dog", "goat", "dog"};
        String[] animals4 = {"dog", "cat", "dog", "cat", "beaver", "cat"};
        String[] animals5 = {"goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"};

        System.out.println(findAnimalPairs(animals1)); // Output: {}
        System.out.println(findAnimalPairs(animals2)); // Output: {}
        System.out.println(findAnimalPairs(animals3)); // Output: {dog=2}
        System.out.println(findAnimalPairs(animals4)); // Output: {cat=2, dog=2}
        System.out.println(findAnimalPairs(animals5)); // Output: {horse=2, rabbit=2, goat=2}
    }
}
