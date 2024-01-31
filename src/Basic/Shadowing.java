package Basic;

public class Shadowing {
    static int x=10;// this will be shadowed as line 8 lower level hidding the upper level
    public static void main(String[] args){
        System.out.println(x );
        int x = 30;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
