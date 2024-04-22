package Basic.other;

public class thisCon {
    int a=23,b=3;
    thisCon(){
        System.out.println("No arg const");

    }
    thisCon(int x){
        this();//this is to call no arg const
        System.out.println("2 wala "+x);

    }
    public String toString(){
        String x="ldkf["+a+" "+b+"]";
        return x;
    }
    public static void main(String x[]){
        thisCon obj = new thisCon(3);
        System.out.println(obj);
    }
}
