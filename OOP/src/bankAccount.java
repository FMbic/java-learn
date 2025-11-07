import java.lang.classfile.constantpool.NameAndTypeEntry;

public class bankAccount
{
    private int accountNumber;
    private double balance;

    public bankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public  double deposit(double amount)
    {
        return balance + amount;
    }

    public double withdraw (double amount)
    {
        return balance - amount;
    }

    public double getBalance()
    {
        return balance;
    }




}
