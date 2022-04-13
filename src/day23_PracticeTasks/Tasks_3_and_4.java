package day23_PracticeTasks;

public class Tasks_3_and_4 {
    public static void main(String[] args) {
        eleigibleToBuyAlcohol(28);
        eligibleToVote(20,"USA");
    }

    public static void eleigibleToBuyAlcohol(int age) {
        if (age >= 22) {
            System.out.println("Ok ,You buy alcohol");
        } else {
            System.out.println("You don't buy alcohol");
        }
    }

    public static void eligibleToVote(int age, String citizen) {
        if (age >= 20 && citizen.equals("USA")) {
            System.out.println("You are eligible to vote ");
        } else {
            System.out.println("You are not eligible to vote! ");
        }
    }
}
