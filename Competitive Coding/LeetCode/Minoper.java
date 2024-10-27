import java.util.ArrayList;
import java.util.List;

class Minoper{
    public static int minOperations(List<Integer> nums, int k) {
        int count = 0;
        int oper = 0;
        int n = nums.size();
        boolean[] arr = new boolean[k];
       
        for(int i=n-1;i>=0;i--){
            if(count == k){
                break;
            }
            
            if(nums.get(i) <= k){
               
                if(arr[nums.get(i)-1] == true){
                    // count++;
                    oper++;
                    continue;
                }
                 
                count++;
                
                arr[nums.get(i)-1] = true;
            }
            oper++;
            
            
        }
        
        return oper;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        
        System.out.println(minOperations(list, 2));
    }
}