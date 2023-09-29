package algo_beginner;
/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,5,8,9,6,7};
        System.out.println(Arrays.toString(twoSum(nums,5)));
    }

    // solution 1
    public static int[] twoSumOptimalSolution(int[] array, int targetValue){
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            int potentialMatch=targetValue-array[i];
            if (map.containsKey(potentialMatch)) return new int[] {i,map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int[]{};
    }

    // solution 2
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numMap = new HashMap<>();
            int n = nums.length;

            // Build the hash table
            for (int i = 0; i < n; i++) {
                numMap.put(nums[i], i);
            }

            // Find the complement
            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                    return new int[]{i, numMap.get(complement)};
                }
            }

            return new int[]{}; // No solution found
        }

}
