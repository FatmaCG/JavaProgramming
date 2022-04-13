package day36_PracticeTasks.PT4;

public class SportObjects {
    public static void main(String[] args) {
        Basketball basketball=new Basketball();
        basketball.setInfo("ULKER",13,4,"NOT Faul");

        Football football=new Football();
        football.setInfo("Fenerbahce",15,5,"NOT Rules");

        System.out.println(basketball);
        System.out.println(football);
    }
}
