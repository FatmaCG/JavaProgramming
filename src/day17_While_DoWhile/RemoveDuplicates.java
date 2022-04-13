package day17_While_DoWhile;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String str=scan.nextLine();
        //String str="AABBCC";
        
        String result="";

        for (int i = 0; i < str.length(); i++) {
          String ch=""+str.charAt(i);
          if (result.contains(ch)){
             // break;// exit
              continue;// skip
          }
          result+=ch;
        }
        System.out.println(result);
        scan.close();
    }
}
