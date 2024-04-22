package Basic.other;

import java.util.Arrays;

public class stringMethod {
    public static void main(String[] args) {
        String s = "HITESH SINGLA";
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(Arrays.toString(s.split(" ")));

        System.out.println("    hit    ".strip());// remove white spaces
    }
}
