import java.util.Scanner;

public class beecrowd_1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, k = 7;
        while (i <= 9) {
            for (int j = k; j >= k - 2; j--)
                System.out.printf("I=%d J=%d\n", i, j);
            i = i + 2;
            k = k + 2;
        }
    }
}
