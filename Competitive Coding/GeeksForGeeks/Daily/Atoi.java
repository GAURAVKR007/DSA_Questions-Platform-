public class Atoi {
    public static int atoi(String s) {
        // Your code here
        
        char[] ch = s.toCharArray();
        int res = 0;
        boolean negative = false;
        
        for(int i=0;i<ch.length;i++){
            int num = (int) ch[i];
            
            if(num == 45 && i == 0){
                negative = true;
                continue;
            }
            
            if(num >= 48 && num <=57){
                res = res*10 + ch[i] - '0';
            }else{
                return -1;
            }
        }
        
        if(negative){
            res = res * -1;
        }
        
        return res;
        
        }
    public static void main(String[] args) {
        int res = atoi("-123");
        System.out.println(res);
    }
}
