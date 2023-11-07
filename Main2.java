import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

       while(t-- >0){
           int n = scanner.nextInt();

           int m = scanner.nextInt();

           scanner.nextLine();

           String a = scanner.nextLine();
           String b = scanner.nextLine();

           if(n == m)
               System.out.println("Yes");
           else
               System.out.println("No");

       }
    }
}
