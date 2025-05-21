import java.util.*;

public class string_palendrome_check {
    public static boolean isPalendrome(String str){
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];
        for(int i = 0;i<=original.length-1;i++){
            reversed[i] = original[original.length-1-i];

        }
        for(int i = 0;i<=original.length-1;i++){
            if(original[i] != reversed[i]){
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a string :");
        String word = sc.nextLine();
        if(isPalendrome(word)){
            System.out.println("it is a palendrome ");

        }
        else{
            System.out.println("it is not a palendrom");
        }

    }

}
