class BinarySearch {

    public static int recursiveBinarySearch(int[] arr,int element, int start, int end,int mid){
        if(start > end){
            return -1;
        }

        if(arr[mid] == element){
            return mid;
        }

        if(arr[mid] < element){
            start = mid + 1;
        }else{
            end = mid - 1;
        }

        int res = -7;

        mid = start + (end - start)/2;

        res = recursiveBinarySearch(arr, element, start, end, mid);

        return res == -7 ? -1 : res;
    }

    public static int binaySearch(int[] arr,int element){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == element){
                return mid;
            }

            if(arr[mid] < element){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,15,25};
        int element = 225;

        // System.out.println(binaySearch(arr, element));
        System.out.println(recursiveBinarySearch(arr, element, 0, arr.length-1, arr.length/2));
    }
}