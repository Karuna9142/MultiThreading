package com.multiThreading.interconnected;

class Account
{
	int balance = 20000;
	synchronized void withdraw(int amount)
	{
	  System.out.println("Withdraw amount "+amount);
	  if(balance<amount)
	  {
		  System.out.println("Insufficient balance need to deposite...");
		  try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		  this.balance -= amount;
		  System.out.println("Withdraw done");
	  }
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println(amount+ " going to deposite");
		this.balance += amount;
		System.out.println("deposite done");
		notify();//notifying withdraw() method which is waiting for
	}
}
public class InterThreadCommunicationEx {

	public static void main(String[] args) {
		
		Account ac = new Account();
		new Thread()
		{
			public void run()
			{
				ac.withdraw(50000);
			}
		}.start();

		new Thread()
		{
			public void run()
			{
				ac.deposit(50000);
			}
		}.start();

	}

}
