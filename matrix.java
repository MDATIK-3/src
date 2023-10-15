public class matrix {
    public static void main(String[] args) {


    }
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
        int i,j;
        boolean flag = false;
           int m = matrix.length;
           int n = matrix[0].length;
           for(i=0; i<m; i++){
               for(j=0; j<n; j++){
                   if(matrix[i][j] == target)
                   {
                       flag = true;
                       break;
                   }

               }
           }
           if(flag){
               return true;
           }
           else
               return false;
        }
    }
}
