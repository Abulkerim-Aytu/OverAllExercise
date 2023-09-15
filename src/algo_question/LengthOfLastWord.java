package algo_question;

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
