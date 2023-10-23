import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int sum=0, max=0;
        while(t-- > 0) {
            String str = sc.nextLine();

            if(str.charAt(1) == '+'){
                sum++;
            }
            else
                sum--;

        }
        System.out.println(sum);
        }
    }

