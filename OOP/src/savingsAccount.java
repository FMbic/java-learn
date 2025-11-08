public class savingsAccount extends bankAccount
{
    private double interestRate;
    private int period;

    public savingsAccount (double interestRate, double balance, int accountNumber, int period)
    {
        super(accountNumber, balance);
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
    public double withdrawals(){

    }
}
