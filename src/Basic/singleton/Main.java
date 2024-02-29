package Basic.singleton;

public class Main {
    public static void main(String[] args) {

        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();

        // all 3 object is pointing to same object
        // as only one object is allowed to make

    }
}
