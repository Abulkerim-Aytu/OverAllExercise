package algo_question;
/*Best Time to Buy and Sell Stock
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. Example 1:
        Input: prices = [7,1,5,3,6,4] Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        Example 2:
        Input: prices = [7,6,4,3,1] Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.*/
// Solution 1
public class MaxProfit {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0; // If there are no prices, return 0 profit.
        }

        int minPrice = prices[0]; // Initialize the minimum price as the price on the first day.
        int maxProfit = 0; // Initialize the maximum profit as 0.

        for (int i = 1; i < prices.length; i++) {
            // Calculate the potential profit if we sell on the current day.
            int currentProfit = prices[i] - minPrice;

            // Update the maximum profit if the current profit is greater.
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            // Update the minimum price if we find a lower price.
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }

    // Solution 2
    // Time Complexity: O (n)
    // Space Complexity: O (1)
    static int getTheMaxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            int tempProfit = prices[i] - minBuy;
            maxProfit = Math.max(maxProfit, tempProfit);
        }
        return maxProfit;
    }


// Solution 3
    // Time Complexity: O (n)
    // Space Complexity: O (1)
    public int getMaxProfitagain(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profitSoFar =0;
        int currentProfit;
        for (int price : prices) {
            if (price < min) min = price;
            currentProfit = price - min;
            if (currentProfit > profitSoFar)
                profitSoFar = currentProfit;
        }
        return profitSoFar;
    }

    public static void main(String[] args) {
        // Test cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 6, 4, 3, 1,8};

        System.out.println(maxProfit(prices1)); // Output: 5
        System.out.println(getTheMaxProfit(prices2)); // Output: 0
    }
}
