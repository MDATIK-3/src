import java.util.Scanner;

public class beecrowd_1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ( a == 0 || b == 0 )
                return;
            else if ( a > 0 && b > 0 ) {
                System.out.println("primeiro");
            } else if ( a < 0 && b < 0 ) {
                System.out.println("terceiro");
            } else if ( a < 0 && b > 0 ) {
                System.out.println("segundo");
            } else
                System.out.println("quarto");
        }
    }
}
