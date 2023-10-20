import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i,count=0;
        int [] arr = new int[n];
        for(i=0; i<n; i++){
           arr[i] = sc.nextInt();
           if(arr[i]+k <= 5)
               count++;
        }
        count /= 3;
        System.out.println(count);

    }
}
