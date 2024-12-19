package Oops;

class BankAccount
{
	private double balance;
	private int accNo;
	private String name;
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public BankAccount(double balance,int accNo,String name)
	{
		this.balance=balance;
		this.accNo=accNo;
		this.name=name;
	}
	public double withdraw(double amount)
	{
		if (balance<amount){
			System.out.println("In Sufficient Balance");
			return 0;
			} 
		balance-=amount;
		return amount;
	}
	public double getbalance()
	{
		return balance;
	}
	
}

public class EncapBankAccount 
{
	public static void main(String[] args) 
	{
		BankAccount ba=new BankAccount(5000, 101, "Ram");
		System.out.println(ba.getbalance());
		ba.deposit(7000);
		System.out.println(ba.getbalance());
		ba.withdraw(4000);
		System.out.println("After withdraw :"+ ba.getbalance());
		ba.withdraw(8500);
		System.out.println("After withdraw :"+ ba.getbalance());
	}

}
