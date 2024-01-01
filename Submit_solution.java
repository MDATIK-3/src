import java.util.Scanner;

public class Submit_solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            char result = str.charAt(n - 1);
            System.out.println(result);
        }
    }
}
