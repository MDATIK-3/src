public class Rotate_Image {


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[n][m];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = n - 1; j >= 0; j--)
                arr[j][i] = matrix[i][j];
        }
        for (i = 0; i < m; i++)
            for (j = 0; j < m; j++)
                matrix[j][n - 1 - i] = arr[i][j];

    }
}
