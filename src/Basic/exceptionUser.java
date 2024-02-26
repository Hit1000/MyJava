package Basic;
//user define exception in java
//a class which inher from any exception is called user define exception class


import java.util.NoSuchElementException;

public class exceptionUser {
    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new ageException("age less ha chal haat");
        }else {
            System.out.println("valid age");
        }
    }
    public static void main(String[] args) throws Exception {
        int age=10;
        checkAge(age);
    }
}

class ageException extends Exception{
    public ageException(String s){
        super(s);
    }
}
