
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.String;

public class string_hackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner str = new Scanner(System.in);

        String strin = str.nextLine();
    int length = strin.length();
    int flag = 1;
    for(int i=0; i<length/2; i++){
        if(strin.charAt(i) != strin.charAt(length-i-1)){
            flag = 0;
        }


    }
    if(flag ==1)
        System.out.println("Yes");
    else
        System.out.println("No");

    }
}
