package algo_question;

/*
Valid Palindrome
        Write a function that accepts a string and determines whether it is a palindrome, ignoring non- alphanumeric characters and case and returns true if it is palindrome.
        (A string is said to be palindrome if it reads the same backward as forward, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters). Examples:
        Input: Do geese see God?
        Input: Was it a car or a cat I saw?
        Input: A brown fox jumping over Constraints:
        Output: True
        Output: True
        Output: False
        */

public class ValidPalindrome {
    /*
    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the modified string is a palindrome
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "Do geese see God?";
        String s2 = "Was it a car or a cat I saw?";
        String s3 = "A brown fox jumping over";

        System.out.println(isPalindrome(s1));  // Output: true
        System.out.println(isPalindrome(s2));  // Output: true
        System.out.println(isPalindrome(s3));  // Output: false
    }*/


    //The Two Pointer technique for this question to improve time & space complexity.

        private static boolean isAlphanumeric(char c) {
            return Character.isLetterOrDigit(c);
        }

        public static boolean isPalindrome(String s) {
            // Initialize two pointers, one at the beginning and one at the end
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                // Move the left pointer rightwards until a valid alphanumeric character is found
                while (left < right && !isAlphanumeric(s.charAt(left))) {
                    left++;
                }

                // Move the right pointer leftwards until a valid alphanumeric character is found
                while (left < right && !isAlphanumeric(s.charAt(right))) {
                    right--;
                }

                // Compare characters at the left and right pointers
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // If characters are not the same, it's not a palindrome
                }

                // Move the pointers towards the center
                left++;
                right--;
            }

            return true; // If the loop completes, it's a palindrome
        }


        public static void main(String[] args) {
            // Test cases
            String s1 = "Do geese see God?";
            String s2 = "Was it a car or a cat I saw?";
            String s3 = "A brown fox jumping over";

            System.out.println(isPalindrome(s1));  // Output: true
            System.out.println(isPalindrome(s2));  // Output: true
            System.out.println(isPalindrome(s3));  // Output: false
        }


}
