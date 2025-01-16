/*Given an array a[] of n positive integers which can contain inteegers from 1 to n where elements can be repeated or can be absent from the array. Your task is to count frequency of all elements from 1 to n.
Note: Excepted time complexity is O(n) with O(1) extra space.
Input: 5
2 3 2 3 5
Output: 
0 2 2 0 1 */
package DSA;
import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Frequency encoding
        for (int i = 0; i < n; i++) {
            int index = (arr[i] - 1) % n; // Get the correct index
            arr[index] += n;             // Increment by n
        }

        // Step 2: Decode and print frequencies
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] / n + " "); // Get frequency by dividing by n
        }
    }
}

/*To solve this problem in O(n) time complexity and O(1) extra space, we can use the input array itself to store the frequencies by modifying the elements. Here's the approach:

Algorithm:
Adjust values to fit array indices: Since the values are between 1 and n, we can use the array indices as markers.

Frequency encoding:
For each element in the array, use the formula 
index=element−1 to map the element to its corresponding index.
Increase the value at this index by n. This marks how many times the element has been seen.

Decode the frequencies:
Traverse the array again, dividing each element by n to get the count of each number.

Output the frequencies:
Iterate from 1 to n and print the frequency of each number.
 */
