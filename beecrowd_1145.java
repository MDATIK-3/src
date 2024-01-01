import java.util.Scanner;

public class beecrowd_1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        while(b-->0){
           int arr[] = new int[3];
           for(int i=0; i<3; i++){
               arr[i]= sc.nextInt();
            }
           if(arr[0] == arr[2]){
               System.out.println(arr[1]);
           }
           else if(arr[1] == arr[2]){
               System.out.println(arr[0]);
           }
           else if(arr[0] == arr[3]){
               System.out.println(arr[2]);
           }
        }
    }
}
