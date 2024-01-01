import java.util.Scanner;

public class URI_Online_Judge_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double result = 0, temp;

        sc.nextLine();
        if(num <=400){
            result = num * .15;
            System.out.printf("Novo salario: %.2f\n",result + num);
            System.out.printf("Reajuste ganho: %.2f\n", result);
            System.out.println("Em percentual: 15 %");
        }
        if(num >400 && num <=800){
            result = num * .12;
            System.out.printf("Novo salario: %.2f\n",result +num);
            System.out.printf("Reajuste ganho: %.2f\n",result);
            System.out.println("Em percentual: 12 %");
        }
        if(num <=1200 && num >800){
            result = num * .10;
            System.out.printf("Novo salario: %.2f\n",result + num );
            System.out.printf("Reajuste ganho: %.2f\n",result);
            System.out.println("Em percentual: 10 %");
        }
        if(num >1200 && num <=2000){
            result = num * .07;
            System.out.printf("Novo salario: %.2f\n",result + num );
            System.out.printf("Reajuste ganho: %.2f\n",result);
            System.out.println("Em percentual: 7 %");
        }
        if(num >2000 ){
            result = num * .04;
            System.out.printf("Novo salario: %.2f\n",result + num);
            System.out.printf("Reajuste ganho: %.2f\n",result);
            System.out.println("Em percentual: 4 %");
        }
    }
}
