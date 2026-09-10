package exercise03;

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        int currentBalance = account.getBalance();
        currentBalance = currentBalance/10;
        System.out.println("Saldot är: " +currentBalance);
        account.deposit(200);
        System.out.println("Saldot är: " +account.getBalance());
        account.withdraw(1500);
        System.out.println("Saldot är: " +account.getBalance());


    }

}
