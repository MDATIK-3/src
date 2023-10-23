import java.util.Arrays;
import java.util.Scanner;

public class Counting_Rhyme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int i, count = 0;
            for(i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(arr[i] >= arr[j]){
                    if(arr[i] % arr[j] != 0){
                        count++;
                    }}
                    else {
                        if(arr[j] % arr[i] != 0){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);


        }
    }
}
