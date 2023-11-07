//import java.util.Scanner;
//
//public class gain_Twenty_Five {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = sc.nextLine();
//        System.out.println(25);
//    }
//}


import java.util.Scanner;

public class gain_Twenty_Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int size = scanner.nextInt();

            int sum = 0;
            int[] nums = new int[ size ];

            for (int i = 0; i < size - 1; i++) {
                nums[ i ] = scanner.nextInt();
                sum += nums[ i ];
            }


            System.out.println(-sum);
        }
    }
}