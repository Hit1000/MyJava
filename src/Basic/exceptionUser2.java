package Basic;

public class exceptionUser2 {
    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new powerException("age less ha chal haat");
        }else {
            System.out.println("valid age");
        }
    }
    public static void main(String[] args) throws Exception {
        int age=10;
        checkAge(age);
    }
}

class powerException extends Exception{
    String s;
    powerException(String s){
        this.s = s;

    }
    public String toString(){
        return s;
    }
}