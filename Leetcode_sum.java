import java.util.Scanner;

public class Leetcode_sum {
    public static void main(String[] args) {

            int count =0;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while(n> 0){
                int tem = n % 10;
                if(tem==1)
                    count++;
                n /=10;
            }
            System.out.println(count);
        }


}
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//
//        int lengh = nums.length;
//        int i,j;
//        for(i=0; i<lengh-1; i++){
//            for(j=i+1; j<lengh; j++){
//                if(nums[i]+nums[j] == target)
//                {
//
//                    int[] result = {i, j};
//                    return result;
//
//                }
//            }
//            return new int[0];
//        }
//
//    }
//}
