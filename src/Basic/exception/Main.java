package Basic.exception;

public class Main {
    public static void main(String[] args) {
        try{
            div(2,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static int div(int a, int b) throws Exception {
        if(b==0){
            throw new ArithmeticException("pleace check value");
//            throw new Exception("pleace check value");// if this is used we also have
            // to use (throws Exception) during declarion
        }
        return a/b;
    }
}
