package Basic.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;

/*
it is a abstract class for writing to char streams
method of writer class
append
write
close
flush
some of the important classes are buffer reader, inputStream reader, charArray reader, String reader
some of the important classes are inherited r ||    fileWriter        ||        print writer  ||
 */
public class writer {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("src/Basic/fileHandling/Filewriter.txt");
            f.write("I am HIT");
            f.close();

            FileReader f1 = new FileReader("src/Basic/fileHandling/Filewriter.txt");
            int ch;
            while((ch=f1.read())!=-1){
                System.out.print((char)(ch));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}