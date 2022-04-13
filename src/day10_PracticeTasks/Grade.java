package day10_PracticeTasks;

public class Grade {
    public static void main(String[] args) {
        char ch='B';
        String result="";
        if (ch=='A'|| ch=='B'|| ch=='C'|| ch=='D'|| ch=='E' ||  ch=='F')
        {
            if (ch=='A'){
                result="Excellent";
            }else if (ch=='B'){
                result="Great Job";
            }else if (ch=='C'){
                result="Good";
            }else if (ch=='D'){
                result="Passed";
            }else {
                result="Failed";
            }
        }
        else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
