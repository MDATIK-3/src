import java.util.Scanner;

class string {
    public static void main(String[] args) {


        Scanner sck = new Scanner(System.in);
        int t = sck.nextInt();
        while (t-- > 0) {

            int size = sck.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = sck.nextInt();}

                int length = nums.length;
                int i, j;
                int mfvalue = 1;
                int mfelement = nums[0];

                for (i = 0; i < length; i++) {
                    int cfvalue = 1;
                    int cfelement = nums[i];
                    for (j = i + 1; j < length; j++) {
                        if (cfelement == nums[j]) {
                            cfvalue++;
                        }
                    }
                    if (cfvalue > mfvalue) {
                        mfelement = cfelement;
                        mfvalue = cfvalue;
                    }
                }
                if(mfvalue >= 3 )
                    System.out.println(mfelement);
                else
                    System.out.println(-1);
            }


}
}