package Basic.collectionFramework;
//java comparable interface
//this is found in java.lang package
//this interface contain only one method compareTo(obj)
//it provide a single sorting seq only it mean u can element on the basic
// of single element only


import java.util.ArrayList;
import java.util.Collections;

class person implements Comparable<person>{
    private int age;
    private String name;
    private float marks;
    person(){}
    person(int age,String name,float marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
    public int compareTo(person o){
        if(age!=o.age){
            return age-o.age; // ascending order
        }
//        return o.age-age; // decending order
        if(!name.equals(o.name)){
            return o.name.compareTo(name); //for name ascending order
        }
        return (int)(marks-o.marks); //for marks ascending order

    }
}
public class compareInterface {
    public static void main(String[] args) {
        ArrayList<person> p = new ArrayList<>();
//        person p1 = new person();
//        p1.setAge(93);
//        p1.setName("one");
//        p1.setMarks(85.2f);
        person p2 = new person(23,"two",39.3f);
        person p3 = new person(53,"three",59.3f);
        person p4 = new person(24,"four",29.3f);
        person p5 = new person(15,"root",60.8f);
        person p6 = new person(18,"root",73f);
        person p7 = new person(15,"sood",73f);
        person p8 = new person(18,"raman",60.8f);
        person p9 = new person(5,"suman",90.8f);
        person p10 = new person(5,"suman",91.9f);

//        p.add(p1);
//        p.add(p2);
//        p.add(p3);
//        p.add(p4);
        p.add(p5);
        p.add(p6);
        p.add(p7);
        p.add(p8);
        p.add(p9);
        p.add(p10);

//        p.sort(person::compareTo);
//        Collections.sort();
        Collections.sort(p);
//        System.out.println(p);

        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
        }

    }
}
//compareter interface