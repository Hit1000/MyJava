package Basic;

import java.util.Scanner;

public class variableType {
    static <T> void dis(T ob){
        System.out.println(ob);
        System.out.println(ob.getClass());
        System.out.println(ob.getClass().getName());
        System.out.println();
    }

    static <T1,T2> void dis(T1 ob1, T2 ob2){
        System.out.println(ob1+" *** "+ob2);
        System.out.println(ob1.getClass()+ " *** "+ ob2.getClass());
        System.out.println(ob1.getClass().getName()+ " *** "+ ob2.getClass().getName());
        System.out.println();
    }

    static <t1 extends Comparable<t1>> void greater(t1 ob1, t1 ob2){
        if(ob1.compareTo(ob2)>0){
            System.out.println(ob1);
        }
        else{
            System.out.println(ob2);
        }
    }

    public static void main(String[] args) {
        dis(32);
        dis(23);
        dis("re");
        dis(true);
        dis(3.3);
        dis('s');
        dis((byte)20);



        greater(23,44);
        greater('c','d');
        greater(22.3,4.4);

        dis(3,"f");
    }
}
 class templates <t>{
    t ob;
    templates(t ob){
        this.ob = ob;
    }
    t getValue(){
        return ob;
    }

     public static void main(String[] args) {
         templates<Integer> ob = new templates<Integer>(12);
         System.out.println(ob.getValue());
         templates<String> ob2 = new templates<String>("hello");
         System.out.println(ob2.getValue());
     }
 }