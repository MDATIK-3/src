import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long result = (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);
        System.out.println(result);
    }
}
