// Certainly! Here's a problem statement related to attendance tracking for a delivery company:

// ---

// *Problem Statement: Maximum Attendance*

// A delivery company wants to track the attendance of its agents. Each agent marks their attendance in a portal, and the company provides incentives based on attendance. If an agent's attendance is more than 80%, they receive an incentive; otherwise, they do not.

// Write a program that allows the user to input the following details:
// - The number of employees (agents) in the company.
// - The total number of working days in the month.

// For each employee, prompt the user to mark their attendance for each day (either present or absent). Calculate the attendance percentage for each employee and determine whether they qualify for the incentive.

// *Input:*
// - Number of employees (N) (1 ≤ N ≤ 1000)
// - Number of working days in the month (D) (1 ≤ D ≤ 31)

// *Output:*
// For each employee, print whether they qualify for the incentive based on their attendance percentage. If the attendance is greater than 80%, print "Qualifies for incentive," otherwise print "Does not qualify for incentive."

// ---

// Feel free to use this problem statement as a starting point for your coding practice! 😊


// Input:
// Number of employees: 5
// Number of working days: 25
// Employee 1 attendance (days present): 22
// Employee 2 attendance (days present): 20
// Employee 3 attendance (days present): 24
// Employee 4 attendance (days present): 18
// Employee 5 attendance (days present): 23

// Output:
// Employee 1 qualifies for the incentive. Attendance: 88.00%
// Employee 2 qualifies for the incentive. Attendance: 80.00%
// Employee 3 qualifies for the incentive. Attendance: 96.00%
// Employee 4 does not qualify for the incentive. Attendance: 72.00%
// Employee 5 qualifies for the incentive. Attendance: 92.00%

import java.util.*;
public class TcsAttendence {


    public static boolean checkPresent(String str,int time){
        char[] ch = str.toCharArray();
        int count = 0;
        for(char c : ch){
            if(c == 'p'){
                count++;
            }
        }

        double percent = time * 0.8;

        if(count >= percent){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No of Employees  : ");
        int n = sc.nextInt();
        System.out.print("Enter the no of Days [month as you like]: ");
        int t = sc.nextInt();

        // int n = 2;
        // int t = 3;

        List<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter the Attendence "+ i +" : ");
            String attendence = sc.next();
            list.add(attendence);
            // sc.nextLine(); 
        }

        int idx = 1;
        for(String attendence : list) {
            boolean res = checkPresent(attendence, t);

            if(res){
                System.out.println("Person "+idx+" will get the Incentive");
            }else{
                System.out.println("Person "+idx+" will not be able to get the Incentive");
            }

            idx++;
        }
    }
}
