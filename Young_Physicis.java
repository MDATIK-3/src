import java.util.Scanner;

public class Young_Physicis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int arr[][] = new int[n][ 3 ];
        for (int i = 0; i < n; i++)
        for(int j=0; j<3; j++){

            arr[ i ][j] = sc.nextInt();

            if ( j == 0 )
                sum1 += arr[ i ][j];
            else if ( j == 1 )
                sum2 += arr[ i ][j];
            else if ( j == 2 )
                sum3 += arr[ i ][j];

        }
        if(sum1==0 && sum2 == 0 && sum3 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
