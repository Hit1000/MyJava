package Basic.thread;
//Multithreading is a Java feature that allows concurrent
//execution of two or more parts of a program for maximum utilization of CPU
//2 type
    //process based
    //thread based

//multiThreading in java is a process executing multiple thread simlaria
//a thread is a light weight sub process the smallest unit of process
//multi threading and multi processing is both is used to achieve multitasking
//java multithreading is mostly used in games and animation
//multiThreading is prefered over multi processing because thread use share memory area
//they don't alocate separeate memory area to save memory , so they use contast switching
//threads are independent if there occures in one thread it dont effect other thread
//at a time one thread is executed only
//lifecycle of thread
//    in java a thread always exist in any folling state
//            new
//            active
//            blocked/waiting
//            time waiting
//            terminated
//there are two ways to create a thread in java
//        by extends Thread
//        runnable interface
//common method of thread class
//        public void run()
//        public void sleep(millisecond);
//        public void star()
//        public void join()
//        public void join(long millisecond)
//        public void getProter()
//        public int setProter()
//        public String getName()
//        public String setName(String)
//        public boolean islive()
//        public boolean isDaemon()
//        public boolean stop()


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
