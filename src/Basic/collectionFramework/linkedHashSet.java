package Basic.collectionFramework;

import java.util.LinkedHashSet;

/*
java linked hash set contain unique element only like hash set
it also provide adding the null element it is non synctonas class
java it contain insertion order
 */
public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
        l1.add(93);
        l1.add(43);
        l1.add(3);
        l1.add(null);
        l1.add(9);
        l1.add(9);
        l1.add(5);
        System.out.println(l1);


    }
}
