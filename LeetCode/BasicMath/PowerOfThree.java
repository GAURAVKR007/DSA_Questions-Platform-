class PowerOfThree {
    public static boolean isPowerOfThree(int num) {

        while(num > 3){
            if(num % 3 != 0){
                return false;
            }

            num = num / 3;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}