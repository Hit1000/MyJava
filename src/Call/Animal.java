package Call;

public class Animal {
    void display(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void display(){
        super.display();
        System.out.println("Dog");
    }
}
class BabyDog extends Dog{
    void display(){
        System.out.println("Baby Dog");
    }
}
