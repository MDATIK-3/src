import java.util.Scanner;

public class beecrowd_1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b)
                return;
           else if ( a > b ) {
                System.out.println("Decrescente");
            } else
                System.out.println("Crescente");
        }
    }
}
