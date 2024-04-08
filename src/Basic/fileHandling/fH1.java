package Basic.fileHandling;
/*
java use a concept of stream to make i/o operation faster
the java.io package contain all the class required for i/o operation
stream is a sequence of data in java stream of bits
3 stream is created automatical for us all these 3 are attached to conule
    system.in - standart input
    system.out -   ||    output
    system.err -   ||    error
java app use an input stream to read input from source to read data from source can be a file
souckit and any device
java app use output stream to write to destination a file, soucket, and printer
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class fH1 {
    public static void main(String[] args) {
        try {
            FileOutputStream ob = new FileOutputStream("src/Basic/fileHandling/file.txt");
            ob.write(65);
            ob.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
