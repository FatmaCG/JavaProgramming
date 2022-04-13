package liveClasses;

public class Week5DynamicSubstring {
    public static void main(String[] args) {
        String searchResult="result count:12345";
                           //012345678910..........
        //substring() method : it takes index location of the char , returns you a new string
        searchResult=searchResult.substring(13);
        System.out.println(searchResult);
        System.out.println(searchResult.indexOf(":"));//12
        int colonIndex=searchResult.indexOf(":");

        System.out.println(searchResult.substring(colonIndex+1));
        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));



        String today=" I coded a lot of [java] today";

        String word=today.substring(today.indexOf("[")+1,today.indexOf("]"));
        System.out.println(word);

    }
}
