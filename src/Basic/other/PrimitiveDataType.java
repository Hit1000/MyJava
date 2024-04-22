package Basic.other;

public class PrimitiveDataType {
    public static void main(String[] args) {

        // string in not a primitive data type
//        primitive data type is which is not further divided in anyother data type


//        there is 8 primitive data type in java
        byte b = 100;
        short s = 10000;
        int a = 100;  //4 byte
        float f = 2039.039f;//4 byte
        double d = 589302.84939488749;//8 byte
        char c = 'c';
        long largeIntegerValue = 4565434647839838956L;//8 byte
        boolean bol = true;

        // litrials are the representation of value or data type

        System.out.println(0x4f);//hexadecimal
        System.out.println(0177);// octal
        System.out.println(0b1010011101);// binary

        int jj;
        char chj= '9';
        jj=chj;
        System.out.println(jj-48+" "+chj);
    }
}
