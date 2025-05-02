package oopProgram;
/*Q18. Bank Abstract Class
Problem: Create an abstract class Bank with the following methods:
deposit(double amount) — allows depositing an amount.
withdraw(double amount) — allows withdrawing an amount.
getBalance() — returns the current balance.
Then, create two subclasses:
SavingsBank — charges a fixed fee of $2 per transaction.
CurrentBank — charges a fixed fee of $5 per transaction.
Write a program that deposits and withdraws money from both types of banks and displays the balance after each transaction.
Explanation:
The abstract class Bank defines the common structure for the deposit, withdraw, and balance methods.
Each subclass applies a different transaction fee.
Logical operation: Use method overriding to show different transaction fees for each type of bank.
*/
import java.util.*;

abstract class Bank
{
	double balance;
	
	public Bank(double balance) {
		this.balance=balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	public double getBalance() {
		return balance;
	}
}
class SavingsBank extends Bank
{
	public SavingsBank(double balance) {
		super(balance);		
	}

	public double getBalance() {
		return 0;
	}

	
	void deposit(double amount) {
		
	}

	
	void withdraw(double amount) {
		
	}
}

class CurrentBank extends Bank
{

	public CurrentBank(double balance) {
		super(balance);
		
	}

	
	void deposit(double amount) {
		
	}

	
	void withdraw(double amount) {
		
	}
	
}
public class Q18_Bank_Abstract_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		
		Bank s = new SavingsBank(balance);
		
		do {
			
			System.out.println("case 1: deposit");
			System.out.println("case 2: withdrow");
			System.out.println("case 3: Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				CurrentBank c = new CurrentBank(balance);
				System.out.println("Enter the amount");
				double amount=sc.nextDouble();
				c.deposit(amount);
				break;
			case 2:
				break;
			case 3:
				break;
				default:
					System.out.println("Invalid input");
			}
		}while(true);
	}

}
