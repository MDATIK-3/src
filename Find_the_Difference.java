public class Find_the_Difference {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,5,2,2,3,3};
        
        
        int r,  i,result = 0;
        int[] brr = new int[10];
        int length = arr.length;
        for(i=0; i<length; i++){
            r= arr[i];
            brr[r] += 1;
        }
        for(i=0; i<10; i++){
            if(brr[i] == 1){
                result = i;
                break;
            }
            
        }
        System.out.println(result);
        

    }

//    class Solution {
//        public char findTheDifference(String s, String t) {
//            int s1 = s.length();
//            int t1 = t.length();
//            for(int i=0; i<t1; i++){
//                for(int j=0; j<s1; j++){
//                    if(s.charAt(j) != t.charAt(i)){
//                        return t.charAt(i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
}
