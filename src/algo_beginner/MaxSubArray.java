package algo_beginner;

class MaxSubArray {


    // solution 1
    public int maxSubArr1(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        //[4,-1,2,1]
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }

    // Solution 2
    class maxSubArr2 {
        public int maxSubArray(int[] nums) {
            int maxSum = nums[0];
            int currentSum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }
    }
}