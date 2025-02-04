import java.util.Arrays;

public class MaxProd {
    class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int product2 = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(product1, product2);
    }
}
}
/*Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6 */
