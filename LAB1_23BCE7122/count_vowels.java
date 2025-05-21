import java.util.*;
public class count_vowels {
    public static void count(String str){
        int count = 0;
        char[] original = str.toCharArray();
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0;i<original.length;i++ ){
            for(int j = 0;j<vowels.length;j++){
                if(original[i] == vowels[j]){
                    count++;
                }
            }
            
        }
        System.out.println("the number of vowels in this are  " + count);

    }
    public static void main(String[] args){
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word :");
        word = sc.nextLine();
        count(word);
    }

}
