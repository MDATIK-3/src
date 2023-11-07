import java.util.Scanner;

public class Eelctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){

            long[] arr = new long[3];
            long max=0, sum = 0;
            int i;

            for(i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }

            for(i=0; i<3; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }

            for(i=0; i<3; i++){
                if(arr[i] != max || (arr[0]==arr[1] && arr[1]==arr[2]))
                {
                    sum = max - arr[i] + 1 ;
                    System.out.print(sum + " ");
                }
//                else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[0] ==arr[2])
//                {
//                    sum = max - arr[i] + 1 ;
//                    System.out.print(sum + " ");
//                }
                else
                    System.out.print(0 +" ");
            }
            System.out.println();




        }
    }
}
