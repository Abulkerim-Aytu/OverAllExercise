package algo_beginner;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Collections;

public class GreaterElements {
    public List<Integer> findGreaterElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(nums[i]);
            }
            stack.push(nums[i]);
        }

        // Use Collections.reverse() to reverse the result list
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        GreaterElements solution = new GreaterElements();
        int[] inputArray = {10, 4, 6, 3, 5};
        List<Integer> output = solution.findGreaterElements(inputArray);
        System.out.println(output); // Output: [10, 6, 5]
    }
}
