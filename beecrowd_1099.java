import java.util.Scanner;

public class beecrowd_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ( a < b ) {
                int temp = a;
                a = b;
                b = temp;
            }
            int sum = 0;
            for (int i = b + 1; i < a; i++) {
                if ( i % 2 == 1 )
                    sum += i;
            }
            System.out.println(sum);
        }
    }
}
