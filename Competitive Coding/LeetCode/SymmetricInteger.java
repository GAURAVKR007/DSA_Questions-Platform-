public class SymmetricInteger {
    public static boolean sumEqual(int x,int length){
        int sum1 = 0;
        int sum2 = 0;
        int i=length;
        while(x>0){
            int last = x%10;
            
            if(i>length/2){
                sum2 = sum2+last;
            }else if(i<=length/2){
                sum1 = sum1+last;
            }
            
            x = x/10;
            
            i--;
        }
        
        return sum1 == sum2;
    }
    public static int sizeOfNum(int x){
        String str = Integer.toString(x);
        
        return str.length();
    }
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i= low;i<=high;i++){
            int length = sizeOfNum(i);
            if(length % 2 != 0){
                continue;
            }
            
            if(sumEqual(i,length)){
                count++;
            }
            
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1, 100));
    }
}
