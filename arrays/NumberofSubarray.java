public class NumberofSubarray {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int oddCount = 0, evenCount = 1;  
        int prefixSum = 0, totalOddSubarrays = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) { 
                totalOddSubarrays = (totalOddSubarrays + oddCount) % MOD;
                evenCount++;
            } else {  
                totalOddSubarrays = (totalOddSubarrays + evenCount) % MOD;
                oddCount++;
            }
        }

        return totalOddSubarrays;
    }
}
/*
 * Given an array of integers arr, return the number of subarrays with an odd sum.

Since the answer can be very large, return it modulo 109 + 7.


Example 1:
Input: arr = [1,3,5]
Output: 4
Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
All sub-arrays sum are [1,4,9,3,8,5].
Odd sums are [1,9,3,5] so the answer is 4.

Example 2:
Input: arr = [2,4,6]
Output: 0
Explanation: All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
All sub-arrays sum are [2,6,12,4,10,6].
All sub-arrays have even sum and the answer is 0.
 */