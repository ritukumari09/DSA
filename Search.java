package DSA;

public class search {

        public static int findElement(int[] arr, int x) {
            // Traverse the array
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i; // Return index if element is found
                }
            }
            return -1; // Element not found
        }
    
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4};
            int x1 = 3;
            System.out.println(findElement(arr1, x1)); // Output: 2
    
            int[] arr2 = {5, 8, 7, 10};
            int x2 = 9;
            System.out.println(findElement(arr2, x2)); // Output: -1
        }
}

