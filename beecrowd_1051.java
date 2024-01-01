import java.util.Scanner;

public class beecrowd_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double result = 0, temp;

        sc.nextLine();
        if ( num <= 2000 ) {
            System.out.println("Isento");
            return;
        }

        if ( num > 4500 ) {
            result += (num - 4500) * .28;
            temp = num - 4500;
            num -= temp;
        }
        if ( num > 3000 ) {
            result += (num - 3000) * .18;
            temp = num - 3000;
            num -= temp;
        }
        if ( num > 2000 ) {
            result += (num - 2000) * .08;

        }


        System.out.printf("R$ %.2f\n", result);
    }
}
