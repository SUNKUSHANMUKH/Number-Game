import java.util.Scanner;

public class ATM {

    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(int amount) {
        if (bankAccount.getBalance() >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(int amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void checkBalance() {
        System.out.println("Your balance is $" + bankAccount.getBalance());
    }

    public static void main(String[] args) {
       BankAccount bankAccount = new BankAccount(1000);

       
        ATM atm = new ATM(bankAccount);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        int option = scanner.nextInt();


        switch (option) {
            case 1:
                System.out.println("Enter the amount to withdraw: ");
                int amount = scanner.nextInt();
                atm.withdraw(amount);
                break;
            case 2:
                System.out.println("Enter the amount to deposit: ");
                amount = scanner.nextInt();
                atm.deposit(amount);
                break;
            case 3:
                atm.checkBalance();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}