package day11_PracticeTasks;

import java.util.Scanner;

public class Cydeo{
    public static void main(String[] args) {
       /* Scanner input=new Scanner(System.in);
        System.out.println("Input batch type : ");
        String batch=input.next();*/
        String batch="EU";
        String result="";
       if(batch=="US_morning"){
            result="Class times are 10-5 EST. M, T, Th, F.";
        }else if(batch=="US_evening") {
            result = "Class times are 7-10 EST. M, T, W, Th, S, S";
        }else if(batch=="EU"){
            result = "Class times are  10-5 EST. M, T, W, Th, F.";
        }else{
            result="Invalid Batch";
        }
        /*switch (batch){
            case "US_morning":
                result="Class times are 10-5 EST. M, T, Th, F.";
            break;
            case "US_evening":
                result="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result="Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result="Invalid Batch";
                break;
        }*/
        /*if (batch=="US morning" || batch=="US evening" || batch=="EU"){
            switch (batch){
                case "US morning":
                    result="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result="Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
            }
        }else{
            result="Invalid Batch";
        }*/
        System.out.println(result);
    }
}
