import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinimumProcess {
     public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.reverse(tasks);

        Collections.sort(processorTime);
        
        ArrayList<Integer> time = new ArrayList<>();
        int idx = 0;
        for(int i=0;i<processorTime.size();i++){
            time.add(processorTime.get(i) + tasks.get(idx));
            idx = idx+4;
        }
        
        Collections.sort(time);
        
        return time.get(time.size() -1);
    }
    public static void main(String[] args) {
        List<Integer> tasks = new ArrayList<>();
        tasks.add(287);
        tasks.add(315);
        tasks.add(293);
        tasks.add(260);
        tasks.add(333);
        tasks.add(362);
        tasks.add(69);
        tasks.add(233);
        // 287,315,293,260,333,362,69,233
        List<Integer> processorTime = new ArrayList<>();
        processorTime.add(121);
        processorTime.add(99);

        System.out.println(minProcessingTime(processorTime, tasks));
    }
}