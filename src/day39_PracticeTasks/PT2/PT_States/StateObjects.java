package day39_PracticeTasks.PT2.PT_States;

public class StateObjects {
    public static void main(String[] args) {
        Virginia virginia=new Virginia("VR","Federal","Barack","Obama",2345.6,10);
        System.out.println(virginia.getAbbreviation());

        System.out.println();
        California california=new California("CL","fe","sfsd","gfg",3456.89,5);
        System.out.println(california.stateTax);

        System.out.println();
        Texas texas=new Texas("TX","Federal","Obama","Barack",232345.45,2);
        System.out.println(texas.population);

        System.out.println();
        Florida florida=new Florida("FL","Federal","Barack","Obama",214234,0);
        System.out.println(florida.getPoliticalParty());

    }
}
