//import java.util.Arrays;
//
//class Solution {
//    public int[] arrayRankTransform(int[] arr) {
//int length = arr.length;
//int brr[] = new int[length];
//int frr[] = new int[length];
//int i,j;
//for(i=0; i<length; i++){
//    brr[i] = arr[i];
//}
//Arrays.sort(brr);
//for(i=0; i<length; i++){
//    for(j=0; j<length; j++){
//        if(arr[i] ==  brr[j]){
//          frr[i] = j+1;
//            break;
//        }
//    }
//}
//return frr;
//
//
//
//    }
//}
//
//
//
//
//class Solution {
//    public boolean judgeSquareSum(int c) {
//int i,j;
//int r = (int)(c/2);
//Boolean flag = false;
//for(i=1; i<r; i++){
//    for(j=1; j<r; j++){
//        if(i*i+j*j == c)
//            flag = true;
//    }
//}
//if(flag)
//    return true;
//else
//    return false;
//    }
//
//
//
//
//}
//
//
//
//class Solution {
//    public int sumOfSquares(int[] nums) {
//        int length = nums.length;
//        int sum=0;
//        for(int i=0; i<length; i++){
//            if(length % (i+1) ==0){
//                sum += nums[i]*nums[i];
//            }
//        }
//        return sum;
//    }
//}