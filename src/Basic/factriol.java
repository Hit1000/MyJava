package Basic;

import java.math.BigInteger;

public class factriol {

    static long fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is: "+fact);
        return 0;
    }

    static int fab(int a){
        int first=0,second = 1;
        int ggg;
            for(int i=1;i<a;i++){
                int sum = first+second;
                first = second;
                second = sum;
            }
            return first;
        }

    static int count_no8(long a){
        int count=0;
        while(a!=0){
            long rem = a%10;
            if(rem == 8){
                count++;
            }
            a/=10;
        }
        return count;
    }

    static void reverse(int a){
        if(a==0){
            return;
        }
        int sum = 0;
        while(a!=0){
            int rem = (a%10);
            sum = (sum*10)+rem;
            a/=10;
        }
        System.out.println(sum);
    }

public static void main(String[] args) {
//    fact(5);
//    palan(345);
//    System.out.println(fab(4));

//    System.out.println(count_no8(758889049567898789L));
//    System.out.println(count_no8(9_223_372_036_854_775_807L));//this is the max size of long

    reverse(748392);

}
}
