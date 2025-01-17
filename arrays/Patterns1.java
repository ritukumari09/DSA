package DSA.arrays;

public class Patterns1 {
    public static void main(String[] args) {
        //Pattern 1
        int n = 3; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   "); // Print spaces
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*    "); // Print stars
            }
            System.out.println();
        }

        //Pattern 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  "); 
            }
            System.out.println();
        }

        //Pattern 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }

        //Pattern 4
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }

        /*pattern 5
    
        */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int j = i; j < n; j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
    }
}
