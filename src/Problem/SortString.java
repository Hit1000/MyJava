package Problem;
import java.util.Scanner;
public class SortString {
    static Scanner in = new Scanner(System.in);

    static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    public static void main(String[] args) {
//        String input = in.next();
        String input = "welcome";
        char[] output = new char[input.length()];

        System.out.println(input);

        int i,j,temp;
        for(i=0; i<input.length(); i++){

            for(j = 0; j<input.length()-1; j++){
                if(input.charAt(j)>input.charAt(j+1)){
                    input =(swap(input, j,j+1));
//                    break;
                }
            }

        }
        System.out.println(input);



    }

}
