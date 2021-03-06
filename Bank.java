import java.util.Scanner;

class Accounts
{
	Scanner sc = new Scanner(System.in);

	private double balance;
	private String name;
	private int accno;
	private double initialBalance;
	private double amount;
	private double deposit;
	private double withdraw;

	public void newAccount()
	{
		System.out.print("Enter Name:- ");
		name = sc.next();
		System.out.print("Enter Account Number:- ");
        accno = sc.nextInt();
	}

	public Accounts()
	{
		balance = 0;
	}

	public void balance()
	{
		System.out.print("First time money deposit:- ");
		initialBalance = sc.nextDouble();
		balance = initialBalance;
	}

	public void deposit()
	{
		System.out.print("Enter the amount you want to deposit:- ");
        deposit = sc.nextDouble();
		balance = balance + deposit;
	}

	public void withdraw()
	{
		System.out.print("Enter the amount you want to withdraw:- ");
		withdraw = sc.nextDouble();
		if (balance >= withdraw) 
		{
			balance = balance - withdraw;
		} else 
		{
            System.out.println("You are trying to withdraw more money than you have in your account, please put a valid amount.");
        }
	}

	public void getBalance()
	{
		System.out.println(name+", Your account balance is:- "+balance);
	}

}
public class Bank
{
	public static void main(String [] args)
	{
		Accounts p1Savings = new Accounts();
		p1Savings.newAccount();
		p1Savings.balance();
		p1Savings.withdraw();
		p1Savings.deposit();
		p1Savings.getBalance();
	}
}