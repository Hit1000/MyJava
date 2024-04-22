package Basic.other;
import java.util.*;
public class string {
    public String toString(){
        String any="ldf";
        return any;
    }

    public static void main(String[] args)
    {
//        String gh = String.toString();
//        System.out.println(gh);

//    String a = "hit";
//    String b = "hit";
//    String c = new String("hit");
//    String d = new String("hit");

        //comparison of string
//  1 == comparator it check reference and value
//  2 .equals() method it check only values of string

//        System.out.println(Arrays.toString(new int[]{3,3,4}));
//
//        System.out.println(a == b);
//        System.out.println(c.equals(d));
//        System.out.println(c.compareTo(d));


//        preattyPrinting
//  it also round off the number
//  %s,%f are known as placeholder it come under formating string

//        float f = 345.123456f;
//        System.out.printf("Formatted string is :%.3f\n", f);
//        System.out.printf("Pie : %.2f", Math.PI);


//        PERFOMANCE
//        System.out.println((int)('a'));

        StringBuilder s = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            System.out.print(ch+" ");
            s.append(ch);
        }
        System.out.println();
        System.out.println(s);
    }
}
