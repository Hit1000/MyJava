package Basic.polymorphism;

public class circle extends shapes{
    // this override in used to check if the following method is overrided or not
    @Override // this is called annotation
    void area(){
        System.out.println("I am in circle");
    }
}
