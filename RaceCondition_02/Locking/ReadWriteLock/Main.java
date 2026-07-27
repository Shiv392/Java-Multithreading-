package RaceCondition_02.Locking.ReadWriteLock;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
    }
}
