package Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    static Scanner in = new Scanner(System.in);
    static void input(int[][] arr, int n, int m){


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("enter "+(i+1)+" "+(j+1));
                arr[i][j] = in.nextInt();
            }
        }
    }

    static void sorts(int[][] arr, int n, int m){
        int[] a = new int[m*n];
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[count++] = arr[i][j];
            }
        }
        Arrays.sort(a);
        count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = a[count++];
            }
        }
    }

    static void sorts_by_row(int[][] arr, int n){
        for(int i=0; i<n; i++){
            Arrays.sort(arr[i]);
        }
    }

    static void sorts_by_col(int[][] arr, int n, int m){
        int[] a = new int[m*n];
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[count++] = arr[i][j];
            }
        }
        Arrays.sort(a);
        count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[j][i] = a[count++];
            }
        }
    }

    static void print(int[][] arr,int n){
        for(int i=0; i<n;i++){
            for(int j:arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

    System.out.println("row : ");
        int n = in.nextInt();
    System.out.println("column : ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];


        input(arr,n,m);

//        sorts(arr,n,m);
//        sorts_by_row(arr, n);
        sorts_by_col(arr, n, m);
        print(arr, n);



    }
}
