import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        while (n > 0) {
            if ( n % 2 == 0 ) {
                System.out.printf("%d ", n);
                n /= 2;
            } else {
                for (long i = 3; i <= n; i++) {
                    if ( n % i == 0 ) {
                        System.out.printf("%d ", n);
                        n /= i;
                        i=2;
                    }
                }

            }
            if ( n == 1 ) {
                System.out.printf("%d\n", 1);
                break;
            }
        }


    }
}
