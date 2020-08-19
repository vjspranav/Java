import java.util.Scanner;

class Accounts
{
	Scanner sc = new Scanner(System.in);

	private double balance;
	private String name;
	private int accno;

	public void name()
	{
		System.out.print("Enter Name: ");
        name = sc.next();
	}

	public Accounts()
	{
		balance = 0;
	}

	public Accounts(double initialBalance)
	{
		balance = initialBalance;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public double getBalance()
	{
		return balance;
	}

}
public class Bank
{
	public static void main(String [] args)
	{
		Accounts p1Savings = new Accounts(1000);
		p1Savings.name();
		p1Savings.withdraw(250);
		p1Savings.deposit(400);
		System.out.println(p1Savings.name+"The account balance is:- "+p1Savings.getBalance());
	}
}