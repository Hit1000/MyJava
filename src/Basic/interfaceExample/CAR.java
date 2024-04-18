package Basic.interfaceExample;

public class CAR implements engine, brakes, media{


    public void p(){
        System.out.println("prize " +price+ " :this is used by method ");
    }
    @Override
    public void brake() {
        System.out.println("this is a brake");
    }

    @Override
    public void start() {
        System.out.println("this is a start");
    }

    @Override
    public void stop() {
        System.out.println("this is a stop");
    }

    @Override
    public void acc() {
        System.out.println("this is a accelerate");
    }
}
