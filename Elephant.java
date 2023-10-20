import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count =0;
        int p;
        if(t >= 5){
            count += t/5;
            t %=  5;
        }
        if(t  >= 4){
            count += t/4;
            t %=  4;
        }
       if(t >= 3){
            count += t/3;
            t %= 3;
        }
        if(t >=2){
            count += t/2;
            t %= 2;
        }
        if(t >= 0){
            count += t;

        }
        System.out.println(count);
    }
}
