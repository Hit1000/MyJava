package Problem;

public class cellWithOddValue {
    public static void main(String[] args) {
        int[][] indices = {{0, 1}, {1, 1}};
        int m = 2;
        int n = 3;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int[] a:indices){
            row[a[0]]++;
            col[a[1]]++;
        }

        for(int i:row){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:col){
            System.out.print(i+" ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[0].length; j++) {
                System.out.print(indices[i][j]);
            }
            System.out.println();
        }
    }
}
