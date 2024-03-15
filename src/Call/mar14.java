package Call;


import java.util.ArrayList;

class A4
{
    private int age;
    private String name;
    private double marks;

    A4()
    {
        age=0;
        name=" ";
        marks=0.0;
    }

    A4(int age,String name,double marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    public String toString(){
        return ("name="+name+", age="+age+", marks="+marks+"     ");
    }
}

public class mar14 {

    public static void main(String[] args) {

        ArrayList<A4> a = new ArrayList<A4>();
        A4 o1 = new A4();
        A4 o2 = new A4(23,"abc",60.0);
        A4 o3 = new A4(24,"abcd",90.0);

        o1.setName("ab");
        o1.setAge(3);
        o1.setMarks(33.32);
        System.out.println(o2);
        a.add(o1);
        a.add(o2);
        a.add(o3);
        System.out.println(a);

        for(Object o:a){
            System.out.println(o);
        }

    }
}