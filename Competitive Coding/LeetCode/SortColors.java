public class SortColors {
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for(int i=0;i<n;i++){ 
            if(idx == nums.length) return nums;
            if(nums[idx] == 0){
                idx++;
                // i--;
                continue;
            }

            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;

                idx++;
            }
        }

        idx = n-1;

        for(int i=0;i<idx;i++){
            if(idx == 0) return nums;
            if(nums[idx] == 2){
                idx--;
                i--;
                continue;
            }

            if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;

                idx--;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        int[] arr = sortColors(nums);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
