package Basic.Inheritance;

public class Main {
    public static void main(String[] args) {
//        box b1 = new box(20);
//        box b2 = new box(20,33,39);
//        box b3 = new box(b1);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);

        boxWeight b4 = new boxWeight(23,334,3,3);
        System.out.println(b4);

        box b5 = new boxWeight(3,3,3,3);
    // it is acculy the type of referance var which determine which member can be accessed
        System.out.println(b5);
    }
}
