import java.util.Scanner;

public class today_25_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            long sum=0;
            long num = sc.nextInt();
            sum = (long)(num-1)/2;
            System.out.println(sum);
        }

            }
}
