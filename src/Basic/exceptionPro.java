package Basic;
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

    public static void main(String[] args) throws Exception {
        exceptionPro a = new exceptionPro();
        a.p();
        System.out.println("hello");
    }

}
