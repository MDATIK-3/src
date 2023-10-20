import java.util.Scanner;


class Solution5 {
    public int countOdds(int low, int high) {
        int range = high -low +1;
        int half = (int) (range/2);
        if(low % 2 != 0 && high % 2 != 0){
            return half+1;
        }
        else
            return half;



    }
}

public class Plus_or_Minus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int i, sum = 0, d;
            if(a+b == c)
                System.out.println("+");
            else
                System.out.println("-");
    }
}}




