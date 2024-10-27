import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Not Correct 

public class MaximumSubarrayOfUnique {

     public static long sumArray(List<Integer> list){
        long sum = 0;
        
        for(int x : list){
            sum = sum + x;
        }
        
        return sum;
    }
    public static long maxSum(List<Integer> nums, int m, int k) {
        List<Long> list = new ArrayList<>();
        for(int i=0; i<nums.size()- m;i++){
            boolean flag = true;
             List<Integer> curr = new ArrayList<>();
            int pos = m;
            for(int j=i;j<k;j++){
                if(nums.get(j) == nums.get(j+1) && ){
                    flag = false;
                    break;
                }
                
                if(nums.get(j) == nums.get(j+1) && ){
                    // flag = false;
                    // break;
                    
                    pos--;
                }
                curr.add(nums.get(j));
            }
            
            if(flag){
                long temp = (long) sumArray(curr);
                list.add(temp);  
            }
        }
        
        Collections.sort(list);
        
        return list.get(list.size() -1);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println(maxSum(list, 3, 3));
    }
}
