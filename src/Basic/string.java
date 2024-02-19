package Basic;

public class string {
    public String toString(){
        String x="ldf";
        return x;
    }
    public static void main(String[] args)
    {
//        String gh = String.toString();
//        System.out.println(gh);

    String a = "hit";
    String b = "hit";
    String c = new String("hit");
    String d = new String("hit");

        //comparison of string
//  1 == comparator it check reference and value
//  2 .equals() method it check only values of string



        System.out.println(a == b);
        System.out.println(c.equals(d));
        System.out.println(c.compareTo(d));

    }
}
