public class BankAccount {
    private static String bankName = "Liceo Bank";
    private static int totalAccounts = 0;
    private static double interestRate = 0.03;
    private static int accountCounter = 1;

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " 
                           + accountHolderName + " with initial balance: $" + initialBalance);
    }

    private static String generateAccountNumber() {
        return "ACC" + String.format("%03d", accountCounter++);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for " + accountHolderName);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public static String getBankName() {
        return bankName;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
