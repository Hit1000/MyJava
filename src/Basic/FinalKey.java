package Basic;

public class FinalKey {
    //final keyword
// it is used to restrice the user in java
// we can have final var , final method , final class
// in final var value can't be change
// if use make any method with final it can't be changed
// final method can be inher but not override
// if used in class we can't extend or no inhert it
// we can initiliased blank final var in constructer only
// a static final var that is not inshelise at time of declarion is know as static blank final var
// it can only initiliased with only static


        final int a;
        static final int b;
        FinalKey(){
            a=10;
        }
        static {
            b=20;
        }
    public static void main(String[] args) {
        FinalKey f=new FinalKey();
        System.out.println(f.a);
        System.out.println(b);
    }
}
