import java.util.Scanner;

public class A_Goals_of_Victory {
    public static void main(String[] args) {
        Scanner sck = new Scanner(System.in);
        int t = sck.nextInt();

        while (t-- >0) {
            int size = sck.nextInt();

            int[] nums = new int[size];
            int sum = 0;

            for (int i = 0; i < size; i++) {
                nums[i] = sck.nextInt();
                sum += nums[i];
            }

            // Negate the sum after calculating it
            int negatedSum = Math.abs(sum);
            System.out.println(negatedSum);
        }
    }
}
