package Basic.exception;
//by default uncheck are forward in calling chain
//checked excepthon are not forwarded in a calling chain


public class exceptionPro {
    void m() throws Exception{
//        int a=3/0;
        throw new ArithmeticException("age<18");
    }
    void n() throws Exception{
        m();
    }
    void p() throws Exception{
        n();
//        try{
//            n();
//        }catch (Exception e){
//            System.out.println("ji ji "+e);
//        }
    }

    public static void main(String[] args) {
        exceptionPro a = new exceptionPro();
        try{
            a.p();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("hello");
    }

}
