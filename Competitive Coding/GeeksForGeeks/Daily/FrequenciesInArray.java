import java.util.HashMap;

public class FrequenciesInArray {
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        
        int[] res = new int[N];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        
        for(int i=0;i<N;i++){
            if(map.containsKey(i+1)){
                res[i] = map.get(i+1);
            }
        }
        
        for(int i=0;i<N;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        int N = 5;
        int P = 5;

        frequencyCount(arr, N, P);
    }
}
