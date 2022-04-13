package day31_PracticeTasks;

public class SalaryCalculator {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate / 100;
        this.federalTaxRate = federalTaxRate / 100;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return weeklyHours * hourlyRate * 52;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary() -stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $" + salary() +
                ", state Tax = $" + stateTax()+
                ", federal Tax $=" + federalTax() +
                ", salary after Tax= $" + salaryAfterTax() +
                '}';
    }
}
