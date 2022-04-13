package day14_PracticeTasks;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        /*6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number” */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an account number : ");
        String accountNumber = input.next();
        char c = accountNumber.charAt(0);
        int l = accountNumber.length();
      /* if (accountNumber.charAt(0)=='2'){
            if (accountNumber.length()==7){
                System.out.println("valid");
            }else{
                System.out.println("Invalid account number");
            }
        }else if (accountNumber.charAt(0)=='5'){
            if (accountNumber.length()==10){
                System.out.println("valid");
            }else{
                System.out.println("Invalid account number");
            }
        }else{
            System.out.println("Invalid account number");
        }*/
        if ((c == '2' && l == 7) || (c == '5' && l == 10)) {
            System.out.println("Valid accound Number");
        } else {
            System.out.println("Invalid account number");
        }
        input.close();

    }
}
