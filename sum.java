import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] n1 = new long[n];

//        int n = sc.nextInt();
        long sum1 = 0;
     for(int i=0; i<n; i++) {
         n1[i] = sc.nextInt();
         sum1 += n1[i];

     }

        System.out.println(sum1);
        }
    }

