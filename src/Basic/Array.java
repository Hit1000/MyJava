package Basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Arrays of primitives

//        int[] arr = new int[5];
//        int[] arrr = {4,5,4,45,66,7,87,4};
//
//        System.out.println(arr[0]);
//
//        String[] a = new String[5];
//        System.out.println(a[0]);
//
//        // for loop
//        for(int i=0; i<arrr.length; i++){
//            System.out.print(arrr[i] + " ");
//        }
//        System.out.print("\n");
//
//        // for each loop
//        for(int i:arrr){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        // other way to print an array
//        System.out.println(Arrays.toString(arrr));

        // Arrays of objects

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
