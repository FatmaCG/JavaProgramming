package day24_CustomMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {
        month(10);
    }

    /*3. Create a method that can display the name of the month based on
    the given number to the method*/
    public static void month(int num) {

        if (num < 1 || num > 12) {
            System.out.println("Invalid");
            return;//exists month method ,remaining code fragments of the method never gets executed
        }

        String result = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April"
                : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September"
                : (num == 10) ? "October" : (num == 11) ? "November" : (num == 12) ? "December" : "Invalid Entry";

        System.out.println("Month name =" + result);
    }
}
