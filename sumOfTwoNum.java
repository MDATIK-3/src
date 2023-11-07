import java.util.Scanner;
import static java.lang.Character.*;

public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
           int n = scanner.nextInt();
           int[ ] arr = new int[n];
           int even_count=0, odd_count=0 , sum=0;
            for(int i=0; i<n; i++){
               arr[i] =  scanner.nextInt();
               if(arr[i] % 2 == 0)
                   even_count++;
               else
                   odd_count++;
              sum += arr[i];
           }
            if(sum % 2 == 1 || (odd_count>0 && even_count >0) )
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}