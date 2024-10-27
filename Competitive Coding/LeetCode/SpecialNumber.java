public class SpecialNumber {
    public static int minimumOperations(String num) {
        // int n = num.length();
        // int x = Integer.parseInt(num);
        // int count = 0;
        // String str = num;
        // for(int i=n-1;i>=0;i--){

        //     if(x<=9){
        //         return 1;
        //     }

        //     if(x>=10 && x<=24){
        //         return 2;
        //     }
            
        //     if(str.equals("")){
        //         str = "0";
        //         count++;
        //         x = 0;
        //     }
            
        //     if(x % 25 == 0){
        //         return count;
        //     }
            
        //     if(str.charAt(i) == '0'){
        //         str = str.substring(0,i-1) + "0";
        //         x = Integer.parseInt(str);
        //         count++;
        //         continue;
        //     }
            
        //     str = str.substring(0,i);
        //      x = Integer.parseInt(str);
        //     count++;
            
        // }
        
        // return count;

        int n = num.length();
        
        int minCount = Integer.MAX_VALUE;
       if(Integer.parseInt(num) <= 10){
            return 1;
        }
        
        boolean found = false;
        int counter = 0;

        for(int i=n-1; i>=0; i--){
            int count = 0;
            if(num.charAt(i) == '0'){
                for(int j=i-1; j>=0; j--){
                    if(num.charAt(j) == '0'){
                        count = n - (j+2);
                        found = true;
                        minCount = Math.min(minCount,count);
                    }else if(num.charAt(j) == '5'){
                        count = n - (j+2);
                        found = true;
                        minCount = Math.min(minCount,count);
                    }else{
                        counter++;
                    }
                }
            }else if(num.charAt(i) == '5'){
                for(int j=i-1; j>=0; j--){
                    if(num.charAt(j) == '2'){
                        count = n - (j+2);
                        found = true;
                        minCount = Math.min(minCount,count);
                    }else if(num.charAt(j) == '7'){
                        count = n - (j+2);
                        found = true;
                        minCount = Math.min(minCount,count);
                    }else{
                        counter++;
                    }
                }
            }else if(num.charAt(i) == '0'){
                continue;
            }else{
                counter++;
            }
        }
        

        if(!found){
            return counter;
        }
    
        return minCount == Integer.MAX_VALUE ? n : minCount;
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations("11"));
    }
}
