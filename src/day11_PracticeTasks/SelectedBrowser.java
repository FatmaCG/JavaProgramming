package day11_PracticeTasks;

import java.util.Scanner;

public class SelectedBrowser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Browser name : ");
        String browserName=input.nextLine();
        String result="";
        switch (browserName){
            case "chrome":
                result="Chrome";
                break;
            case "firefox":
                result="Firefox";
                break;
            case "opera":
                result="Opera";
                break;
            case "safari":
                result="Safari";
                break;
            case "edge":
                result="Edge";
                break;
            default:
                result="Invalid Browser";
                break;
        }
        System.out.println(result);

    }
}
/*write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser*/