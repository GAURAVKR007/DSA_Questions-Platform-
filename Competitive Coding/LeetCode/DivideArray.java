import java.util.Arrays;

public class DivideArray {

    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length/3;
        int[][] res = new int[size][3];

        for(int i=2;i<nums.length;i=i+3){
            int nums1 = nums[i] - nums[i-2];
            int nums2 = nums[i] - nums[i-1];
            if(nums1 > k || nums2 > k){
                return res;
            }
        }

        int idx = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<3;j++){
                res[i][j] = nums[idx++];
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,7,9,3,5,1};
        int[][] res = divideArray(arr, 2);

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
