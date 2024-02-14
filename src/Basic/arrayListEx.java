package Basic;

import java.util.*;

public class arrayListEx {

    public static void main(String[] args) {
     ArrayList<Integer> vector = new ArrayList<>();

     //add
     vector.add(45);
     vector.add(454);
     vector.add(4);
     vector.add(24);
     vector.add(2);
     System.out.println(vector);

//     search
        System.out.println(vector.contains(4));

//     update
         vector.set(0,89);

//         remove
         vector.remove(1);

//         to access element in vector/arraylist
         vector.getFirst(); // return 0 element
         vector.get(3);


     //print
     System.out.println(vector);

        System.out.println(vector.size());


    }
}
