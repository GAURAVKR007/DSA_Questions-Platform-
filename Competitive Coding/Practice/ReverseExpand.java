class ReverseExpand {
    public static String expand(int num){

        if (num <=999){
            return "Not a valid number";
        }

        int length = String.valueOf(num).length();
        System.out.println(length);

        String res = "";
        int count = length;
        while(num > 0){
            int last = num % 10;
            int mul = 1;
            if(count >= 1){
                int tempcount = count;
                while(count > 1){
                    mul = mul*10;
                    count--;
                }
                last = last * mul;
                count = tempcount;

            }
            count--;
            res += String.valueOf(last) + " + "; 
            num = num / 10;
        }

        res = res.substring(0, res.length() - 2);


        return res;
    }
    public static void main(String[] args) {
        int num = 45986;

        String str = expand(num);

        System.out.println(str);
    }
}