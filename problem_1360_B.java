import java.util.Arrays;
import java.util.Scanner;

public class problem_1360_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int[] arr = new int[ a ];
            for (int i = 0; i < a; i++)
                arr[ i ] = sc.nextInt();
            Arrays.sort(arr);
            int min = arr[ 1 ] - arr[ 0 ];
            for (int i = 2; i < a; i++) {
                if ( arr[ i ] - arr[ i - 1 ] < min )
                    min = arr[ i ] - arr[ i - 1 ];
            }
            System.out.println(min);
        }
    }
}
