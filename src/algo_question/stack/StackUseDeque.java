package algo_question.stack;

/*
You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
*/

import java.util.HashMap;
import java.util.Map;

public class StackUseDeque{
    public static void main(String[] args) {

        System.out.println(climbStairs(2));
    }

    //Approach 1: Recursion
        public static int climbStairs(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return climbStairs(n-1) + climbStairs(n-2);
        }



    //Approach 2: Memoization

    public static int climbStairs1(int n) {
            Map<Integer, Integer> memo = new HashMap<>();
            return climbStairs1(n, memo);
        }

        private static int climbStairs1(int n, Map<Integer, Integer> memo) {
            if (n == 0 || n == 1) {
                return 1;
            }
            if (!memo.containsKey(n)) {
                memo.put(n, climbStairs1(n-1, memo) + climbStairs1(n-2, memo));
            }
            return memo.get(n);
        }





}
