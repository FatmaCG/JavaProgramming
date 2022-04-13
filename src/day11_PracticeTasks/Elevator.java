package day11_PracticeTasks;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Floor Number : ");
        int floorNumber=input.nextInt();
        String result="";
        /*if (floorNumber == 1 || floorNumber == 2 || floorNumber==3){
            if (floorNumber == 1){
                result="Floor 1 selected.Companies: Lobby,Verizon,Starbucks";
            }else if (floorNumber == 2){
                result="Floor 2 selected.Companies: Cybertek, NASA,Intelsat";
            }else {
                result="Floor 3 selected.Companies: Lyft, BofA, Stake house";
            }
        }else {
            result="Invalid floor - 6";
        }*/
        /*switch (floorNumber){
            case 1:
                result="Floor 1 selected.Companies: Lobby,Verizon,Starbucks";
                break;
            case 2:
                result="Floor 2 selected.Companies: Cybertek, NASA,Intelsat";
                break;
            case 3:
                result="Floor 3 selected.Companies: Lyft, BofA, Stake house";
                break;
            default:
                result="Invalid floor - 6";
                break;
        }*/
        if (floorNumber == 1 || floorNumber == 2 || floorNumber==3){
            switch (floorNumber){
                case 1:
                    result="Floor 1 selected.Companies: Lobby,Verizon,Starbucks";
                    break;
                case 2:
                    result="Floor 2 selected.Companies: Cybertek, NASA,Intelsat";
                    break;
                default:
                    result="Floor 3 selected.Companies: Lyft, BofA, Stake house";
                    break;
            }
        }else {
            result="Invalid floor - 6";
        }
        System.out.println(result);
    }
}
