package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        /* String Methods :
                charAt(index):returns the character at the given index ,returns char
                length()     :returns total number of characters. returns int
         */
        String word = "Cydeo";
        //index=  01234
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);*/
        System.out.println("------------------------");

        String s1 = "Batch 25 is the best batch.Java Programming Language";

        int len = s1.length();   //total number of characters
        System.out.println(len);

        // s1.length()-1      last index number
        char lastChar = s1.charAt(s1.length() - 1); // last character
        System.out.println("lastChar = " + lastChar);

        System.out.println(" =========================== ");

        String str = "wooden spoon";
        str = str.toUpperCase();  //WOODEN SPOON

        System.out.println("str = " + str);

        System.out.println(str.toLowerCase());

        String s="JAVA";
        s=s.toLowerCase();
        System.out.println("s = " + s);

        String sentence="Today is great day to learn java programming language.";
        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);
    }
}
