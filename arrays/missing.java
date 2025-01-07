package DSA.arrays;

public class missing {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;
        
        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        
        // The missing number is the difference
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // Array with missing number
        int n = 6;  // The number up to which the array should contain numbers (1 to 6)
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
