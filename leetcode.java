import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner sck = new Scanner(System.in);

        int n = sck.nextInt();
        int[] arr = new int[n];
        int sum = -1;

        for (int j = 0; j < n; j++)
            arr[j] = sck.nextInt();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] < arr[j] && arr[k] < arr[j]) {
                        int tripletSum = arr[i] + arr[j] + arr[k];
                        if (sum == -1 || tripletSum < sum) {
                            sum = tripletSum;
                        }
                    }
                }
            }
        }

        System.out.println(sum);




    }
}

