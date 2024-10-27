import java.util.Arrays;
import java.util.HashMap;

public class MisMatch {

    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            if(map.containsKey(x)){
                arr[0] = x;
            }else{
                map.put(x,1);
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                continue;
            }else{
                arr[1] = i;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {3,3,1};
        // int[] nums = {2,2};
        int[] arr =  new int[2];

        arr = findErrorNums(nums);

        for(int x : arr) {
            System.out.print(x+" ");
        }

    }
}
