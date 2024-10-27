class MountainTriplet {

    public static int minimumSum(int[] nums) {
        int n = nums.length;
    int minSum = Integer.MAX_VALUE;

    for (int j = 1; j < n - 1; j++) {
        int leftMax = Integer.MAX_VALUE;
        int rightMax = Integer.MAX_VALUE;

        // Find the maximum element to the left of nums[j]
        for (int i = 0; i < j; i++) {
            if (nums[i] < nums[j]) {
                leftMax = Math.min(nums[i],leftMax);
            }
        }

        // Find the maximum element to the right of nums[j]
        for (int k = j + 1; k < n; k++) {
            if (nums[k] < nums[j]) {
                rightMax = Math.min(nums[k],rightMax);
            }
        }

        if (leftMax < Integer.MAX_VALUE && rightMax < Integer.MAX_VALUE) {
            int currentSum = leftMax + nums[j] + rightMax;
            minSum = Math.min(minSum, currentSum);
        }
    }

    return minSum != Integer.MAX_VALUE ? minSum : -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};

        System.out.println(minimumSum(arr));
    }
}