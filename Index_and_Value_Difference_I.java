public class Index_and_Value_Difference_I {
    public static void main(String[] args) {
        System.out.println("HEllo World");
    }
}
class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] result = {-1, -1};
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (Math.abs(j - i) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
