import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0, sum2 = 0;
        int arr[][] = new int[ 5 ][ 5 ];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {

                arr[ i ][ j ] = sc.nextInt();
                if ( arr[ i ][ j ] == 1 ) {
                    sum1 = Math.abs(2 - i);
                    sum2 = Math.abs(2 - j);
                    System.out.println(sum1 + sum2);
                    return;
                }
            }
    }

}
