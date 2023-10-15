//import java.util.Arrays;
//
//class median{
//    public static void main(String[] args) {
//
//    }
//}
//
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//    int m = nums1.length;
//    int n = nums2.length;
//    int[] arr = new int[m+n];
//    int i;
//    for(i=0; i<m; i++){
//        arr[i] = nums1[i];
//          }
//    for(i=0; i<n; i++)
//    {
//        arr[i+m] = nums2[i];
//    }
//        Arrays.sort(arr);
//    if((m+n) % 2 ==0){
//        int index = ((m+2)/2)-1;
//        double result = (double)(arr[index] + arr[index+1])/2;
//        return result;
//    }
//    else
//    {
//        int index = (m+n)/2;
//        return arr[index];
//    }
//
//}