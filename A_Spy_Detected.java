import java.util.Scanner;

public class A_Spy_Detected {
    public static void main(String[] args) {


    Scanner sck = new Scanner(System.in);
    int t = sck.nextInt();
        while(t-- > 0)
    {
        int n = sck.nextInt();
        int arr[] = new int[n];
        int i = 1;

        for (int j = 0; j < n; j++)
            arr[j] = sck.nextInt();

        if (arr[1] == arr[2] && arr[0] != arr[1])
            System.out.println(i);
        else
        {
            for (i = 1; i <= n; i++)
                if (arr[i - 1] != arr[i])
                    break;
            System.out.println(i + 1);
        }
    }}
        }

