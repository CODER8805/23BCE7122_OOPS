//write  a code to build a student management system that stores marks of 5 students
// and calculate total and average
//use collections

import java.util.*;

class calculator{
    public static int total(ArrayList<Integer> list){
        int total = 0;
        for(int i = 0;i<list.size();i++){
            total+=list.get(i);

        }
        return total;
    }

    public static void average(ArrayList<Integer> list){
        int average = total(list)/list.size();
        System.out.println("the average of students marks is :"+ average);
        
    }

}

public class arlist {
    public static void Main(String[] args){
        ArrayList<Integer> Student = new ArrayList<>();
        Student.add(98);
        Student.add(95);
        Student.add(96);
        Student.add(92);
        Student.add(99);

        calculator c = new calculator();
        c.total(Student);
        c.average(Student);


    }
    
}
