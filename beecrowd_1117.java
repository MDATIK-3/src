import java.util.Scanner;

public class beecrowd_1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int invalid = 0, valid = 0;
        double sum = 0;
        while (true) {
            double a = sc.nextDouble();
            if ( a < 0 || a > 10 ) {
                invalid++;
                System.out.println("nota invalida");
            } else if ( a > 0 ) {
                valid++;
                sum += a;
            }
            if ( valid == 2 ) {
                System.out.println("media = " + sum / 2);
                sum = 0;
                return;
            }


        }
    }
}
