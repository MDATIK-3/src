import java.util.Scanner;

public class Odd_Set {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while(t-- >0) {
            int n = scanner.nextInt();
            int[] arr = new int[n*2];

            int i, count_even=0, count_odd=0;
             for(i=0; i<n*2; i++){
                 arr[i] = scanner.nextInt();
                 if(arr[i] % 2 == 0){
                     count_even++;
                 }
                 else
                     count_odd++;
             }

             if(count_odd == count_even)
                 System.out.println("Yes");
             else
                 System.out.println("No");
        }

        }
}
