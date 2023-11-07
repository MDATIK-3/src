import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            int n = scanner.nextInt();
            long arr[] = new long[ n ];
            int i, j , sum=0;
            for (i = 0; i < n; i++) {
                arr[ i ] = scanner.nextLong();


            }


            int po=0, ne=0, ze=0;
      for(i=0; i<n; i++){
          if(arr[i]==0){
              ze++;
          }
          else if(arr[i]<0)
                  ne++;
              else if(arr[i]>0)
                  po++;
      }
        System.out.printf("%.6f\n", (double)po/n);
        System.out.printf("%.6f\n", (double)ne/n);
        System.out.printf("%.6f\n", (double)ze/n);



            


    }
}
