package day11_SwitchScanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch='A';
        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
