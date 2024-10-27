import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupSize {
     public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,String> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<groupSizes.length; i++){
            int val = groupSizes[i];
            String str = Integer.toString(i);
            if(map.containsKey(val)){
            map.put(val,map.get(val) + str);
            }else{
                map.put(val,str);
            }
        }

        for(Map.Entry<Integer,String> e : map.entrySet()){
            // List<Integer> curr = new ArrayList<>();

            String str = e.getValue();

            int val = Integer.parseInt(str);

            int times = str.length() / e.getKey();

            

            for(int i=0;i<times;i++){
                List<Integer> curr = new ArrayList<>();
                int currTimes = e.getKey();
                while(currTimes >= 1){
                    int last = val % 10;
                    curr.add(last);
                    val = val / 10;
                    currTimes--;
                }
                res.add(curr);
            }

        }

        return res;

    }

    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};

        List<List<Integer>> result = groupThePeople(groupSizes);

        // Printing the result
        for (List<Integer> group : result) {
            System.out.print(group+" ");
        }


    }
}