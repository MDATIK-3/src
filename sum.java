import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
int t = sc.nextInt();
while(t-- >0) {
    String str = sc.nextLine();
    String[] parts = str.split("\\+");

    int num1 = Integer.parseInt(parts[ 0 ]);
    int num2 = Integer.parseInt(parts[ 1 ]);
    int sum = num1 + num2;
    System.out.println(sum);


}


         }

    }

