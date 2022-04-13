package day07_PracticeTasks;

public class TwoVariables {
    public static void main(String[] args) {
        int a=10,b=15,c;
        c=a;
        a=b;
        b=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
