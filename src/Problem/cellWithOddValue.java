package Problem;

public class cellWithOddValue {
    public static void main(String[] args) {
        int[][] indices = {{1, 1}, {0, 0}};
        int m = 2;
        int n = 2;

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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(((row[i] + col[j])&1) == 1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
