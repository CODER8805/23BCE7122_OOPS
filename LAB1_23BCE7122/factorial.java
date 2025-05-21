import java.util.*;
public class factorial {
    public static void factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;

        }
        System.out.println("THE FACTORIAL OF NUMBER IS " + fact);
    }
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        number = sc.nextInt();
        factorial(number);
    }

}
