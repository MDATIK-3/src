import java.util.HashSet;
import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String inputString = sc.nextLine();

            int distinctCharacterCount = countDistinctCharacters(inputString);

            if (distinctCharacterCount == k - 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static int countDistinctCharacters(String input) {
        HashSet<Character> uniqueCharacters = new HashSet<>();

        // Iterate through the characters of the input string
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                uniqueCharacters.add(c);
            }
        }

        return uniqueCharacters.size();
    }
}
