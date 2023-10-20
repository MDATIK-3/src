public class matrix2d {
}
class Solutiown {
    public int maximumWealth(int[][] accounts) {
int m = accounts.length;
int n = accounts[0].length;

int max = 0 ;
for(int i =0; i<n; i++){
    int sum=0;
    for(int j = 0; j<m; j++){
        sum += accounts[j][i];
    }
    if(sum>max)
        max=sum;
}
return max;

    }
}