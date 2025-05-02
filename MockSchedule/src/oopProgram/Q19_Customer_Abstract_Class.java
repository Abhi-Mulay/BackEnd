package oopProgram;
/*Q19. Customer Abstract Class
Problem: Create an abstract class Customer with the following methods:
·        addTransaction(double amount) — adds a transaction amount.
·    	getBalance() — returns the current balance.
Then, create two subclasses:
·        PremiumCustomer — offers a 10% discount on all transactions.
·        RegularCustomer — no discount on transactions.
Write a program that adds transactions for both types of customers and shows their final balance after applying the discount.
Explanation:
·    	The abstract class Customer provides methods for adding transactions and checking balances.
·    	Each subclass implements the transaction logic differently by applying a discount.
·    	Logical operation: Method overriding to apply discounts and track customer balances.*/

import java.util.*;
abstract class Customer1
{
	public abstract void addTransaction(double amount);
	
	public double getBalance() {
		return 0;
	}
	
}
class PremiumCustomer extends Customer1
{
	
	public void addTransaction(double amount) {
		
	}
	
}

class RegularCustomer extends Customer1
{
	
	public void addTransaction(double amount) {
		
	}
	
}
public class Q19_Customer_Abstract_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
	}

}
