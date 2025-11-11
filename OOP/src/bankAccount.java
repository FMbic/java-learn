public class bankAccount extends Account
{
    private int accountNumber;
    private double balance;


    public bankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
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

    @Override
    public int getAccountNumber(int accountNumber)
    {
        return accountNumber;
    }

    @Override
    public String accountHolderName()
    {

        return "Name";
    }

    @Override
    public String getAccountType()
    {
        return "Type";
    }
}
