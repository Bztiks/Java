class BankAccount
{
    private double balance;
    
    public BankAccout(double openingBalance)
    {
        balance = openingBalance;
    }
    public void deposit(double amout) 
    {
        balance = balance + amout;    
    }
    public void withdraw(double amout)
    {
        balance = balance - amout;   
    }

    public void display() 
    {
        System.out.println("balance=" + balance);   
    }
}//end calss BankAccout

class BankApp{
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount(100.00);

        System.out.print("Before transactions,");
        ba1.display();

        ba1.deposit(74.35);

        ba1.withdraw(20.00);

        System.out.print("After transactions,");
        ba1.display();
    }
}