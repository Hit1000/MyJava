package Call;

    // multiple inhereten is not present in java so to use it in java Interface is used
public class MultiUsingInterface {
    public static void main(String[] args){
        printing p = new printing();
        p.print();
        p.print2();
        p.print3();
//        p.print4(); // not work
        ace.print4();
    }

}
    interface canon{
        void print();
        default void print3(){
            System.out.println("canon too");
        }
    }

    interface ace{
        void print2();
        static void print4(){
            System.out.println("ace too");
        }
    }

    class printing implements canon, ace{
        public void print(){
            System.out.println("canon");

        }
        public void print2(){
            System.out.println("ace");
        }
    }


// since java 8 we can have method body in interface but we need to make it default method
// since java 8 we can have static method in interface also

