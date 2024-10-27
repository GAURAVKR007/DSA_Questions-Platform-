import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiscountCandy {
     public static int minimumCost(int[] cost) {
        int candyCost = 0;

       Arrays.sort(cost);

       int spare = 1;
     for(int i=cost.length -1;i>=0;i--){

        if(spare == 3){
            spare = 1;
            continue;
        }
        int x = cost[i];

        candyCost += x;

        spare++;
     }

     return candyCost;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(minimumCost(arr));
    }
}
