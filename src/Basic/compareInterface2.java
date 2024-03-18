package Basic;

import java.util.Comparator;

class staff{
    public int age;
    private String name;
    private float marks;

    public staff(int age, String name, float marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    int getAge(){
        return age;
    }
}
//class ascCompare implements Comparator{
//    @Override
//    public int compare(Object ob1, Object ob2) {
//        return ob1.age()-ob2.age();
//    }
//}
public class compareInterface2 {
    staff s1 = new staff(2,"hit",03f);
    staff s2 = new staff(5,"hit",03f);

//    ascCompare

}
