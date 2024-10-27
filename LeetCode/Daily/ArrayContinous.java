import java.util.ArrayList;
import java.util.Arrays;

public class ArrayContinous {

    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = 1;

        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1]){
                nums[m++] = nums[i];
            }
        }

        int maximum = 0;
        for(int i=0;i<m;i++){
            int j = i;
            int count = 0;
            while(j<m && nums[j] <= nums[i] + n - 1){
                j++;
                count++;

            }
            maximum = Math.max(maximum,count);
        }

       
        return n - maximum;
        
    }
    public static void main(String[] args) {
        int[] nums = {41,33,29,33,35,26,47,24,18,28};

        System.out.println(minOperations(nums));
    }
}


