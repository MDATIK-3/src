import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            long p = n-n%x +y;
               if(p<=n){
                   System.out.println(p);
                continue;
               }

            long k = x* (n/x-1) +y;
            System.out.println(k);
        }

    }
}
