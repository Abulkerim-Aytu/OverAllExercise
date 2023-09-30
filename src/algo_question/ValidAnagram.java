package algo_question;

import java.util.Arrays;
/*Question-1 Valid Anagram
        Week-06 Algo Questions
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.
        Constraints:
        1 <= s.length, t.length <= 5 * 104
        s and t consist of lowercase English letters.
        Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
        Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:
        Input: s = "rat", t = "car"
        Output: false*/

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare sorted character arrays
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));  // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2));  // Output: false
    }
}
