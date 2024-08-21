package Basic.other;

import java.util.*;
//is used to create new table string obj
//is a thread safe class so multiple thread can not access simaliraly
//capacity increase by currentCapacity*2+2


public class stringBuilder {

    public static void main(String[] args){
        StringBuilder s = new StringBuilder("hello ");

        System.out.println(s.length());
        System.out.println(s.capacity());

        s.insert(3,"ADDED");
        System.out.println(s);

        s.replace(0,3,"REPLACED ");
        System.out.println(s);
        s.delete(1, 5);

//        for(int i=0 ; i<26; i++){   // for abc to z
//            char c = (char)('a'+i);
//            s.append(c);
//        }
        System.out.printf("%s\n",s);
        s.reverse();
        System.out.println(s);
        s.reverse();


        System.out.println(s.substring(2));
        String k = s.substring(3,8);
        System.out.println(k);

        System.out.println(s.length());
        System.out.println(s.capacity());

        String su = "son";
        System.out.println(su);

//        Sunil Sunli Suinl Suiln Sulin
        permute(su,0,su.length()-1);

        System.out.println();
        // convert the value of string into int
        StringBuilder s5 = new StringBuilder("02002");
        System.out.println("value of "+Integer.parseInt((String.valueOf(s5))));



    }
    static void permute(String s, int start, int end){
        if(start==end){
            System.out.print(s+" ");
        }
        for(int i=start; i<=end; i++){
            s = swap(s, start, i);
            permute(s,start+1, end);
        }
    }


    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
