import java.util.Scanner;


public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long result=0, sub;

            sub = Math.abs(x-y);
//            System.out.println(sub);

            double div = (double) (sub/10.0);
           result = (long)(sub/10);

//            System.out.println(div);
//            System.out.println(result);

           if(div > result)
               result++;

            System.out.println(result);

        }
    }
}
