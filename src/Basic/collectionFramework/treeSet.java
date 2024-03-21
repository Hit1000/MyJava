package Basic.collectionFramework;

import java.util.TreeSet;

/*
java tree set dont allow null element it contain unique element like hashset
it is non syncronise class
it maintain asecending order
 */
public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(930);
        t1.add(30);
        t1.add(0);
        t1.add(93);
        t1.add(90);
        t1.add(330);
        System.out.println(t1);

        System.out.println(t1.pollFirst());// type of pop
        System.out.println(t1.pollLast());

        System.out.println(t1);
        System.out.println(t1.descendingSet());

    }
}
