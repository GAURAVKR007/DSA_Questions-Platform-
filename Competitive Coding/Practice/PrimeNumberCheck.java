import java.util.Scanner;
public class PrimeNumberCheck {

    public static int checkPrimeNumber(int num){

        if(num >= 0 && num <= 100){
            int consecutiveSum = 0;
            int count = 0;
            int currCount = 0;
            for(int i=2;i<num;i++){
                if(num % i == 0){
                    count++;
                    break;
                }

                currCount = 0;

                for(int j=2;j<i;j++){
                    if(i % j == 0){
                        currCount++;
                    }
                }

                if(currCount == 0 && consecutiveSum < num){
                    consecutiveSum += i;
                }
            }

            if(count == 0 && consecutiveSum == num){
                System.out.println(num);
                return 1;
            }


        }

        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array (size -> 1 to 5): ");
        int size = sc.nextInt();

        if(size >= 1 && size <= 5) {

            int[] arr = new int[size];
            
            System.out.println("Enter the elements in the array");
            for(int i=0;i<size;i++) {
                arr[i] = sc.nextInt();
            }

        int count = 0;

        System.out.println("============= Output ===========");
            for(int x : arr) {
               count +=  checkPrimeNumber(x);
            }

            if(count == 0){
                System.out.println("The "+arr.length+ " numbers are not sum of prime numbers" );
            }
            
            
        }
    }
}
