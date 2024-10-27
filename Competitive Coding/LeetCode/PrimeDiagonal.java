import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrimeDiagonal {
     public static boolean isPrime(int num){
        if(num > 2 && num % 2 == 0){
            return false;
        } else if(num == 2){
            return true;
        }
        
        boolean prime = true;
        
        for(int i=3;i<num/2;i = i+2){
            if(num%i == 0){
                return false;
            }
        }
        
        return prime;
    }
    
    public static int diagonalPrime(int[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        
         ArrayList<Integer> arr = new ArrayList<>();

         arr.add(0);
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 int number = nums[i][j];
                if(i == j){
                    if(isPrime(number)){
                        arr.add(number);
                    }
                }else if (i + j == col - 1) {
                    if(isPrime(number)){
                        arr.add(number);
                    }
                }
            }
        }
        
        Collections.sort(arr);
        
        int res = arr.remove(arr.size() -1);
        
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {788, 645, 309, 559},
            {624, 160, 435, 724},
            {770, 483, 95, 695},
            {510, 779, 984, 238}
        };
        System.out.println(diagonalPrime(matrix));
    }
}
