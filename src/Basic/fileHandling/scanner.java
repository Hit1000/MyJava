package Basic.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        try {
            File f = new File("src/Basic/fileHandling/Outputfile.txt");
            Scanner in = new Scanner(f);
            while(in.hasNext()){
//                System.out.println(in.next());// it take single word
                System.out.println(in.nextLine());// it take full line
            }
        }
        catch (Exception e) {
            System.out.println(e);;
        }

    }
}
