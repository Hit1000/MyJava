package Basic.generics;
import java.util.*;
public class studentCompare {
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.rollno - o2.rollno;
//            }
//        });
        Arrays.sort(list, (o1, o2) -> o1.rollno - o2.rollno);

        System.out.println(Arrays.toString(list));
    }
}
class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "["+ rollno + ", " + marks +"]";
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println("in compareto method");
        int diff = (int) (this.marks - o.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }
}