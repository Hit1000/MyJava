package Basic.thread;

public class usingRunnable {

    public static void main(String[] args) {
        Thread a = new Thread(new A());
        Thread b = new Thread(new B());
        a.start();
        b.start();
    }
}
class A implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A "+i);
        }
    }
}
class B implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B "+i);
        }
    }
}