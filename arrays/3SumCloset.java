package DSA.arrays;

public class 3SumCloset {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums); // Step 1: Sort the array
            int closestSum = Integer.MAX_VALUE / 2; // Initialize with a large value
    
            // Step 2: Iterate through the array
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1, right = nums.length - 1; // Two pointers
                while (left < right) {
                    int currentSum = nums[i] + nums[left] + nums[right];
                    
                    // Update closestSum if the currentSum is closer to the target
                    if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                        closestSum = currentSum;
                    }
    
                    // Adjust pointers based on the currentSum
                    if (currentSum < target) {
                        left++; // Move left pointer to increase the sum
                    } else if (currentSum > target) {
                        right--; // Move right pointer to decrease the sum
                    } else {
                        return currentSum; // If the exact target is found
                    }
                }
            }
    
            return closestSum;
        }
    }
}

/*
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 */
