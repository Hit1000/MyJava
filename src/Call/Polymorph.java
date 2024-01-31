package Call;

public class Polymorph {
    // compile time polymorph,run time
    // compile time is achieved by useing function overloading in java
    // run time is achieved by funtion overriding
    // run time is also called dynimic method dispatch is called to the overrided method
    // is resolved at run time reather at compile time

    public static void main(String[] args) {
    //compile time
//        Bank b = new PNB();
//        b.roi();

    //run time
//        Animal a = new Dog();
//        a.display();


    Bird p = new Pigon();

    }


}
