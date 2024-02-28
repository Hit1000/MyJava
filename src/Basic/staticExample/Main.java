package Basic.staticExample;
//static dont depends on object of classes to run

public class Main {
    public static void main(String[] args) {
    human h1 = new human(20, "Hitesh", 1000000, false);
    human h2 = new human(25, "Rahul", 1550000, true);

        System.out.println(human.population);
        System.out.println(h2.population);

    human h3 = new human(18, "Gautam", 150000, false);

        human.display();

//        this is how u run a method without using static during declaring
        Main run = new Main();
        run.funStarter();
    }


    void fun(){
        System.out.println("this is without a static");
    }
    void funStarter(){
        fun();
    }
}
