public class Panagram {

    public static boolean checkPangram  (String s) {
        // your code here
        
        s = s.toLowerCase();
        
        boolean[] arr = new boolean[26];
        
        char[] chArr = s.toCharArray();
        
        for(char c : chArr){
            int num = (int) c;
            if(num >= 97 && num <= 122){
                arr[num - 97] = true;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                return false;
            }
        }
        
        return true;
        
    }
    public static void main(String[] args) {
        boolean res = checkPangram("Bawds jog, flick quartz, vex nymph");

        System.out.println(res);
    }
}
