package day10_NestedIf;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input 1~7 : ");
        int n=input.nextInt();
        String day;
        if(n==1)
        {
            //System.out.println("Monday");
            day="Monday";
        }
        else if (n==2)
        {
            // System.out.println("Tuesday");
            day="Tuesday";
        }
        else if (n==3)
        {
            //System.out.println("Wednesday");
            day ="Wednesday";
        }
        else if (n==4)
        {
            // System.out.println("Thursday");
            day="Thursday";
        }
        else if (n==5)
        {
            // System.out.println("Friday");
            day="Friday";
        }
        else if (n==6)
        {
            // System.out.println("Saturday");
            day="Saturday";
        }
        else
        {
            // System.out.println("Sunday");
            day="Sunday";
        }
        System.out.println("Day = "+ day);

        System.out.println("-------------------------------------------------------------");
        String result1 = ( n == 1 )? "Monday" :( n == 2 )? "Tuesday" :( n == 3 )? "Wednesday" :( n == 4 )? "Thursday"
                :( n == 5 )? "Friday" :( n == 6 )? "Saturday" : "Sunday";
        System.out.println(result1);

    }
}
