import java.util.Scanner;

public class beecrowd_1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double result;
            if ( b == 0 ) {
                System.out.println("divisao impossivel");

            } else {
                result = (double) a / b;
                System.out.printf("%.1f\n", result);
            }
        }

        sc.nextLine();

    }
}
