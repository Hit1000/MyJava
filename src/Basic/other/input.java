package Basic.other;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.println(a);

//        String str = input.nextLine();
//        System.out.println(str);

        System.out.println("max function "+Math.max(49,a));  //this is max function in java

        String x = "hello";
        int start=0,end = x.length()-1;
        System.out.println("this is the string :"+x);
        System.out.println(x.charAt(start++)+" "+x.charAt(end--));
        System.out.println(x.charAt(start++)+" "+x.charAt(end--));

    }
}
