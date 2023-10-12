import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int k = sc.nextInt();
            int i, count = 0, d;

            for(i=1; i<=1800; i++){
                if(i % 3 != 0 && i % 10 != 3){
                    count++;
                    if(count == k){
                        System.out.println(i);
                }}
            }
        }

    }
}