package day21_PracticeTasks;

public class Tasks_4 {
    public static void main(String[] args) {
        /* 4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2  */
        String[] name={"anna", "level", "Java"};

        int count=0;
        for (String each : name) {
            String palindromes="";
            for (int i = each.length()-1; i >=0 ; i--) {
                palindromes+=each.charAt(i);
            }
            if (each.equalsIgnoreCase(palindromes)){
                count++;
            }
        }
        System.out.println(count);

    }
}
