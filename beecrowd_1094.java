import java.util.Scanner;

public class beecrowd_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t_c = 0, t_r = 0, t_s = 0;
        sc.nextLine(); // Consume the newline character after reading n

        while (n-- > 0) {
            int a = sc.nextInt();
            String str = sc.next(); // Use next() instead of nextLine()

            if (str.equals("C")) {
                t_c += a;
            } else if (str.equals("R")) {
                t_r += a;
            } else if (str.equals("S")) {
                t_s += a;
            }
        }

        int result = t_c + t_r + t_s;
        System.out.println("Total: " + result + " cobaias");
        System.out.printf("Total de coelhos: %d\n", t_c);
        System.out.printf("Total de ratos: %d\n", t_r);
        System.out.printf("Total de sapos: %d\n", t_s);

        double x = ((double) t_c / result) * 100;
        double y = ((double) t_r / result) * 100;
        double z = ((double) t_s / result) * 100;

        System.out.printf("Percentual de coelhos: %.2f %%\n", x);
        System.out.printf("Percentual de ratos: %.2f %%\n", y);
        System.out.printf("Percentual de sapos: %.2f %%\n", z);

        // sc.nextLine(); // You don't need this line
        sc.close(); // Close the Scanner at the end of the program
    }
}
