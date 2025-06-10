/*create a class shape with a method area() .derive circle and rectangle classes from shape and override the area() method. 
 * In the main function ,use a shape refernce to point to circle and rectangle objects adn call the area () method .demonstarte how dynamic binding 
 * works by observing which area() method gets called at runtime.
 */
import java.util.*;

class shape{
    Scanner sc = new Scanner(System.in);
    void area(){
        System.out.println("the area is:");

    }
}
class rectangle extends shape{
    @Override 
    void area(){
        System.out.println("enter the length");
        int l = sc.nextInt();
        System.out.println("enter the breadth");
        int b = sc.nextInt();

        int rectarea = l*b;
        System.out.println(rectarea);

    }

}
class circle extends shape{

    @Override
    void area(){
        System.out.println("enter the radius");
        double  radius  = sc.nextDouble();
        double cirarea = Math.PI*radius*radius;

        System.out.println(cirarea);
    }

}
public class question3 {
    public static void main(String[] args){
        shape s0 = new shape();
        s0.area();
        shape s1 = new rectangle();
        s1.area();
        shape s2 = new circle();
        s2.area();
    }

}
