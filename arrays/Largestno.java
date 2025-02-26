import java.util.Arrays;

public class Largestno {
    public String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));
        if (numStrs[0].equals("0")) return "0";
        StringBuilder result = new StringBuilder();
        for (String num : numStrs) {
            result.append(num);
        }
        return result.toString();
    }
}
/*
 * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 */