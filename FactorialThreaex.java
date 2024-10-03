package com.MultithreadEx;

class Factorial
{
	//here i have created a synchronized method fact()
	synchronized void fact(int n)
	{
		int f = 1;
		for(int i = 1; i<=n; i++)
		{
			f = f*i;
			System.out.println("Thread:- "+Thread.currentThread().getName()+ " : "+f);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("Factorial of "+n+ " is:- "+f);
	}
}
public class FactorialThreaex {

	public static void main(String[] args) {
		final Factorial fact = new Factorial();
		
		new Thread()
		{
			public void run()
			{
				fact.fact(5);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				fact.fact(10);
			}
		}.start();

	}

}
