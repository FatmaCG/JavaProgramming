package day35_PracticeTasks.PracticeTasks_2;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount<=0){
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(0);
        }
        System.out.println("Depositing $"+amount+" to the account "+accountNumber);

        balance+=amount;
    }

    public void withdraw(double amount){
        if (amount<=0){
            System.err.println("Withdrawing amount can not be negative or zero");
            System.exit(0);
        }
        if (amount>balance){
            System.err.println("Insufficient balance");
            System.exit(0);
        }
        System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);

        balance-=amount;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println(balance);
    }
}
