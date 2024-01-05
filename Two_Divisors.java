import java.util.Scanner;

public class Two_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long sum = 0;

            if ( a > b ) {
                int temp = a;
                a = b;
                b = temp;
            }

            long temp = Math.max(a * 2, b);
            System.out.println(temp * temp);
        }
    }
}