package Basic.exception;

//EH with method overriding if super class method doenot declare a exception then
//sub class overriden method can not declare checked exception but it can delcare a unchecked
//exception

//if super class method declare a exception then sub class overriden method can declare
//same exception but can't declare parent exception


public class exceptionH4 {
    public static void main(String[] args) {
        kto ob1 = new kto();
        ob1.dis();
    }
}
class ot{
    void dis(){
        System.out.println("hello");
    }
}
class kto extends ot{
    void dis() throws ArithmeticException{
        System.out.println("bye");
    }
}



// diff b/t  throw                         and                    throws

//java throw is used throw an                    java throws is used in method signature to
//exception in code or inside the function       declare an exception which might be thrown by an

//we can propagete only unchecked using throw    using throws we can declare both checked and
//keyword. the checked exc can not be prop       unchecked however it is used to prop checked only

//the throw is followed by an enstance of        the throws keyword is followed is class name
//an object                                      exception to be throw

//it is used in a method                         used with the method signature
