package Basic.collectionFramework;
/*
hashset class is used to create a collection that uses a hashtable for storing
it implement set interface ,it contain unqiu element only
it allow null value it is a non syncronics class it doen't maintain insertion order it is the best
apperoch for serach the default cap is 16
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet {

    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>();
        h1.add(93);
        h1.add(90);
        h1.add(43);
        h1.add(3);
        h1.add(9);
        h1.add(null);
        h1.add(60);
        h1.add(0);
        System.out.println(h1);

        Iterator it = h1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\nsize is : "+h1.size());
        h1.remove(60);
        System.out.println(h1);


        // take user input string and store a word in hashset

        HashSet<String> h2 = new HashSet<>();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);

        if(s.charAt(s.length()-1)!=' '){
            s= s +" ";
        }
        int start=0;
        for(int i=0; i<s.length();i++){
            String ss = s.substring(start,i);
            if(s.charAt(i)==' '){
                h2.add(ss.trim());
                start=i;
            }
        }
        System.out.println(h2);


    }
}
