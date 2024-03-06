package Basic.thread;
//Multithreading is a Java feature that allows concurrent
//execution of two or more parts of a program for maximum utilization of CPU
//2 type
    //process based
    //thread based





public class multiThreaded extends Thread{

    public static void main(String[] args) {

        Thread t = new Thread();
        System.out.println("current thread :" + t);
        t.setName("No1");
        System.out.println("After changing name :" + t);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
