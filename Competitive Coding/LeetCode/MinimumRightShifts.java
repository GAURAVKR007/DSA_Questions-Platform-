import java.util.ArrayList;
import java.util.List;

public class MinimumRightShifts {
    public static boolean isSorted(List<Integer> nums){
        int prev = nums.get(0);
        for(int x : nums){
            if(prev > x){
                return false;
            }
            prev = x;
        }   
        return true;
    }
    public static int minimumRightShifts(List<Integer> nums) {
        int count=0;

        if(isSorted(nums)){
            return count;
        }

        for(int i=0;i<nums.size();i++){
            int last = nums.get(nums.size()-1);
            for(int k = nums.size()-1;k>=1;k--){
                nums.set(k,nums.get(k-1));
            }
            nums.set(0,last);

            count++;

            if(isSorted(nums)){
                return count;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(1);
        arr.add(4);

        System.out.println(minimumRightShifts(arr));
    }
}
