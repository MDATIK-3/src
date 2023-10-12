import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Math.abs;

public class A_Remove_Smallest {
    public static void main(String[] args) {

        Scanner sck = new Scanner(System.in);
        int t = sck.nextInt();
        while (t-- > 0) {

            int size = sck.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sck.nextInt();
            }
            Arrays.sort(arr);
            int count = 1;
            for (int i = 1; i < size; i++) {

                    if (arr[i] - arr[i-1] > 1) {
                        count =0;
                        break;
                    }
            }
            if(count==1)
                System.out.println("YES");
            else {
                System.out.println("NO");
            }
        }
    }
}
