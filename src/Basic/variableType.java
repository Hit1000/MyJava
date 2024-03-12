package Basic;

public class variableType {
    static <T> void dis(T ob){
        System.out.println(ob);
        System.out.println(ob.getClass());
        System.out.println(ob.getClass().getName());
        System.out.println();

    }

    public static void main(String[] args) {
        dis(32);
        dis(23);
        dis("re");
        dis(true);
        dis(3.3);
        dis('s');
        dis((byte)20);
    }
}
