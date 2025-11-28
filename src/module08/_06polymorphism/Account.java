package module08._06polymorphism;

public class Account 
{
    public String name;
    public double balance;

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance;
    }
    
    
    public static void main(String[] args)
    {
        SavingsAccount acct1 = new SavingsAccount("Josh", 100.00, 0.05);
        acct1.print();
    }
}
