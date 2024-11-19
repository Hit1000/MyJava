package Problem;

import java.util.Arrays;
public class fibo {
    static public int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int[] dp = new int[100];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fib(7));
    }
}
