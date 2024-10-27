public class FindTriplet {
    public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    long temp = (long) (nums[i] - nums[j]) * nums[k];
                    ans = Math.max(ans,temp);
                }
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1000000,1,1000000};
        System.out.println(maximumTripletValue(arr));
    }
}
