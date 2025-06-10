/*question 2 create a class shape with a method display() .override this method in both circle and rectangle classes . 
use the super keyword in the overidden methods to call the parent class  display() method before printing shape specific messages .
write a main function to show how super works.
 * 
 */
class shape{
    void display(){
        System.out.println("this is the shape");
    }
}
class rectangle extends shape{
    @Override
    
    void display(){
        super.display();
        System.out.println("this is the rectangle ");
    }
}
class circle extends shape{
    @Override
    void display(){
        super.display();
        System.out.println("this is the circle");
    }
}
public class question2{
    public static void main(String[] args){
        rectangle r = new rectangle();
        r.display();
        circle c = new circle();
        c.display();

    }
}