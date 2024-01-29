import java.util.Scanner;

public class beecrowd_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();

            if ( a == 2002 ) {
                System.out.println("Acesso Permitido");
                return;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
