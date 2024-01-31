package Call;

import java.util.Scanner;

public class arrayObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 5;
        student[] obj = new student[5];

        for(int i=0;i<n;i++){
            obj[i] = new student();
            obj[i].setRoll_no(i+1);

//            System.out.println("enter the name "+(i+1)+" : ");
//            obj[i].setName(in.nextLine());

            obj[i].setName("ram nath");
            obj[i].setMark(i+95.4D);
        }
        for(student t:obj){
            System.out.println(t);
        }
    }
}
