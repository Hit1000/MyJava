package Basic.generics;

import java.util.ArrayList;

// one line function
public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        arr.forEach((i) -> System.out.print(i+" "));
    }
}
