package DSA.arrays;

public class Patterns2 {
    public static void main(String[] args) {
    int n = 5; // Size of the triangle

        // Upper triangular pattern
        System.out.println("Upper Triangular Pattern:");
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Lower Triangular Pattern:");
        for (int i = 0; i < n; i++) {
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
