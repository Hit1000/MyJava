package Problem;

import java.util.*;

public class temperatures {
    private ArrayList<Double> temp = new ArrayList<>();

    public void cleanDate(double lower, double upper){
        for(int i=0; i<temp.size(); i++){
            if(temp.get(i)<lower || temp.get(i)>upper){
                temp.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold){
        int size = 0;
        int max = 0;
        for(int i=0; i<temp.size(); i++){
            if(temp.get(i) > threshold) {
                size++;
                if(size>max){
                    max=size;
                }
            }
            else{
                size=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        double[] a = {34,52,87,85,97,90,98,89,98,45,113,56,120,111,87,200,9};
        double[] a = {99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5};
//        double[] a = {100.5,98.5,102.0,103.9,87.5,105.2,90.3,94.8,109.1,102.1,107.4,93.2};
        temperatures t = new temperatures();

        for(double i:a){
            t.temp.add(i);
        }

    //  1
        t.cleanDate(85d,120d);
    //  2
        System.out.println(t.longestHeatWave(100.5));
        System.out.println(t.longestHeatWave(95.2));

        for(Object i:t.temp){
            System.out.print(i+" ");
        }

    }
}
