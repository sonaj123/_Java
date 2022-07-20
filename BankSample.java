abstract class Bank
{
	abstract void getBalance(int deposite);
}
class BankA extends Bank
{
	void getBalance(int deposite)
	{
		System.out.println("BankA:Balance is $"+deposite);
	}
}
class BankB extends Bank
{
	void getBalance(int deposite)
	{
		System.out.println("BankB:Balance is $"+deposite);
	}
}
class BankC extends Bank
{
	void getBalance(int deposite)
	{
		System.out.println("BankC:Balance is $"+deposite);
	}
}
public class BankSample
{
	public static void main(String[] args)
	{
		Bank obj = new BankA();
		Bank obj1 = new BankB();
		Bank obj2 = new BankC();
		obj.getBalance(100);
		obj1.getBalance(150);
		obj2.getBalance(200);
	}
}