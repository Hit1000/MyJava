package Basic.exception;

public class exceptionH1 {

//    run time error in known as expection
//    ex - divide by 0 is run time error
//    types of java exection
//            1 check
//            2 unchecked
//
//    unchecked exection - error only checked at run time
//            ArithmeticException int a= 30/0;
//            null pointer exception String s = null;sout(s.length());
//            number format exception String s="abc";int a =Integer.parseInt(s);
//            ArrayIndexOutOfBounds exception int[] a = new int[1];sout(a[3]);
//            stringIndexoutOfBounds exception String s = new String("abc");sout(s.charAt(3));

//    all classes related to exception is present in java.lang package
//    throw able is a base class in all java
//        vircual machine error
//        out of memory error
//        stack overflow error

//    checked exception
//            i/o exception
//            sql exception
//            class not found

//    runtime exception / unchecked
//            ArithmeticException int a= 30/0;
//            null pointer exception String s = null;sout(s.length());
//            number format exception String s="abc";int a =Integer.parseInt(s);
//            ArrayIndexOutOfBounds exception int[] a = new int[1];sout(a[3]);
//            stringIndexoutOfBounds exception String s = new String("abc");sout(s.charAt(3));

//    to handle exception in java we have 5 keyword try, catch, throw, throws, finally
//    try is not alone it is with catch or finally




    public static void main(String[] args) {
//        int a= 30/0;
//        System.out.println(a);

//        String s = null;
//        System.out.println(s.length());

//        String s="abc";int a =Integer.parseInt(s);

//        int[] a = new int[1];
//        System.out.println(a[3]);

//        String s = new String("abc");
//        System.out.println(s.charAt(3));

//        Exception handling

        System.out.println("h");
        try {
            int a = 3/0;
            System.out.println(a);

//            String s = null;
//            System.out.println(s.length());

//            String s="abc";int a =Integer.parseInt(s);


        }
//        catch (NumberFormatException e){
//            System.out.println("number ");
//        }
//        catch (ArithmeticException e){
//            System.out.println("exception statement     "+e);
//            e.printStackTrace();
//            System.out.println("this is e wala function :"+e);
//        }
        catch (Exception a){              //// used for all exception
            System.out.println("exception    "+a);

        }
        finally {
            System.out.println("print finally");
        }

//        catch (NullPointerException f){
//            System.out.println("Null wala");
//        }


        System.out.println("hello");
    }
}


