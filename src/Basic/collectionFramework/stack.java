package Basic.collectionFramework;

import java.util.Scanner;
import java.util.Stack;

/*

 */
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack s2 = new Stack();
        s1.add(9);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        s2.add(9);
        s2.push((byte)(4));
        s2.add(3.44d);
        s2.push(2.4f);

        System.out.println(s1);
        System.out.println(s2 + "\n");

        s1.pop();
        s2.pop();

        System.out.println(s1.peek());
        System.out.println(s2.peek()+"\n");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.search(9));


        // take a user string and check a palandrom

        Scanner in = new Scanner(System.in);
        Stack<Object> st = new Stack<>();
        String s = in.nextLine();
        String sc="";
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            sc = sc+st.pop();
        }
        if(sc.equals(s)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
