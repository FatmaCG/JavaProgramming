package day20_PracticeTasks;

import java.util.Arrays;

public class Tasks_2 {
    public static void main(String[] args) {
        /*2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c     */
        String[] names={"Ali Guler", "Fatma Guler", "Meryem Guler", "Meltem Guler", "Huseyin Cekim",
                "Meryem Cekim", "Berra Guler", "Rana Guler", "Mahmut G", "Hamdiye G"};
        String[] reverse=new String[names.length];

        int i=0;
        for (String each : names) {
            String rever="";
            for (int j = each.length()-1; j >=0; j--) {
                 rever+=""+each.charAt(j);
            }
           reverse[i]=rever;
            i++;
        }
        for (String eachh : reverse) {
            System.out.println(eachh);
        }
        /*for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);
        } */
    }
}
