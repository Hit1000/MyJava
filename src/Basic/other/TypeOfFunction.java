package Basic.other;

import java.util.Scanner;

public class TypeOfFunction {

    int a,b;
    void input(){
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
    }
    static void  hello(){
        System.out.println("hello ");
    }
    int sum(){
        hello();
        return a+b;
    }



    public static void main(String[] args) {
        TypeOfFunction obj = new TypeOfFunction();
        obj.input();
        System.out.println(obj.sum());
        obj.hello();
    }

}
