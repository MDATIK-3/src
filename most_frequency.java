//class Solution {
//    public int majorityElement(int[] nums) {
//        int length = nums.length;
//        int i,j;
//        int mfvalue = 1;
////        int mfelement = nums[0];
//        for(i=0; i<length; i++){
//            int cfvalue = 1;
//            int cfelement = nums[i];
//            for(j=i+1; j<length; j++){
//                if(cfelement == nums[j]){
//                    cfvalue++;
//                }
//            }
//            if(cfvalue >mfvalue){
//                mfelement = cfelement;
//                mfvalue = cfvalue;
//            }
//        }
//        return mfelement;
//    }
//}