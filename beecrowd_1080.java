import java.util.Scanner;

public class beecrowd_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[ 100 ];
        for (int i = 0; i < 100; i++) {
            arr[ i ] = sc.nextLong();
        }
        long max = arr[ 0 ], index = 0;
        for (int i = 1; i < 100; i++) {
            if ( arr[ i ] > max ) {
                max = arr[ i ];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
