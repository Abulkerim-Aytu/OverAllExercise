package algo_question;
/*
Question-1 Single Number
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        Example 1:
        Input: nums = [2,2,1]
        Output: 1

        Example 2:
        Input: nums = [4,1,2,1,2]
        Output: 4

        Example 3:
        Input: nums = [1]
        Output: 1

        Constraints:
        1 <= nums.length <= 3 * 104 -3*104 <=nums[i]<=3*104 Each element in the array appears twice except for one element which appears only once.

        Follow-up question: Can you implement a solution with a linear runtime complexity and use only constant extra space?
*/

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 2, 3};
        System.out.println("Example 1 Output: " + singleNumber(nums1)); // Output: 1
        System.out.println("Example 1 Output: " + singleNumber1(nums1)); // Output: 1
    }
    //Solution 3
    public static int singleNumber3(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Find and return the element with a frequency of 1 (the single number)
        for (int num : nums) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }
        // Return -1 if no single number is found (this should not happen in this problem)
        return -1;
    }

    // Solution 2
    public static int singleNumber1(int[] nums) {
        List<Integer> numList = new ArrayList<>();

        for (int num : nums) {
            numList.add(num);
        }
        // Use removeIf to remove duplicates
        numList.removeIf(n -> numList.indexOf(n) != numList.lastIndexOf(n));

        // At this point, numList should contain only the single number
        return numList.get(0);
    }

//Solution 1
    public static int singleNumber(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            // If the number is already in the set, remove it
            if (seenNumbers.contains(num)) {
                seenNumbers.remove(num);
            } else {
                // If the number is not in the set, add it
                seenNumbers.add(num);
            }
        }
        // At the end, the set will contain only the single number
        return seenNumbers.iterator().next();
    }


}
