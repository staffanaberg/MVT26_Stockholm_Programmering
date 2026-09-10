package exercise03;

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        account.printBalance();
        account.deposit(200);
        account.printBalance();
        account.withdraw(500);
        account.printBalance();


    }

}
