package Basic;

import java.util.Arrays;

public class stringBuilder {

    public static void main(String[] args){
        StringBuilder s = new StringBuilder();
        for(int i=0 ; i<26; i++){
            char c = (char)('a'+i);
            s.append(c);
        }
        System.out.printf("%s\n",s);
        s.reverse();
        System.out.println(s);

    }
}
