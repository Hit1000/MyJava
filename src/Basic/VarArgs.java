package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(4,5,6,567,45,67,456,4,7567,5,675,56,2,56);
        multi(3,5,"hit","singla");
    }

    static void multi(int a,int b, String ...x){
        System.out.println(a+" "+b+" "+Arrays.toString(x));
    }
    static void fun(int ...x){
        System.out.println(Arrays.toString(x));
    }
}
