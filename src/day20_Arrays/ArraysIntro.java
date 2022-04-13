package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0]="Fatma";
        names[1]="Ali";
        names[2]="Meryem";
        names[3]="Meltem";
        names[4]="Berra";
      //  names[5]="Rana";
       // System.out.println(names);  // hascode
        System.out.println(Arrays.toString(names));

        System.out.println("----------------------------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;

        if (number<1 || number>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("-------------------------------------------------");

        String[] months={"January","February","March","April","March","June","July","August","September","October","November","December"};

                int num=10;
        if (num<1 ||num>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(Arrays.toString(months));
        System.out.println(months[num-1]);
    }
}
