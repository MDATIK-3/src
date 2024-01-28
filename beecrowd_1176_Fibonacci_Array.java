import java.util.Scanner;

public class beecrowd_1176_Fibonacci_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            long arr[] = new long[ 61 ];
            arr[ 0 ] = 0;
            arr[ 1 ] = 1;
            for (int i = 2; i <= a; i++) {
                long temp = arr[ i - 1 ] + arr[ i - 2 ];
                arr[ i ] = temp;
            }
            System.out.println("Fib (" + a + ") = " + arr[ a ]);
        }
    }
}
