import java.util.Scanner;

public class Mian3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        b[0] = 0;

        for (int i = 1; i < n; i++) {
            if (a[i - 1] % 2 == 0) {
                b[i] = (b[i - 1] + a[i - 1]) % 6;
            } else {
                b[i] = (b[i - 1] + 1) % 6;
            }
        }

        // Output b values within the range [0, 5]
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
