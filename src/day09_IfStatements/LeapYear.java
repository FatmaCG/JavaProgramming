package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year=2000;

        if (year%4==0)
        {
            System.out.println("Year "+ year + " is a leap year");
        }
        else
        {
            System.out.println("Year "+ year + " is NOT a leap year");
        }
    }
}
