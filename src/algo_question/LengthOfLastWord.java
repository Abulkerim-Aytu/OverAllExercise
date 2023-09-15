package algo_question;
/*
Length of Last Word
        Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.
        Example 1:
        Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with length 5.
        Example 2:
        Input:s=" flyme to themoon " Output:4 Explanation: The last word is "moon" with length 4.
        Example 3:
        Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is "joyboy" with length 6.
*/

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();

        int length = 0;
        int i = s.length() - 1;

        // Start from the end of the trimmed string and count characters until a space is encountered
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "   Hello World   ";
        String s2 = " flyme to themoon ";
        String s3 = "luffy is still joyboy";

        System.out.println(s1.trim());

        System.out.println(lengthOfLastWord(s1));  // Output: 5
        System.out.println(lengthOfLastWord(s2));  // Output: 4
        System.out.println(lengthOfLastWord(s3));  // Output: 6
    }
}
