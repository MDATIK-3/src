import java.util.Scanner;

public class AB_1772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            String str = sc.next();
            int sum = (int) (str.charAt(0) + str.charAt(2)) ;
            System.out.println(sum-96);


        }
    }
}
