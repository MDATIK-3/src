import java.util.Scanner;

public class CountDistinctCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            String str = sc.nextLine();

            int[] arr = new int[26];
            int length = str.length();

            if(k==0 && n==1)
            {
                System.out.println("YES");
                continue;
            }

            for (int i = 0; i < length; i++) {
                arr[str.charAt(i) - 'a']++;
            }

            //characters frequency
//            for(int i=0; i<26; i++)
//                System.out.println(arr[i]);

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (arr[i] % 2 != 0)
                    count++;
            }

            if (count - 1 <= k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
