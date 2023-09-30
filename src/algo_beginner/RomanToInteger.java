package algo_beginner;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a dictionary to map each Roman numeral symbol to its corresponding value.
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left (reverse order).
        for (int i = s.length() - 1; i >= 0; i--) {
            char symbol = s.charAt(i);
            int value = romanValues.get(symbol);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(romanToInt("III"));       // Output: 3
        System.out.println(romanToInt("LVIII"));     // Output: 58
        System.out.println(romanToInt("MCMXCIV"));   // Output: 1994
    }
}
