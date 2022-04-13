package day35_PracticeTasks.PracticeTasks_2;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Fatma",1234567,2373);

        System.out.println(bankAccount);

        bankAccount.deposit(300);

        bankAccount.checkBalance();

        bankAccount.withdraw(450);

        bankAccount.checkBalance();


    }


}
