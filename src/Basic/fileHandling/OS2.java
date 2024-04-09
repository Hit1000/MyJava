package Basic.fileHandling;


import java.io.File;
import java.io.IOException;

public class OS2 {
    public static void main(String[] args) {
        try{
            File f = new File("src/Basic/fileHandling/a.txt");
            if(f.createNewFile()){
                System.out.println("new");
            }
            else{

                System.out.println("already present");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
