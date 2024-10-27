import java.util.HashMap;
import java.util.Map;

public class MinEmptyArray {

    public static boolean canBeMadeFrom23(int num) {
        // Create a memoization map to store computed results.
        Map<Integer, Boolean> memo = new HashMap<>();
        return canBeMadeFrom23Helper(num, memo);
    }

    private static boolean canBeMadeFrom23Helper(int num, Map<Integer, Boolean> memo) {
        // Base cases:
        if (num < 0) {
            return false; // Negative numbers cannot be made.
        }
        if (num == 0) {
            return true; // 0 can be made by not using any 2s or 3s.
        }

        // Check if the result is already memoized.
        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        // Recursively check if the number can be made by subtracting 2 or 3.
        boolean subtract2 = canBeMadeFrom23Helper(num - 2, memo);
        boolean subtract3 = canBeMadeFrom23Helper(num - 3, memo);

        // Return true if either subtracting 2 or subtracting 3 leads to a solution.
        boolean result = subtract2 || subtract3;

        // Memoize the result.
        memo.put(num, result);

        return result;
    }
    public static int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        
        int oper = 0;
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int key = e.getKey();
            int value = e.getValue();

            boolean found = canBeMadeFrom23(value);

            if(!found){
                return -1;
            }
            
            if (value % 3 == 0) {
                oper += value / 3;
            } else {
                // If the count is not a multiple of 3, you need to perform operations
                // to make it a multiple of 3. For example, if the count is 5, you need
                // to perform 1 operation to make it 3 and another operation to make it 3 again.
                oper += (value / 3) + 1;
            }
        }
        
        return oper;

    }
    public static void main(String[] args) {
        int[] arr = {152,152,152,152,152,152,152,152,152,152,152,152,215,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,114,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,152,215,152,152,152,152,152,152,152,152,114,152,152,152,152,152,114,152,152,152,114,152,152,152,114,152,152,152,114,152,152,152,152,152,215};

        System.out.println(minOperations(arr));
    }
}
