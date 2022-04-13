package liveClasses.week08;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String searchResult="1-16 of 829 results for ipad";
        //in my test cases I want to veryify that my search result comes over 500
        //split method turns your string into array
        String[] each=searchResult.split(" ");
        System.out.println(Arrays.toString(each));

        String searchAmount=each[2];
        System.out.println("searchAmount = " + searchAmount);

        System.out.println("------Break time task:capture the amoun 790 with split method------");
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";
       /* String[] eachString=confirmation.split("\n");
        System.out.println(Arrays.toString(eachString));
        String searchstr=eachString[1];
        System.out.println(searchstr.substring(searchstr.indexOf(" "),searchstr.lastIndexOf(" "))); */
       // System.out.println("searchstr = " + searchstr);
       // System.out.println("confirmation = " + confirmation);
        String amount=confirmation.split("\n")[1].split(" " )[1];
        System.out.println("amount = " + amount);

       // confirmation.split("\n") --> array

    }
}
