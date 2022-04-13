package liveClasses.week09;

public class CustomMethodsPractice01 {
    public static void main(String[] args) {
        int personAge=30;
        eligibleOrNot(personAge);
    }
    public static void eligibleOrNot(int age){ //no return type
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }
    }
}
