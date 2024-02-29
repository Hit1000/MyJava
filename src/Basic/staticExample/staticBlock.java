package Basic.staticExample;

public class staticBlock {

    static int a = 2;
    static int b;

//    will only run once when the class is loaded first
    static {
        System.out.println("this is static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(a + " " + staticBlock.b);

        b+=3;

        staticBlock obj1 = new staticBlock();
        System.out.println(b);

    }
}
