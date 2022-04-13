package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number=301;

        boolean evenNumber = number %2==0;
        if (evenNumber){

            System.out.println(number+" is Even Number");
        }
        if (!evenNumber){
            System.out.println(number+" is odd Number");
        }

        /*if (number%2==0) {

            System.out.println(number +" is Even Number");
        }
        else {

        System.out.println(number +" is Odd Number");
        }*/

        System.out.println("--------------------------");

        int n=200;
        if (n>0){

            System.out.println(n+" is positive ");

        }
        if (n<0){

            System.out.println(n+" is negatife ");

        }
        if (n==0){

            System.out.println(n+" is Zero ");

        }


    }
}
