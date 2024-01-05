import java.util.Scanner;

public class Coins_1814A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if ( a % b == 0 ) {
                System.out.println("YES");
            }
            else if (n % 2 == 0 || (n % 2 != 0 && b % 2 != 0)){
                System.out.println("YES");
            }
            else if ( a % 2 == 0 || a % (2 + b) == 0 ) {
                System.out.println("YES");


            }


            else
                System.out.println("NO");

        }
    }
}
