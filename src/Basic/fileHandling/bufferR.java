package Basic.fileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
buffer reader class to take input from user by console


 */
public class bufferR {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("src/Basic/fileHandling/Filewriter.txt");
            InputStreamReader o = new InputStreamReader(f);
//            InputStreamReader o = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(o);

            System.out.println("enter name");
            String s = br.readLine();
            System.out.println(s);

//            while(!s.equals("stop")){
//                System.out.println("\nenter name again : ");
//                s = br.readLine();
//                System.out.println(s);
//            }

            br.close();
            o.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
