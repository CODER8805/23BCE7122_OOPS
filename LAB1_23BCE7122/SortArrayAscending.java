import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 9, 1, 7};

        
        Arrays.sort(arr);

        
        System.out.print("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
