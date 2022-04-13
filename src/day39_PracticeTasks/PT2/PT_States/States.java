package day39_PracticeTasks.PT2.PT_States;

public class States {
    private  String name,abbreviation,politicalParty,governor,senator;
    public double population,stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.out.println(name+" can not be null");
            System.exit(1);
        }
        if (name.isBlank()||name.isEmpty()){
            System.out.println("Invalid name "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null){
            System.out.println(abbreviation+" can not be null");
            System.exit(1);
        }
        if (abbreviation.isBlank()||abbreviation.isEmpty()){
            System.out.println("Invalid name "+abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null){
            System.out.println(politicalParty+" can not be null");
            System.exit(1);
        }
        if (politicalParty.isBlank()||politicalParty.isEmpty()){
            System.out.println("Invalid name "+politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor==null){
            System.out.println(governor+" can not be null");
            System.exit(1);
        }
        if (governor.isBlank()||governor.isEmpty()){
            System.out.println("Invalid name "+governor);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator==null){
            System.out.println(senator+" can not be null");
            System.exit(1);
        }
        if (senator.isBlank()||senator.isEmpty()){
            System.out.println("Invalid name "+senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population<=0){
            System.out.println("Invalid population "+population);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0){
            System.out.println("Invalid state Tax "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
