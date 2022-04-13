package day09_PracticeTasks;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection;
        Scanner input=new Scanner(System.in);
        System.out.println("Selection 1~5 : ");
        selection=input.nextInt();
        if (selection==1)
        {
            System.out.println("Hello , thank for your call ");
        }
        else if (selection==2)
        {
            System.out.println("Hola , gracias para Ilamar ");
        }
        else if (selection==3)
        {
            System.out.println("Merhaba , aradiginiz icin tesekkurler ");
        }
        else if (selection==4)
        {
            System.out.println("Privet , spasibo za vash zvonok ");
        }
        else if (selection==5)
        {
            System.out.println("Merci , pour votre appel ");
        }
        else
        {
            System.out.println("invalid selection");
        }

    }
}
