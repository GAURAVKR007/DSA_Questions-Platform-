import java.util.Stack;

public class One132Patten {
     public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        if(n<3){
            return false;
        }

        int[] arr = new int[nums.length];

        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
            arr[i] = min;
        }

        Stack<Integer> stack = new Stack<>();

        for(int j=n-1;j>=0;j--){
            if(nums[j] > arr[j]){
                while(!stack.isEmpty() && stack.peek() <= arr[j]){
                    stack.pop();
                }

                while(!stack.isEmpty() && stack.peek() < nums[j]){
                    return true;
                }

                stack.push(nums[j]);
        }
    }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.println(find132pattern(nums));
    }
}
