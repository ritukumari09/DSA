package DSA.arrays;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of arrays:");
        int n = s.nextInt();
        System.out.println("Enter occuring times:");
        int k = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] bitCount = new int[32];

        //Count bits at each position
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        //Reconstruct the unique number
        int unique = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % k != 0) {
                unique |= (1 << i);
            }
        }
        System.out.println(unique);
    }
}


/*
 Approach:
Count bits at each position:
Count the number of times each bit (0 or 1) appears at every position (from 0 to 31 for a 32-bit integer).
Since most elements occur k times, any bit's count will either be a multiple of k or differ due to the unique element.

Reconstruct the unique number:
For each bit position, if the count is not a multiple of k, that bit belongs to the unique number.
Use this information to reconstruct the unique number.


Explanation:
Input:
n = 7, k = 3
arr = {6, 2, 5, 2, 2, 6, 6}
Step-by-Step Execution:

1. Bit Counting:

Binary representation of elements:
6 → 110
2 → 010
5 → 101

Count bits at each position (from rightmost to leftmost):
Position 0:1+0+1+0+0+1+1=4
Position 1: 1+1+0+1+1+1+1=6
Position 2: 0+0+1+0+0+0+0=1

2. Modulo with k=3:
[4%3,6%3,1%3]=[1,0,1].
3. Reconstruct the unique number:

Binary representation of the unique number is 101, which equals 
5.
 */