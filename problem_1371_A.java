import java.util.Scanner;

public class problem_1371_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
         long num = sc.nextLong();
         if(num % 2 == 0)
             System.out.println(num/2);
         else
             System.out.println(1+((num-1)/2));
        }
    }
}
