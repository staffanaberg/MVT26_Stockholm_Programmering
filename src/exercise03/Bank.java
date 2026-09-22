package exercise03;

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(200);
        System.out.println("Saldot är: " +account.getBalance());
        account.withdraw(500);
        System.out.println("Saldot är: " +account.getBalance());

        BankAccount childAccount = new BankAccount(10000);
        account.withdraw(500);
        System.out.println("Saldot är: " +account.getBalance());
        System.out.println("Saldot är: " +childAccount.getBalance());
    }

}
