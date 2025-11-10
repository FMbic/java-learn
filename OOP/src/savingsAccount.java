public class savingsAccount extends Account
{
    private double interestRate;
    private int period;

    public savingsAccount (double interestRate, double balance, int accountNumber, int period)
    {
        this.interestRate = interestRate;
        this.period = period;
    }

    public double applyInterest()
    {
        this.getBalance();
        double currentBalance = this.getBalance();
        double interest = getBalance() * ( interestRate /100) * period;
        double newBalance = interest+ currentBalance;
        return newBalance;
    }

    @Override
    public double withdraw(double amount)
    {
        double withdrawAmount = withdraw(amount);
        double withdrawFee = amount * 0.01;

        return withdrawAmount - withdrawFee;
    }

    @Override
    public double deposit(double amount)
    {
        double depositAmount = deposit(amount);
        return depositAmount;
    }

    @Override
    public double getBalance()
    {
        return this.getBalance();
    }

    @Override
    public int getAccountNumber(int accountNumber)
    {
        return this.getAccountNumber(accountNumber);
    }

    @Override
    public String getAccountType()
    {
        return this.getAccountType();
    }

    @Override
    public String accountHolderName()
    {
        return this.accountHolderName();
    }

}
