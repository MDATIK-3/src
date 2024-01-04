import java.util.Scanner;

public class Cut_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c)
        {
            System.out.println(1);

        } else if(a+b+c < n) {
            System.out.println(n);
        }
        else if(a+b >=n || b+c>=n || c+a>=n)
            System.out.println(2);
        else
            System.out.println(2);
    }
}
