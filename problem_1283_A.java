import java.util.Scanner;

public class problem_1283_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (23 - a) * 60 + (60 - b);
            System.out.println(result);
        }
    }
}
