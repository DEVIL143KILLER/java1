package pack1;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg)	//constructor
	{
		super(msg);	//super as constructor of parent class
	}
}

class ItemOutOfStockException extends Exception
{
	public ItemOutOfStockException(String msg)	//constructor
	{
		super(msg);	//super as constructor of parent class
	}
}
class Customer
{
	int Id;
	String Name;
	double WalletBallence;
	String Address;
	 public  Customer(int Id,String Name,double WalletBallence,String Address)
	 {
		this.Id=Id;
		this.Name=Name;
		this.WalletBallence=WalletBallence;
		this.Address=Address;
	}
}
class Item
{
	int Id;
	String Name;
	String CompanyName;
	double Price;
	boolean IsInStock;
	 public Item (int Id,String Name, String CompanyName,double Price,boolean IsInStock)
	 {
		this.Id=Id;
		this.Name=Name;
		this.CompanyName=CompanyName;
		this.Price=Price;
		
	}
}
class ShoppingWebsite
public class SoppingApp 
{	
public static void main(String[] args)
{
	Customer CusDet=new Customer(927392,"steve",5000.0,"USA");
	Item itemDet=new Item(27392,"shirt","raymond",1200,true);
	
	ShoppinWebsite obj=new ShoppingWebsite();
	
	try 
	{
		String out=obj.purchaseItem(itemDet,CusDet);	
		System.out.println(out);
		
	}
	catch (InsufficientBalanceException | ItemOutOfStockException e) 
	{
		System.out.println("Exception :"+e.getClass()+getName()+"-");
	}
}
	
}
