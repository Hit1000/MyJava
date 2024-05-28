package Basic.generics;

import java.util.Arrays;

public class method {

    <t> void print(t []s){
        for(t i:s){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        method m1 = new method();
        String []s1 = new String[]{"india", "nepal"};
        StringBuilder []s2 = new StringBuilder[]{new StringBuilder("20"),
                new StringBuilder("309"), new StringBuilder("32")};
//        System.out.println(Arrays.toString(s2));

        m1.print(s1);
        m1.print(s2);
    }
}
