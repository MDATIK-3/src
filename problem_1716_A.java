import java.util.Scanner;

public class problem_1716_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long num = sc.nextLong();
            if (num == 1)
                System.out.println(2);
            else if (num == 2 || num == 3)
                System.out.println(1);
            else {
                long temp = (long) Math.ceil((double) num / 3);
                System.out.println(temp);
            }
        }
    }
}
