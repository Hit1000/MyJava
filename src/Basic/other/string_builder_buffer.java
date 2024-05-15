package Basic.other;

public class string_builder_buffer {
//    gernally string is squence of char but in java string is object that represent char
//    it is java.lang pack there are 2 way to crate string by string litteral and new keyword
//    String s= "widow"; // this is literal
//    each time u create a string literal jvm check string constant pool first if string all ready
//    exist in pool a ref is return if string not exist a new instance is created
//
    static char[] ch = {'a','b','c'};

    static String s = new String(ch);

    public static void main(String[] args) {
        System.out.println(s.charAt(2));

        String s1= "aaa";
        String s2= "aaa";
        String s3= new String("aam");
        String s4= new String("aaa");

//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));

//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s4==s3);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

    }

    // compare string method in java
//    equal()
//    ==    - it compare ref not value
//    compareTo()  - retrun int retrun diff of ascii values to char
//


}
