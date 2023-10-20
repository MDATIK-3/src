import java.math.BigInteger;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c)
            System.out.println(0);
        else if(a>b && a>c)
        {
            if(b>c)
                System.out.println(a-c);
            else
                System.out.println(a-b);
        }

        else if(b>a && b>c)
        {
            if(a>c)
                System.out.println(b-c);
            else
                System.out.println(b-a);
        }
        else
        {
            if(b>a)
                System.out.println(c-a);
            else
                System.out.println(c-b);
        }
    }
}
