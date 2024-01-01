import java.util.Arrays;
import java.util.Scanner;

public class beecrowd_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[ 3 ];
        int[] brr = new int[ 3 ];
        for (int i = 0; i < 3; i++) {
            arr[ i ] = sc.nextInt();
        }
        System.arraycopy(arr, 0, brr, 0, 3);
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[ i ]);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(brr[ i ]);
        }
    }
}
