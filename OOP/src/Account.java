abstract class Account
{
    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract double getBalance();
    public abstract int getAccountNumber(int accountNumber);
    public abstract String getAccountType();
}
