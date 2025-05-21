import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {5, 2, 9, 1, 7};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
