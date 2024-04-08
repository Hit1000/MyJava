package Basic.fileHandling;
/*
Input stream class it is an abstract, it is a super class represanting all the class in byte
some important method
    int read() throws IOE--
    int available()
    close()

Input stream sub classes
    1 FileInputStream
    2 BitArrayInputStream
    3 FilterInputStream
        1 DataInputStream
        2 BufferInputStream
        3 PushbackInputStream
    4 PipedInputStream
    5 ObjectInputStream
 */
import java.io.*;
public class IS {
    public static void main(String[] args) {
     try {
        FileInputStream ob = new FileInputStream("src/Basic/fileHandling/Outputfile.txt");
        int k ;//= ob.read();
//        System.out.println(k + " " + (char) (k));
        while((k=ob.read()) != -1){
            System.out.print((char)(k));
        }
        ob.close();
    }
    catch(IOException e){
        System.out.println(e);
    }
    }
}
