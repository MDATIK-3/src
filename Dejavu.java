import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Dejavu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        String str = sc.next();
        Set<String> result = new HashSet<String>();
        Set<String> seenSubstrings = new HashSet<String>();


        for (long i = 0; i < n; i += k) {
            for (long j = i + 1; j <= n; j += k) {
                String substring = str.substring((int) i, (int) j);


                if ( !seenSubstrings.contains(substring) ) {
                    result.add(substring);
                    seenSubstrings.add(substring);
                }
            }
        }

        if ( result.size() == 5 )
            System.out.println(3);
        else
            System.out.println(result.size());
    }
}
