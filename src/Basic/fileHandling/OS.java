package Basic.fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

/*
output stream class is an abstract class it is a super class of all classes representing
an in bit
an output stream accept output bits and send them to a destinaiton

some important method
    write(int) throws IOEXCEPTION
    write(byte) throws IOEXCEPTION
    flush()
    close()

sub classes of output stream class
    1 FileOutputStream.
    2 BitArrayOutputStream
    3 FilterOutputStream
        1 DataOutputStream
        2 BufferOutputStream.
        3 PrintStream.
    4 PipedOutputStream
    5 ObjectOutputStream.
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class OS {
    public static void main(String[] args) {
        try {
            FileOutputStream ob = new FileOutputStream("src/Basic/fileHandling/Outputfile.txt");
            String s = "I am HiT";
            byte[] b = s.getBytes(); // this convert string in byte array
            for(Object i:b){
                System.out.print(i+" ");
            }
            ob.write(b);
            ob.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}