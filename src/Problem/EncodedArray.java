package Problem;

public class EncodedArray {

    static int decode(int[] arr, int len){
        int sum=0;
        for(int i=len-1; i>0; i--){
            arr[i-1] = arr[i-1] - arr[i];
        }
//        for(int i:arr){
//            System.out.print(i+" ");
//            sum+=i;
//        }
        return sum;
    }

    public static void main(String[] args) {

        //  {  7 6 8 16 12 3 }
        //  {  2 5 1  7  9 3 }

        int[] arr ={7,6,8,16,12,3};
        System.out.println(decode(arr,arr.length));
    }
}
