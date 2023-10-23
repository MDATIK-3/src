import java.util.Scanner;

 class MiniValidGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            int[] arr = new int[5];
            int ans = 4;

            for (int i = 0; i < 4; i++) {
                if (n.charAt(i) - '0' == 0) {
                    arr[i + 1] = 10;
                } else {
                    arr[i + 1] = n.charAt(i) - '0';
                }
            }
            arr[0] = 1;
            for (int i = 1; i < 5; i++) {
                ans += Math.abs(arr[i] - arr[i-1]);
            }

            System.out.println(ans);
        }
    }
}
