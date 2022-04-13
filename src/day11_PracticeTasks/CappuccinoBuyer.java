package day11_PracticeTasks;

import java.util.Scanner;

public class CappuccinoBuyer<size> {
    public static void main(String[] args) {
        /*Scanner input=new Scanner(System.in);
        System.out.println("Input Size : ");
        String size=input.nextLine();*/
        String size="tall";
        String result="";
           /* if (size=="tall"){
                result="Price is $3.69 \n90 calories ";
            }else if (size=="grande"){
                result="price is $3.99 \n120 calories";
            }else if(size =="venti"){
                result="price is $4.29\n150 calories";
            }else{
                result="Invalid Size";}*/
       /* switch (size){
            case "tall":
                System.out.println("Price is $3.69 \n90 calories");
                break;
            case "grade":
                System.out.println("price is $3.99 \n120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29 \n150 calories");
                break;
            default:
                System.out.println("Invalid Size");
                break; */
        //}
       if (size=="tall" || size == "grade" || size == "venti")
        {
            switch (size){
                case "tall":
                    System.out.println("Price is $3.69 \n90 calories");
                    break;
                case "grade":
                    System.out.println("price is $3.99 \n120 calories");
                    break;
                default:
                    System.out.println("price is $4.29 \n150 calories");
                    break;
            }

        }else
        {
            System.out.println("Invalid Size");
        }

        System.out.println(result);
    }
}
