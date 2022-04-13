package day07_PracticeTasks;

public class LeapYear {
    public static void main(String[] args) {
        int year=2021;
       // boolean leap = year%4==0;

        if(year%4==0)
        {
            System.out.println(year+" is leap year : true");
        }
        else
        {
            System.out.println(year+" is leap year : false");
        }
    }
}
