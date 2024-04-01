package Basic.collectionFramework;

import java.util.*;

/*
queue inteface in avaible in ulit package it extends the collectioninterface
it is an order list of object where insertion of element occures at end of list and removale of
element at the begging of the list

prority queue and linkedlist class are drived from queue interface

prority queue is a class that give us a way for processing the object on the basis of PQ
it is imeplement using heap ds

heap is a compleate binary tree it is of 2 type min & max
min root element is smallest of all level of heap
max vice versa

 */
public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(4);
        p.add(5);
        p.add(2);
        p.add(1);
        p.add(8);
        System.out.println(p);

        Iterator it = p.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }System.out.println();

        p.remove(1);
        System.out.println(p);

        PriorityQueue<Character> p1 = new PriorityQueue<>();
        p1.add('h');
        p1.add('m');
        p1.add('z');
        p1.add('p');
        p1.add('c');
        p1.add('a');
        System.out.println(p1);
        p1.remove('a');
        System.out.println(p1);

        p1.poll();// remove first element in P queue

        System.out.println(p1.peek());
        System.out.println(p1);
    }
}
