public class PasswordChecker {

    public static void check(String password){
        boolean result = false;

        boolean lengthcheck = false;
        boolean uppercaseCheck = false;
        boolean lowercaseCheck = false;
        boolean specialCheck = false;

        int lowerCaseLength = 0;
        int upperCaseLength = 0;
        int specialCheckLength = 0;
        int digitLength = 0;

        int length = password.length();

        if(length >=6 && length <= 12){
            lengthcheck = true;
        }

        for(int i=0;i<length;i++){
            int curr = (int) password.charAt(i);

            if(curr >= 97 && curr <= 122){
                lowercaseCheck = true;
                lowerCaseLength++;
            }

            if(curr >= 65 && curr <= 90){
                uppercaseCheck = true;
                upperCaseLength++;
            }

            if(curr == 35 || curr == 36 || curr == 42 || curr == 64){
                specialCheck = true;
                specialCheckLength++;
            }

            if(curr >=48 && curr <= 57){
                digitLength++;
            }
        }

        result = uppercaseCheck && lowercaseCheck && specialCheck && lengthcheck;

        if(result){
            System.out.println("The generated password "+ password + " is valid and has "+lowerCaseLength+" lowercase alphabet "+upperCaseLength+ " uppercase alphabet "+specialCheckLength+" special character "+digitLength+ " digit");
        }else{
            System.out.println(password+ "is an invalid password");
        }
    }
    public static void main(String[] args) {
        String str = "LIVE@123";

        check(str);

        
    }
}
