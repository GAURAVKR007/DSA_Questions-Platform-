import java.util.Scanner;
public class Doctor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        int[][] arr = new int[size][2];

        System.out.println("===== Fill the Array ======");

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int absoluteTime = 0;
        int res = 0;

        for(int i = 0; i < size; i++) {
                if(absoluteTime > arr[i][0]){
                    absoluteTime += arr[i][1]; 
                }else{
                    absoluteTime = arr[i][0] + arr[i][1];
                }

                res += absoluteTime - arr[i][0];
        }

        System.out.println(res/size);



    }
}
