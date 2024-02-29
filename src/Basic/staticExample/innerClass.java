package Basic.staticExample;
//this static var are resolve during compile time not run time
public class innerClass {

    static class test{
        String name;
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.setName("hitesh");
        test t2 = new test();
        t2.setName("singla");

        System.out.println(t1.name);
        System.out.println(t2.name);

        // overriding
        System.out.println(t1);
    }

}
