import java.util.Scanner;

class Accounts
{
	private double balance;

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
		p1Savings.withdraw(250);
		p1Savings.deposit(400);
		System.out.println("The account balance is:- "+p1Savings.getBalance());
	}
}