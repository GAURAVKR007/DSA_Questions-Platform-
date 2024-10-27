public class PalindromicPrime {

    public static int checkPalindrome(int i){
        String str = String.valueOf(i);

        for(int j=0; j<str.length(); j++){
            if(str.charAt(j) != str.charAt(str.length() - j - 1)){
                return 0;
            }
        }
        
        return 1;
    }

    public static int palPrime(int l, int r){

        int res = 0;
        boolean found = true;

        for(int i=l;i<=r;i++){
            found = true;
            if(i%2 == 0 || i<=1){
                continue;
            }

            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    found = false;
                    continue;
                }
            }

            if(found){
                res += checkPalindrome(i);
            }

        }

        return res;

    }
    public static void main(String[] args) {
        int res = palPrime(13081, 99309);
        System.out.println(res);
    }
}
