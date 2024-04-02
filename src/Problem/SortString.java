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

//      insertion sort
        String input = "welcome";
        System.out.println(input);
        for(int i=0; i<input.length(); i++){

            for(int j = 0; j<input.length()-1; j++){
                if(input.charAt(j)>input.charAt(j+1)){
                    input = (swap(input, j,j+1));
                }
            }
        }
        System.out.println(input);


//      bubble sort
        StringBuilder s = new StringBuilder("alkshdfkkv");
        System.out.println(s);
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length()-i-1;j++){
                if(s.charAt(j) > s.charAt(j+1)){
                    char c = s.charAt(j);
                    s.setCharAt(j,s.charAt(j+1));
                    s.setCharAt(j+1,c);
                }
            }
        }
        System.out.println(s);


    }

}
