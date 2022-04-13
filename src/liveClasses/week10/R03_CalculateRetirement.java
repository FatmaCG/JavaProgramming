package liveClasses.week10;

public class R03_CalculateRetirement {
    public static void main(String[] args) {
    yearsUntilRetirement("Fatma",1982);

    }

    //calculate age of a person
    public static int calculateAge(int yearOfBirth){
        return 2022-yearOfBirth;
    }
    //let's assume 65 is our retirement age

    public static void yearsUntilRetirement(String name,int yearOfBirth){
        int yearsUntilRetirement=65-calculateAge(yearOfBirth);
        System.out.println(name+" retires in "+yearsUntilRetirement+" years.");
    }
}
