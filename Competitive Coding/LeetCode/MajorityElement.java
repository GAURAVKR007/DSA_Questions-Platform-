public class MajorityElement {
    public static int majorityElement(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
    public static void main(String[] args) {
        int[] num = {2,2,1,2,1,2,1,3,3,2};
        System.out.println(majorityElement(num));
    }
}
