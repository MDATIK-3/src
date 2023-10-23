import java.util.HashSet;
import java.util.Scanner;

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

    static class CountDistinctCharacters {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                sc.nextLine();

            String inputString = sc.nextLine();

            int distinctCharacterCount = countDistinctCharacters(inputString);

                if (distinctCharacterCount == k - 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }}

        public static int countDistinctCharacters(String input) {
            HashSet<Character> uniqueCharacters = new HashSet<>();

            // Iterate through the characters of the input string
            for (char c : input.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    uniqueCharacters.add(c);
                }
            }

            return uniqueCharacters.size();
        }
    }
}
