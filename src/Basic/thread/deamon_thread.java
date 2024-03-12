package Basic.thread;
//it is serveic provider thread which

//the life deamon thread in at mercy of user thread
//when all thread died jvm automatically deamon thread
//the most common ex is finalizer
//it is a low priority thread

//Q can we start a thread 2 time ?
//no it can never be started again if u do so an illeagal thread state exception
//in this case thread runs once and throw exception 2 time

//Q if we call run method directly instead of start method?
//in this case no contast switching is allow it is simplelly a normal function



public class deamon_thread extends Thread {
    public deamon_thread(String name){
        super(name);
    }


    public void run()
    {
        for(int i=0; i<10;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(" "+e);
            }
            if(Thread.currentThread().isDaemon()){
                System.out.println(getName() + " is Daemon thread "+ i);
            }else{
                System.out.println(getName() + " is User thread "+i);
            }

        }
        // Checking whether the thread is Daemon or not

    }

    public static void main(String[] args)
    {

        deamon_thread t1 = new deamon_thread("t1");
        deamon_thread t2 = new deamon_thread("t2");
        deamon_thread t3 = new deamon_thread("t3");

        t1.setPriority(4);
        t2.setPriority(3);
        t3.setPriority(5);
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);

        // starting first 2 threads
        t1.start();
        t2.start();

        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
//        t1.start();
    }
}
