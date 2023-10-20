import java.util.Scanner;

public class capitalization {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);

        String str = cap.nextLine();
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(str);
    }
}
