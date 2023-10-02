package algo_beginner;

import java.util.Stack;

public class Palindrome {

    // solution with stack
    public static boolean isPalindrome1(int x) {
        // Convert the integer to a string
        String str = Integer.toString(x);

        // Initialize a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and append them to a new string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        // Check if the original and reversed strings are equal
        return str.equals(reversedStr.toString());
    }

    // solution with
    class Solution {
        public boolean isPalindrome2(int x) {
            if (x < 0) {
                return false;
            }

            long reversed = 0;
            long temp = x;

            while (temp != 0) {
                int digit = (int) (temp % 10);
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            return (reversed == x);
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome1(121));   // Output: true
        System.out.println(isPalindrome1(-121));  // Output: false
        System.out.println(isPalindrome1(10));    // Output: false
    }
}
