package Basic.abstractMethod;

public class son2 extends parent{
    @Override
    void career(String name) {
        System.out.println(name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i am partner with "+name);
    }
}