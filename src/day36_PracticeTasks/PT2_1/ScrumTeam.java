package day36_PracticeTasks.PT2_1;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private ProductOwner PO;
    private BusinessAnalyst BA;
    private ScrumMaster SM;
    private ArrayList<Tester> testers ;
    private ArrayList<Developer> developers ;

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        this.testers= new ArrayList<>();
        this.developers= new ArrayList<>();
    }

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBA() {
        return BA;
    }

    public void setBA(BusinessAnalyst BA) {
        this.BA = BA;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p -> p.getId()==id);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developer){
        developers.addAll(Arrays.asList(developer));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p->p.getId()==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
