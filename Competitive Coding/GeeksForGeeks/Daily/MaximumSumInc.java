import java.util.*;
public class MaximumSumInc {
    public static int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    
        int[] dp = new int[n];
	    
	    for(int i=0;i<n;i++){
	        dp[i] = arr[i];
	        
	        for(int j=0;j<n;j++){
	            if(arr[i] > arr[j]){
	                dp[i] = Math.max(dp[i],dp[j]+arr[i]);
	            }
	        }
	        
	        
	    }
	    
	        Arrays.sort(dp);
	        return dp[dp.length -1];
	    
	}  
    public static void main(String[] args) {
        int[] arr = {9,4,8,2};

        System.out.println(maxSumIS(arr, 4));
    }
}
