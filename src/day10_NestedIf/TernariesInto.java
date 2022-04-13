package day10_NestedIf;

import java.util.Scanner;

public class TernariesInto {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input number : ");
        int number=input.nextInt();
        if (number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        System.out.println("-----------------------");

        String result1=(number%2==0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("-----------------------");

        System.out.println("Input your age : ");
        int age=input.nextInt();
        /*
        Eger her blok tek bir deger donduruyorsa ve bunun veri tipi stringse(ayni tipse ) if blogu yerine
        ternaries kullanabiliriz
         */

        /*if (age>=21)     //every single block returns one value are date type the same (string)
        {
            System.out.println("Eligible");//String
        }
        else
        {
            System.out.println("Not Eligible");//String
        }*/


        //System.out.println(( age>= 21)? "Eligible" : "Not Eligible");

        String result2=( age>= 21)? "Eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println("--------------------------------------");

        System.out.println("input number : ");
        int n=input.nextInt();

       /* if (n>0)
        {
            System.out.println("Positive");
        }
        else if (n<0 )
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }   */

        String result3 = (n>0)? "Positive" : (n<0)? "Negative"  : "Zero"; // ? ---> if meaning   : -----> else meaning
        System.out.println(result3);

    }
}
