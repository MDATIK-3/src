class problem {
    public boolean isPowerOfFour(int n) {
//int r = (int)n/4;
//boolean flag = false;
//for(int i=0; i<=r; i++){
//    if(Math.pow(4,i)==n){
//        flag = true;
//        break;
//    }
//}
//if(flag)
//    return true;
//else
//    return false;

                if (n <= 0) {
                    return false;
                }

                while (n % 4 == 0) {
                    n /= 4;
                }

                return n == 1;
            }



}



