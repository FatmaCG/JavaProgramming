package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        month(50);
        System.out.println("Hello World");
    }


    public static void month(int num) {

        if (num < 1 || num > 12) {
            System.out.println("Invalid");
            //  return;//exists month method ,remaining code fragments of the method never gets executed
            System.exit(0); //exist the system (EVERY THING WILL BE TERMINATED
        }

        String result = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April"
                : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September"
                : (num == 10) ? "October" : (num == 11) ? "November" : (num == 12) ? "December" : "Invalid Entry";

        System.out.println("Month name =" + result);
    }
}
