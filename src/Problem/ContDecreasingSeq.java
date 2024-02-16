package Problem;

public class ContDecreasingSeq {

    static int decLongest(int[] arr, int len){
        int max=0;
        int count=1;
        for(int i=0; i<len-1; i++){
            if(arr[i+1]<arr[i]){
                count++;
            }
            if(max<count){
                max=count;
            }
            if(arr[i+1]>arr[i]){
                count=1;
            }

        }
        return max;
    }

    static int decCount(int[] arr, int len){
        int count=0;
        int max=0;
        for(int i=0;i<len-1; i++){
            if(arr[i+1]<arr[i]){
                count++;
            }
            if(arr[i+1]>arr[i] || i==len-2){
                if(count!=0){
                    max++;
                    count=0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {10,9,8,11,12,7,6,5,11,4,3,2};
//        int[] arr = {10,9,8,2};

        System.out.println(decCount(arr,arr.length));
//        System.out.println(decLongest(arr,arr.length));

    }
}
