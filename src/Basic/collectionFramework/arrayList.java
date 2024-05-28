package Basic.collectionFramework;

//it use a dynimic array for storeing a element it is a vector
//it is much more flexiable than array
//it can have duplate element also. it mantain insertion order. it is a non syncronise
//it allow random access
//in this manipulation is a little slow than in LL in java as lot of shifting is needed



import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(1);
        b.add(1);

        a.add(5);
        a.addAll(b);
        a.add(4);
        a.add(4);
        a.addFirst(94); //// add at first place
        a.add(1,2); //// add the element a perticalut index
        a.add(a.size(),9);//// same as add()
        System.out.println(a);

//        a.clear();////delete all
//        System.out.println(a);

        for(Object i :a){ ////work for Integer, int, and object is as auto in cpp
            System.out.print(i+" ");
        }
        System.out.println();

        a.remove(4);
        System.out.println(a);

        a.set(3,3838);
        System.out.println(a);

        System.out.println(a.get(3));

        System.out.println(a.isEmpty());

//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }

        System.out.println(a.indexOf(9));
        System.out.println(a.lastIndexOf(9));


        ArrayList<Integer> re = new ArrayList<>();
        ArrayList<Integer> rr = new ArrayList<>();
        re.add(1);
        re.add(3);
        re.add(2);
        rr.add(3);
        rr.add(4);
        rr.add(2);
        System.out.println(re.contains(1));
        re.retainAll(rr);// return intersection of elements
        System.out.println(re);
        System.out.println(re.indexOf(3));
    }
}
