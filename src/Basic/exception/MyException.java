package Basic.exception;

public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }
}
// throw new ArithmeticException(toString(n));
// throw new ArithmeticException(Arrays.toString(n));