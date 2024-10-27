import java.util.HashMap;

class RomanToInteger {

     public static int romanToDecimal(String str) {
        // code here
        
       HashMap<Character,Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       
       
       
       int res = 0;
       
       if(str.length() < 2){
           res = map.get(str.charAt(0));
           
           return res;
       }
        
        for(int i=0;i<str.length();i++){
            
            char temp = str.charAt(i);

            if(i <= str.length() -2){
                char next = str.charAt(i+1);
            
            if(temp == 'I' && next == 'X'){
                res = res + 9;
                i++;
                continue;
            }

            if(temp == 'I' && next == 'V'){
                res = res + 4;
                i++;
                continue;
            }

            if(temp == 'X' && next == 'L'){
                res = res + 40;
                i++;
                continue;
            }

            if(temp == 'X' && next == 'C'){
                res = res + 90;
                i++;
                continue;
            }

             if(temp == 'C' && next == 'D'){
                res = res + 400;
                i++;
                continue;
            }

            if(temp == 'C' && next == 'M'){
                res = res + 900;
                i++;
                continue;
            }
        }
            
            
            int value = map.get(temp);
            
            res = res + value;
        
    }

    return res;
    }
    public static void main(String[] args) {
        String str = "II";

        System.out.println(romanToDecimal(str));
    }
}