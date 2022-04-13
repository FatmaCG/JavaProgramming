package day09_PracticeTasks;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner input=new Scanner(System.in);
        System.out.println("Input first number = ");
        n1=input.nextInt();
        System.out.println("Input second number = ");
        n2=input.nextInt();
        System.out.println("Input third number = ");
        n3=input.nextInt();
        if (n1==n2 && n2==n3 && n1==n3)
        {
            System.out.println("all equal");
        }
        else if (n1==n2)
        {
            System.out.println("n1&n2 are equal ");
        }
        else if (n3==n2)
        {
            System.out.println("n3&n2 are equal ");
        }
        else if (n1==n3)
        {
            System.out.println("n1&n3 are equal ");
        }
        else if (n1!=n2 && n2!=n3 && n1!=n3)
        {
            System.out.println("none of them are equal ");
        }

    }
}
