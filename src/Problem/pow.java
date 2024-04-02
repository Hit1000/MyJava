package Problem;
import java.lang.*;

public class pow {
    static int pow_find(int x, int y)throws lessException{
        if(x<0 && y<0){
                throw new lessException("both are less then 0");
            }
        if(x<0 || y<0){
            throw new lessException("base is less than 0");
        }
        if(x>=0 && y>=0){
            return (int)(Math.pow(x, y));
        }
        return 0;

    }
    public static void main(String[] args) throws Exception {
//        pow_find(4,5);
//        pow_find(-1,5);
//        pow_find(-1,-5);
        try {
            System.err.println(pow_find(-2, -4));
        }
        catch (lessException ms) {
            System.err.println(ms.getMessage());
        }

    }
}
class lessException extends Exception{
    public lessException(String s){
        super(s);
    }
}