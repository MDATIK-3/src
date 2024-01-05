import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        int n1 = str.length();
        int n2 = str2.length();

        for (int i = 0; i < n1; i++) {
            int sum1 = Character.toLowerCase(str.charAt(i));
            int sum2 = Character.toLowerCase(str2.charAt(i));
            if ( sum1 == sum2 ) {

                continue;
            } else if ( sum1 > sum2 )
            {
                System.out.println(1);
                return;
            }
            else if ( sum2 > sum1 ) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(0);
    }

}
