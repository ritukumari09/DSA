import java.util.Arrays;

public class swapandminimize {
    public long maxSum(Long[] arr) {
        Arrays.sort(arr); 
        int n = arr.length;
        Long[] rearranged = new Long[n];

        int left = 0, right = n - 1, index = 0;
        while (left <= right) {
            if (index % 2 == 0) {
                rearranged[index++] = arr[left++];  
            } else {
                rearranged[index++] = arr[right--]; 
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(rearranged[i] - rearranged[(i + 1) % n]);
        }

        return sum;
    }
}
/*
 * Given an array arr[ ] of positive elements. Consider the array as a circular array, meaning the element after the last element is the first element of the array. The task is to find the maximum sum of the absolute differences between consecutive elements with shuffling of array elements allowed i.e. shuffle the array elements and make [a1..an] such order that  |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1| is maximized.

Examples:

Input: arr[] = [4, 2, 1, 8]
Output: 18
Explanation: After Shuffling, we get [1, 8, 2, 4]. Sum of absolute difference between consecutive elements after rearrangement = |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| = 7 + 6 + 2 + 3 = 18.
Input: arr[] = [10, 12]
Output: 4
Explanation: No need of rearrangement. Sum of absolute difference between consecutive elements = |10 - 12| + |12 - 10| = 2 + 2 = 4.
 */
