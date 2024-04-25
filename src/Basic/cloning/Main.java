package Basic.cloning;
import java.lang.Cloneable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human hit = new Human(21,"hitesh");
//        Human twin = new Human(hit);

        Human three = (Human) hit.clone();
        System.out.println(three.age+" "+three.name);
        System.out.println(Arrays.toString(three.arr));
        three.arr[0] = 99;
        three.name = "hit";
        System.out.println(hit.age+" "+hit.name);
        System.out.println(Arrays.toString(hit.arr));

    }
}
