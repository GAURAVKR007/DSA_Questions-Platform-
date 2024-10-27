// import java.util.Scanner;

class ArrayOofAleternate{
    public static void main(String[] args) {
        	// Scanner sc = new Scanner(System.in);
		// int t = sc.nextInt();
		
		// for(int k=0;k<t;k++){
		    
		    
		    // int n = sc.nextInt();

            int[] arr = {4, 5 ,6 ,7 ,-1};
            int n = arr.length;
		    
		    // int[] arr = new int[n];
		    
		    // for(int i=0;i<n;i++){
		    //     arr[i] = sc.nextInt();
		    // }
		    
		    int pos = 0;
		    int neg = 0;
		    
		    int[] res = new int[n];
		    int idx = 0;
		    boolean lock = true;
		    while(pos < n && neg < n){
		        if(arr[pos] >= 0 && lock == true){
		            res[idx] = arr[pos];
		            idx++;pos++;
		            lock = false;
		        }else if(arr[neg] < 0 && lock == false){
		            res[idx] = arr[neg];
		            idx++;neg++;
		            lock = true;
		        }else if(lock == true){
		            pos++;
		        }else{
		            neg++;
		        }
		    }

            while(pos < n-1){
                res[idx] = arr[pos];
                idx++;pos++;
            }
            while(neg < n-1){
                res[idx] = arr[neg];
                idx++;neg++;
            }


		    
		    for(int x : res){
		        System.out.print(x+" ");
		    }
		    
    }
    // }
}