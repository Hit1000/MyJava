package Basic.other;

/*
two type of Initialization block
    instance Initialization block - these member function belong to object
    static Initialization block - these belong to full class

instance Initialization block - first out initialization Block work then Constructor
static Initialization block - it run only one time
 */

public class initializationBlock {

    private static int x;

//    this is instance Initialization block
    {
        System.out.println("Initialization block starts : x="+x);
        x=5;
    }

//    this is Static Initialization block
    static {
        System.out.println("Static Initialization block starts : x="+x);
        x=15;
    }
    initializationBlock(){
        System.out.println("Constructor starts : x="+x);
    }

    public static void main(String[] args) {
        initializationBlock s1 = new initializationBlock();
        initializationBlock s2 = new initializationBlock();

    }

}
