package Basic;

public class staticBlock {
    static {
        System.out.println("ma hu static block");

    }
    public static void main(String[] args){
        System.out.println("ma hu main block");

    }
    static {
        System.out.println("ma hu baad wala static block");
    }
}
