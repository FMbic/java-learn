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
        if (amount > 0)
        {
            balance = balance + amount;
        }
        else
        {
            System.out.println("Your amount is too low");
        }

        return balance;
    }

    public double withdraw (double amount)
    {
        if (balance <= 0 && amount > balance)
        {
            System.out.println("Insufficient funds");
        }
        else
        {
            balance = balance - amount;
        }

        return balance;
    }

    public double getBalance()
    {
        return balance;
    }

}
