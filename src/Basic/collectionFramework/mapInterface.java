package Basic.collectionFramework;
// map interface :- map contains value on the basis of keys
// each key and value pair is known as entry
// map contains unique keys
// map does not allows duplicate keys but you have duplicate values
// hashmap and linked hashmap allows null keys and value but tree map does not allows it
// map can not be traverse so it need to be converted into the set using key set and entry set method

import java.util.HashMap;
import java.util.Map;

/*
hashmap dont contain insertion order

 */
public class mapInterface {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<>();
        h.put(1,"hit");
        h.put(2,"hit");
        h.put(3,"def");
        System.out.println(h);

        for(Map.Entry e: h.entrySet()){
            System.out.print(e.getKey());
            System.out.println(" "+e.getValue());
        }
        h.putIfAbsent(2,"hit");
        System.out.println( h.putIfAbsent(2,"hit")); // ignore case
        System.out.println( h.putIfAbsent(4,"hitesh"));
        h.remove(2);
        System.out.println(h);
        h.replace(1,"hit","god");
        h.put(2,"hit");
        System.out.println(h);
        System.out.println(h.containsKey(3));

        for (int i = 0; i < 5; i++) {
            System.out.println(h.get(i));
        }

        System.out.println(h.isEmpty());
    }
}
