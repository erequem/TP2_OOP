public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int accountBalance;

    public BankAccount(int accountNumber, String accountHolder, int initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        accountBalance += amount;
        System.out.println("Deposit successful. New balance: " + accountBalance);
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > accountBalance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        accountBalance -= amount;
        System.out.println("Withdrawal successful. New balance: " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, "Rami Gharbi", 1000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getAccountBalance());

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Final Balance: " + account.getAccountBalance());
    }
}