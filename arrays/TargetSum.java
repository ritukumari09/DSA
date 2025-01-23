package DSA.arrays;

import java.util.Arrays;

public class TargetSum {
    class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       int totalSum = Arrays.stream(nums).sum();
        if ((target + totalSum) % 2 != 0 || target > totalSum || target < -totalSum) {
            return 0;
        }
        int subsetSum = (target + totalSum) / 2;
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1; 
        for (int num : nums) {
            for (int j = subsetSum; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[subsetSum]; 
    }
}
}


/*
 * You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
 */
