package Basic.other;

public class wrapper {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(223);
        Integer i2 = Integer.valueOf("10001",2); // this store binary in it
        Integer i3 = Integer.valueOf("1701",8); // octal number
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println();

        int p1 = Integer.parseInt("152");
        int p2 = Integer.parseInt("10001", 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        System.out.println(i1.intValue());
        System.out.println(i1);

    }
}
