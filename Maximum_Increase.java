import java.util.Scanner;

public class Maximum_Increase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];

        long max=1, count=1;
        int i;

        for(i=0; i<n; i++) {

            arr[ i ] = scanner.nextInt();
        }
        for(i=1; i<n; i++){

            if(arr[i-1] < arr[i]){
                count++;
            }
            else
                count = 1;

            if(max < count)
                max = count;
        }

                System.out.println(max);

    }
}
