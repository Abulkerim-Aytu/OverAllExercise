package algo_question;

public class ValidPalindrome {
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
    }
}
