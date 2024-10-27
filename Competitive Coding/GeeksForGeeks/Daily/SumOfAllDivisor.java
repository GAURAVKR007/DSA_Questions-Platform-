class SumOfAllDivisor {

    public static long divisorSum(int n){
        long sum = 0;
        for(int i=1;i<n/2+1;i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        
        return sum + n;
    }
    
    public static long sum(int n){
        if(n == 1){
            return 1;
        }    
        
        long res = 1;
        
        res = divisorSum(n) + sum(n-1);
        
        return res;
    }
    
    public static long sumOfDivisors(int N){
        // code here
        long res = sum(N);
        
        return res;
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(sumOfDivisors(n));
    }
}