package Basic;

public class TypeOfVar {

    int a;
    float b;
    static int c;

    public static void main(String[] args) {
        TypeOfVar obj1 = new TypeOfVar();
        TypeOfVar obj2 = new TypeOfVar();
        TypeOfVar obj3 = new TypeOfVar();
        obj1.a = 1;
        obj1.b = 2;
        obj1.c = 3;
        System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);
        obj2.c = 4;
        System.out.println(obj2.a+" "+obj2.b+" "+obj2.c);





    }

}
