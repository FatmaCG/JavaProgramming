package week01;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println(firstTwoChars(str));
        System.out.println(firstTwoChars3(str));
        System.out.println(firstTwoChar4(str));
    }
    public static String firstTwoChars(String str){
       /* str=str.toUpperCase();
        str=str.substring(0,2);*/
       // str=str.toUpperCase().substring(0,2);
        return str.toUpperCase().substring(0,2);
    }

    public static String firstTwoChars3(String str){
        str=str.toUpperCase();
        String s=""+str.charAt(0)+str.charAt(1);
        return s;
    }
    public static String firstTwoChar4(String str){
        char[] charArr=str.toCharArray();
        return  (""+charArr[0]+charArr[1]).toUpperCase();
    }

    public static String firstTwoChar5(String str){
        char[] charArr=str.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for (Character each:charArr) {
             list.add(each);
        }
        String s=""+list.get(0)+list.get(1);
        return s.toUpperCase();
    }
}
