import java.util.Scanner;




public class hello_2023 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-->0)

    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];
        int mul = 1,k;
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
            mul *= arr[i];
        }
        if(2023 % mul != 0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
            System.out.printf("%d ", 2023 / mul);
            for(int i = 1; i<b; i++)
                System.out.printf("%d ", 1);
        }
        System.out.println();
    }


}
}
