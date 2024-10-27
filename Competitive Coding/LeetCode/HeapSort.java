class HeapSort {

    public static void swap(int[] arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void heapify(int[] nums,int n,int idx){
        int largest = idx;
        int left = idx*2+1;
        int right = idx*2 + 2;

        if(left <= n && nums[left] > nums[largest]){
            largest = left;
        }

        if(right <= n && nums[right] > nums[largest]){
            largest = right;
        }

        if(idx != largest){
            swap(nums,largest,idx);
            heapify(nums,n,largest);
        }
    }

    public static int[] sortArray(int[] nums) {

        for(int i=(nums.length-1)/2;i>=0;i--){
            heapify(nums,nums.length -1,i);
        }

        for(int i=nums.length-1;i>0;i--){
            swap(nums,0,i);
            heapify(nums,i-1,0);
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};

        int[] res = sortArray(arr);

        for(int x : res){
            System.out.print(x+" ");
        }

    }
}