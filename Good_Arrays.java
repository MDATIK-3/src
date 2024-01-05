import java.util.Scanner;

public class Good_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int num = sc.nextInt();
            long arr[] =  new long[num];
            long sum = 0, count =0;
            for(int i = 0; i< num; i++){
                arr[i] = sc.nextLong();
                sum += arr[i];
                if(arr[i] == 1)
                    count++;
            }
            if(sum >= count+num && num>1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
