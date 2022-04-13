package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        String firstName = "fatma";
        String lastName = "cekim Guler";
        initials(firstName, lastName);
        System.out.println();
        String mail = "fatmacekimguler@gmail.com";
        domain(mail);
        System.out.println();
        month(7);
        System.out.println();
        String[] emails = {"fatma@gmail.com", "meltem@yahoo.com", "meryem@hotmail.com", "ali@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("----------");
        mail(emails);
        System.out.println();
        day(3);
    }

    //1. Create a method that can display the initials of the person
    public static void initials(String name, String surName) {
        // System.out.println(name.substring(0,1)+surName.substring(0,1));
        String initial = name.charAt(0) + "." + surName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);
    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email) {
        String dom = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("Domain =" + dom);
    }

    public static void mail(String[] emaill) {
        for (String each : emaill) {
            String res = each.substring(each.indexOf("@") + 1, each.lastIndexOf("."));
            System.out.println(res);
        }
    }

    /*3. Create a method that can display the name of the month based on
    the given number to the method*/
    public static void month(int num) {

        String result = "";
        if (num >= 1 && num <= 12) {
            result = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April"
                    : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" : (num == 9) ? "September"
                    : (num == 10) ? "October" : (num == 11) ? "November" : (num == 12) ? "December" : "Invalid Entry";
        } else {
            result = "Invalid Entry";
        }
        System.out.println("Month name ="+result);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void day(int number) {
        String result2 = "";
        if (number >= 1 && number <= 7) {
            result2 = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ?
                    "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            result2 = "Invalid entry";
        }
        System.out.println("Day of name ="+result2);
    }

    //5. Create a method that can print how many days a month has
    public static void daysAMonth() {

    }
//6.

}
