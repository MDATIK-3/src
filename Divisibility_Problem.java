import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int k = sc.nextInt();
            int m = sc.nextInt();
                int count = 0;
            if(k % m == 0)
                System.out.println(count);
            else {
                for(int i=k+1; ;i++){
               count++ ;
                    if(i % m == 0){
                        System.out.println(count);
                        break;
                    }
                    else
                        continue;
                }
            }

        }
    }
}
