import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        while (t-- > 0){
//        int n = sc.nextInt();
//        long[] n1 = new long[n];
//
////        int n = sc.nextInt();
//         long sum = 0;
//             for(int i=0; i<n; i++) {
//                      sum += sc.nextInt();
//                      }
//
//         System.out.println(Math.abs(sum));
//        }




                int[] a =  new int[n];
                a[0]=1;
                a[1]=2;

                for(int i=2;i<n;i++){
                    a[i]=a[i-1]+a[i-2];
                }
        System.out.println( a[n-1]);




         }

    }

