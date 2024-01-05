import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "hello";
        String str3;
        int length = str.length();
        if ( length < 5 ) {
            System.out.println("NO");
            return;
        }
        int j = 0, i = 0, count = 0;
        while (i < length) {
            if ( str.charAt(i) == str2.charAt(j) ) {
                count++;
                j++;
            }
            if(count == 5)
                break;
            i++;
        }
        if ( count == 5 )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
