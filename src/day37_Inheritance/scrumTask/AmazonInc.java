package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
        ProductOwner productOwner=new ProductOwner("Suhaib",29,'M',1,160000,company);

        BusinessAnalyst businessAnalyst=new BusinessAnalyst("Cihad",30,'M',2,150000,company);

        ScrumMaster scrumMaster=new ScrumMaster("Anel",26,'F',3,145000,company);

        Tester tester1=new Tester("Chinara",32,'F',"QA",1415,125000,company);

        Tester tester2=new Tester("Fatma",39,'F',"QE",1234,135000,company);

        Tester tester3=new Tester("China",32,'M',"SDET",1465,125000,company);

        Tester tester4=new Tester("Ali",39,'M',"QA",1289,135000,company);

        Tester[] testers={tester1,tester2,tester3,tester4};


        Developer developer1=new Developer("Emine",37,'F',"Java Developer",8,200000,company);

        ScrumTeam scrumTeam1=new ScrumTeam(productOwner,businessAnalyst,scrumMaster);
        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addTesters(testers);

        System.out.println(scrumTeam1);

        System.out.println("-------------------------------------------------");

        for (Tester tester : scrumTeam1.testers) {
            System.out.println(tester.name+" : "+tester.salary);
        }

        System.out.println("-------------------------------------------------");

        for (Developer developer : scrumTeam1.developers) {
            System.out.println(developer.name+" : "+developer.salary);
        }
    }
}
