import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] str2 = new char[300];
        int n = str.length();
        int i = 0, j = 0;

        while (i < n) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'Y' || str.charAt(i) == 'y') {
                i++;
            } else {
                str2[j++] = '.';
                str2[j++] = Character.toLowerCase(str.charAt(i));
                i++;
            }
        }

        for (int k = 0; k < j; k++) {
            System.out.print(str2[k]);
        }
    }
}
