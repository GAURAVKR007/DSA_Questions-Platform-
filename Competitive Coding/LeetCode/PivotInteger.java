public class PivotInteger {
    public static int pivotInteger(int n) {
        int[] leftCheckSum = new int[n];
        int[] RightCheckSum = new int[n];
        
        int val = 0;
        
        for(int i=1;i<=n;i++){
             val += i;
            leftCheckSum[i-1] = val;
        }
        
        val = 0;
        
        for(int i=n;i>=1;i--){
             val += i;
            RightCheckSum[i-1] = val;
        }
        
        for(int i=0;i<n;i++){
            if(RightCheckSum[i] == leftCheckSum[i]){
                return i+1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(1));
    }
}
