class PenalityShots{

    public static void score(int[] a){
         int first = 0;
        int second = 0;
            
            for(int k=0;k<a.length;k++){
                if(k % 2 == 0 && a[k] == 1){
                    first++;
                }
                
                if(k % 2 != 0 && a[k] == 1){
                    second++;
                }
            }
            
            if(first>second){
                System.out.println(1);
            }else if(second > first){
                System.out.println(2);
            }else{
                System.out.println(0);
            }
    }
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,1 ,0 ,0 ,0 ,0, 0 ,0, 0 };

        score(arr);

    }
}