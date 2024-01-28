import java.util.Scanner;

public class problem_492_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / 2;
            if ( sum == n ) {
                System.out.println(i);
                break;
            } else if ( sum > n ) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}
