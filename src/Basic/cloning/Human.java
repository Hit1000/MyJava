package Basic.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr = new int[]{2,3,4,5,6,67,7,8};
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Human(Human o) {
        this.age = o.age;
        this.name = o.name;
    }
    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
        return super.clone();
    }
}
