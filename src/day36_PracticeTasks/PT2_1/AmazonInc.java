package day36_PracticeTasks.PT2_1;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {
        ProductOwner productOwner = new ProductOwner();
        productOwner.setInfo("Ali", 42, 'M', 123, "Owner", 1000000);

        ScrumMaster scrumMaster=new ScrumMaster();
        scrumMaster.setInfo("Huseyin",67,'M',456,"Owsome",120000);

        BusinessAnalyst businessAnalyst=new BusinessAnalyst();
        businessAnalyst.setInfo("Meryem",62,'F',765,"Mom",23443560);

        Tester tester=new Tester();
        tester.setInfo("Fatma",39,'F',987,"Senior Tester",1200000);

        Tester tester1=new Tester();
        tester1.setInfo("Huseyin",67,'M',450,"Owsome",120000);

        Tester tester2=new Tester();
        tester2.setInfo("Meryem",62,'F',760,"Mom",23443560);

        Developer developer=new Developer();
        developer.setInfo("Fatma",40,'F',231,"Team Lead",3200000);

        Developer developer1=new Developer();
        developer1.setInfo("Ali", 42, 'M', 123, "Owner", 1000000);

        ArrayList<Tester> testers=new ArrayList<>(Arrays.asList(tester,tester1,tester2));
        ArrayList<Developer> developers=new ArrayList<>(Arrays.asList(developer,developer1));

        ScrumTeam scrumTeam=new ScrumTeam(productOwner,businessAnalyst,scrumMaster, testers,developers);

        System.out.println(scrumTeam);

        System.out.println(tester );

    }

}
