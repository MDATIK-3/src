import java.util.Scanner;

public class Deja_Vu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while(t-- >0){
            int n = scanner.nextInt();
            int q = scanner.nextInt();


            long arr[] = new long[n];
            long brr[] = new long[q];

            int i,j;
            for(i=0; i<n; i++)
                arr[ i ] = scanner.nextLong();
            for(i=0; i<q; i++)
                brr[ i ] = scanner.nextLong();

            for(i=0; i<n; i++){
                for(j=0; j<q; j++){
                    if(arr[i] % Math.pow(2, brr[j]) == 0){
                        arr[i] += (long)Math.pow(2, brr[j]-1);
                    }
                }
            }


            for(i=0; i<n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

        }
    }
}
