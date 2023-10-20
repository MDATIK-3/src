import java.util.Scanner;

public class Reversr_Integer {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rem, rn=0;
        if(a < Integer.MIN_VALUE || a > Integer.MAX_VALUE)
            return 0;
        while (a !=0){
            rem = a%10;
            rn = rn*10 + rem;
            a /=10;
        }
        return rn;
    }
}
