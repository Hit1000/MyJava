package Basic.other;

public class commandLineArgs {
    public static void main( String[] args) {
        for (int i = 0; i < args.length; i++) {// args[0] if put like "hit" this is on one index
            System.out.print(args[i]+" ");
        }

        int sum=0;
        for (int i = 0; i < args.length; i++)
            sum+=Integer.parseInt(args[i]);

        System.out.println(sum);
    }
}
