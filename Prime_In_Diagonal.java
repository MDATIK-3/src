//import java.util.Scanner;
//
//public class Prime_In_Diagonal {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//            int i,j;
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int max_value = 0;
////        int n = arr.length;
//
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < n; j++) {
//                if (i == j || j == n - i - 1) {
//                    int num = arr[i][j];
//                    for (int k = 2; k <= num / 2; k++) {
//                        if (num % k == 0) {
//                            // num is not prime
//                            break;
//                        }
//                        if (k == num / 2 && max_value < num) {
//                            max_value = num;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(max_value);
//    }
//}




import java.util.Scanner;

public class Prime_In_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max_value = 0;
//        int n = arr.length;

        for(i=0; i<n; i++){
            if(Prime(arr[i][i]) && arr[i][i] > max_value)
            {
                max_value = arr[i][i];
            }
            if(Prime(arr[i][n-i-1]) && arr[i][n-i-1] > max_value)
            {
                max_value = arr[i][n-i-1];
            }

        }





        System.out.println(max_value);

        }
    public static boolean Prime(int num){

        if ( num < 2 )
        return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
        if ( num % i == 0 )
        return false;
        }
        return true;
    }
}

