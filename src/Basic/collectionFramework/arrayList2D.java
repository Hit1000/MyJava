package Basic.collectionFramework;
import java.util.*;


public class arrayList2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> v = new ArrayList<>();

        // initialisation the inside arraylist
        for(int i=0; i<3; i++){
            v.add(new ArrayList<>());
        }

        for(int j=0; j<3; j++) {
            for (int i = 0; i < 3; i++) {
                v.get(j).add(in.nextInt());
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(v.get(i));
        }
        System.out.println(v);


    }
}
