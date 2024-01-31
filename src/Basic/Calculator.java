package Basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);


        while(true){
            System.out.println("Enter the operator :");
            char op = in.next().trim().charAt(0);
            if(op == '+'|| op == '-'|| op == '*'|| op == '/'){
                int num1,num2;
                System.out.println("Enter num1 :");
                num1 = in.nextInt();
                System.out.println("Enter num2 :");
                num2 = in.nextInt();
                switch (op){
                    case '+':
                        System.out.println(num1+num2);
                        break;
                    case '-':
                        System.out.println(num1-num2);
                        break;
                    case '*':
                        System.out.println(num1*num2);
                        break;
                    case '/':
                        if(num2!=0){
                            System.out.println(num1/num2);
                        }
                        break;
                }
            }
            else if(op == 'x' || op == 'X'){
                System.out.println("\n" +
                        "                                                                                                         \n" +
                        "         88                                    88                                                        \n" +
                        "  ,d     88                                    88                                                        \n" +
                        "  88     88                                    88                                                        \n" +
                        "MM88MMM  88,dPPYba,   ,adPPYYba,  8b,dPPYba,   88   ,d8       8b       d8   ,adPPYba,   88       88      \n" +
                        "  88     88P'    \"8a  \"\"     `Y8  88P'   `\"8a  88 ,a8\"        `8b     d8'  a8\"     \"8a  88       88      \n" +
                        "  88     88       88  ,adPPPPP88  88       88  8888[           `8b   d8'   8b       d8  88       88      \n" +
                        "  88,    88       88  88,    ,88  88       88  88`\"Yba,         `8b,d8'    \"8a,   ,a8\"  \"8a,   ,a88      \n" +
                        "  \"Y888  88       88  `\"8bbdP\"Y8  88       88  88   `Y8a          Y88'      `\"YbbdP\"'    `\"YbbdP'Y8      \n" +
                        "                                                                  d8'                                    \n" +
                        "                                                                 d8'                                     \n");
                break;
            }
            else {
                System.out.println("invalid");
            }
        }
    }
}
