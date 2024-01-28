import java.util.Scanner;

public class beecrowd_1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, result = 0;
        int count = 0;
        do {
            x = sc.nextDouble();
            if ( x < 0 || x > 10 )
                System.out.println("nota invalida");
            else {
                if ( count == 2 && (x < 1 || x > 2) ) {
                    count = 0;
                    System.out.println("novo calculo (1-sim 2-nao)");
                    continue;
                }
                if ( x != 1 ) {
                    result += x;
                    count++;
                }
                if ( count == 2 ) {
                    System.out.printf("media = %.2f\n", result / 2.0);
                    System.out.println("novo calculo (1-sim 2-nao)");
                    result = 0;
                }


            }
        } while (x != 2);
    }
}
