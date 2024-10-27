public class Triangle {

    public static String triangleType(int[] nums) {
        int firstSide = nums[0];
        int secondSide = nums[1];
        int thirdSide = nums[2];

        if(firstSide + secondSide > thirdSide){
            if(secondSide + thirdSide > firstSide){
                if(thirdSide + firstSide > secondSide){
                    
                    if(firstSide == secondSide && firstSide == thirdSide && secondSide == thirdSide){
                        return "equilateral";
                    } else if(firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide){
                        return "isosceles";
                    } else if (firstSide != secondSide && firstSide != thirdSide && secondSide != thirdSide){
                        return "scalene";
                    }

                }
            }
        }
        
        return "none";
    }

    public static void main(String[] args) {
        int[] arr = {2,7,7};
        System.out.println(triangleType(arr));
    }
}
