import java.util.*;
public class REVERSE {
    public static void rev(int n){
        int rev  = 0;
        while(n != 0){
            int r  = n%10;
            rev  = rev*10 + r;
            n = n/10;
        }
        System.out.println("the revserse of given number is " + rev);
    }
    public static void main(String[] args){
        int number;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number : ");
        number = sc.nextInt();
        rev(number);

    }
    
}
