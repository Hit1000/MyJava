package Basic.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class arrayListString {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("world");
        a.add("hello");
        a.add("world");
        a.add("hello");

        System.out.println(a);
        for(String s:a){
            System.out.println(s);
        }

        Iterator itr = a.iterator();
        System.out.println(itr);//starting point of stringList
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Object k[] = a.toArray();
        for(Object o:k){
            System.out.print(o+" ");
        }
        System.out.println();

        a.remove(0);
        a.remove("hello");
        a.set(1,"changed");

        System.out.println(a);

        //sort karta da ArrayList ko
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);


    }
}
