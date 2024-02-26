package Basic;

public class exceptionH3 {
    public static void main(String[] args) throws Exception{
        try {
            throw new Exception("error");
        }
        catch (Exception c){
            System.out.println(c);
        }

//        every sub class of error and runntime exception is an unchecked exception in java
//        a checked exception is every time else under the throwable class
//        if we throw a checked exception using a throw it is must to handle using catch
//        block and the method must declared it throw declaration



    }
}
