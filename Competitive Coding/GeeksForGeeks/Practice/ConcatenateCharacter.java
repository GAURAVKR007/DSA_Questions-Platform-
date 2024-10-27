import java.util.Scanner;
public class ConcatenateCharacter {

    public static String concatenate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        char[] ch = new char[size];

        for(int i = 0; i < size; i++){
            ch[i] = sc.next().charAt(0);
        }

        String res = "";

        for(char c : ch){
            res = res + c;
        }

        return res;
    }
    public static void main(String[] args) {
        

        String res = concatenate();

        System.out.println(res);


    }
}
