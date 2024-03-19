package Basic.Inheritance;
/*
in java each class can hava only one direct class (no multiple inheritance allowed)
java have 3 type of inheritance
    single
    multilevel
    hierarchical

 */
public class inheritance {

    public static void main(String[] args) {
        student s1 = new student();
        s1.setAge(3);
        s1.setName("ram");
        s1.setRollNo(33);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        System.out.println(s1.getClass());

    }
}
//person is a base class
class person{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//student is a derived class
class student extends person{
    private int rollNo;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}