package algo_beginner;

import java.util.HashMap;
import java.util.HashSet;

class ContainsDuplicate {

    // Hash Set
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

    // Hash Map
        public boolean containsDuplicate1(int[] nums) {
            HashMap<Integer, Integer> seen = new HashMap<>();
            for (int num : nums) {
                if (seen.containsKey(num) && seen.get(num) >= 1)
                    return true;
                seen.put(num, seen.getOrDefault(num, 0) + 1);
            }
            return false;

    }
}
 /*   Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true*/