package Basic;

import java.util.Scanner;

public class exceptionH2 {
//    in java using try inside try is called nested try block
//    some time problem rise where one block rise one error and other block rises other
//    there nested try is used
//    when any inner try block dont have then the catch of outer blocked is catched if it matches
//        then catch of outer is executed

//    public static void main(String[] args) {
//
//        try {
//            int a = 3/0;
//            try {
//                String s = null;
//                System.out.println(s.length());
//
//            }
//            catch (ArithmeticException e){
//                System.out.println("inner catch");
//            }
//
//        }
//        catch (Throwable e){
//            System.out.println("outer catch "+e);
//        }
//        System.out.println("bye");
//    }


//the finally will not be executed if program exit by system.exit() or by causing error which exit
//
//
//    throw keyword - the throw keyword is used to throw exception explesitly

    public static void main(String[] args) {
//        throw new ArithmeticException("error");
//        System.out.println("bye");
        Scanner in = new Scanner(System.in);
    int age;
    age = in.nextInt();
        if(age<19){
            throw new NullPointerException("go home kid");
        }
        else {
            System.out.println("welcome");
        }
    }
}
