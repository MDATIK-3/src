import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sub=0, max=0;
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sub += (b-a);
            if(max < sub)
                max=sub;

        }

        System.out.println(max);
    }
}
