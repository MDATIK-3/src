import java.util.Scanner;

public class beecrowd_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.printf("%d x %d = %d\n", i, N, i*N);
        }
    }
}
