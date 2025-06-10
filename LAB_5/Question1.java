//create a abstract class with a method area() derive circle and rectangle from it and override the method .write a main fucntion to compute the area of both
import java.util.*;
import java.math.*;
abstract class shape{
    public abstract void area();

}
class Circle extends shape{
    Scanner sc1 = new Scanner(System.in);
    @Override
    public void area(){
        System.out.println("emter the radius :");
        int r  = sc1.nextInt();
        System.out.println("the area of circle is :" + Math.PI*r*r);

    }

}
class rectangle extends shape{
    Scanner sc2 = new Scanner(System.in);
    @Override
    public void area(){
        System.out.println("enter the value of length:");
        int l = sc2.nextInt();
        System.out.println("enter the value of breadth:");
        int b= sc2.nextInt();
        int c = l*b;
        System.out.println("the area of rectangle is :" + c);
    }
}



public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        rectangle r = new rectangle();
        c.area();
        r.area();
    }

}
