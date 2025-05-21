import java.util.*;
public class sortascending{
    public static void sort(int arr1[]){
        for(int i = 0;i<=arr1.length-1;i++){
            for(int j = i+1;j<=arr1.length-1;j++){
                if(arr1[i]>arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;

                }
            }
        }
        for(int i = 0;i<=arr1.length-1;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr1[] = {5,4,3,2,1};
        System.out.println("the sorted array is :");
        sort(arr1);
    }

}