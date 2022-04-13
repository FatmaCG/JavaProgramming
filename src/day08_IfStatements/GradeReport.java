package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
    //    System.out.println(!!false); // false

        int score=85;

        boolean a = score >= 90 && score <=100;//False
        boolean b = score >= 80 && score <=89 ; //True
        //  boolean b = score >= 80 && !a ;   if score is A, but score is greater than 80

        boolean c = score >= 70 && score <=79;//False
       // boolean c = !a && !b && score >= 70;

        boolean d = score >= 60 && score <=69 ;//False
        //boolean d = !a && !b && !c && score >=60;

        boolean f = score >= 0 && score <= 59;//False
       // boolean f = !a && !b && !c && !d :

        if (a) { //if the student made an A
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");
        }
        if (f){
            System.out.println("Failed");
        }


    }
}
