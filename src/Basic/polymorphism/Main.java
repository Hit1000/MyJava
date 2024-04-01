package Basic.polymorphism;
/*
Polymorphism mean many ways to represent
task is perform in single action but in many ways

type of polymorphism
    compile time / static  -  achieve via method overloading
    runtime / dynamic - achieve by overriding
 */
public class Main {
    public static void main(String[] args) {
        shapes s = new shapes();
        circle c = new circle();
        triangle t = new triangle();

        t.area();

        shapes circle = new circle();
        //here which method will be called depend on this(shape ref) is known as upcasting
    }

}
