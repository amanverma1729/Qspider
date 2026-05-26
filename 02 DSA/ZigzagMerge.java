public class ZigzagMerge {
    public static void main(String[] args) {
        // Input arrays
        int[] arr1 = {20, 30, 50};
        int[] arr2 = {2, 4, 6, 8, 10};
        
        // Create an empty array to store the combined elements
        int[] merged = new int[arr1.length + arr2.length];
        
        // Pointers for arr1 (i), arr2 (j), and merged array (k)
        int i = 0, j = 0, k = 0;
        
        // Loop runs until both arrays are completely exhausted
        while (i < arr1.length || j < arr2.length) {
            // Take from first array if elements are left
            if (i < arr1.length) {
                merged[k] = arr1[i];
                k++;
                i++;
            }
            // Take from second array if elements are left
            if (j < arr2.length) {
                merged[k] = arr2[j];
                k++;
                j++;
            }
        }
        
        // Print final result
        System.out.println("merged: " + Arrays.toString(merged));
    }
}
