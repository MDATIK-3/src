import java.util.Scanner;

public class beecrowd_1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
           int n = sc.nextInt();

            if ( n == 0 )
                return;
            for(int i = 1; i<=n; i++) {
                System.out.printf("%d", i);

                if ( n != 0 )
                    System.out.printf(" ");
            }
            System.out.println();

        }
    }
}
