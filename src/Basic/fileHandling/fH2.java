package Basic.fileHandling;

import java.io.File;
import java.io.IOException;

public class fH2 {
    public static void main(String[] args) {
        try {
            File f = new File("src/Basic/fileHandling");
            String[] s= f.list();
            for(String k:s){
                System.out.print(k+" ");
            }
            System.out.println();
            File[] file = f.listFiles();
            for(File i:file){
                System.out.println(i.getName()+" "+i.canWrite()+" "+i.length()+" "+i.isHidden());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
/*
actuator 3 30000
pir sensors 4 500
motion base sensor 4 500
2 ardino uno 1000
3 touch sensor 500
2 reading light 700
wooden stuf
motor driver 2 600
 */