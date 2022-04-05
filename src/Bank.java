public class Bank
{
    int accountNum;
    double amount = 100;
    String ownerName;
    double balance;

    public Bank(int accountNum, String ownerName)
    {
        this.accountNum = accountNum;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        this.balance += amount;
    }
    public void withdraw(double amount)
    {
        this.balance -= amount;
    }
    public int getAccountNum()
    {
        return accountNum;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    public double getBalance()
    {
        return balance;
    }
}
