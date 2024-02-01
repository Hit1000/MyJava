package Problem;

public class isPrime {
//    main
    public static void main(String[] args) {
        boolean ans = isPrime(33);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if(n<1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;

    }
}
