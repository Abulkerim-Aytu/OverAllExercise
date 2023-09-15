package algo_question;
/*Excel Sheet Column Number
        Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
        For example:
        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26 AA -> 27 AB -> 28 ...
        Example 1:
        Input: columnTitle = "A"
        Example 2:
        Input: columnTitle = "AB"
        Example 3:
        Input: columnTitle = "ZY"
        Output: 1 Output: 28 Output: 701*/

public class ExcelColumnToNumber {

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // Convert the character to its corresponding value (A=1, B=2, ..., Z=26)
            result = result * 26 + value; // Calculate the column number in base-26
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String title1 = "A";
        String title2 = "AB";
        String title3 = "ZY";

        System.out.println(titleToNumber(title1)); // Output: 1
        System.out.println(titleToNumber(title2)); // Output: 28
        System.out.println(titleToNumber(title3)); // Output: 701
    }
}
