package com.synchronizedEx;

class Product
{
	//creating a printProduct to print the product of n
	synchronized static void print_product(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			System.out.println("Thread:- "+Thread.currentThread().getName()+": "+n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}
}

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		new Thread("t1")
		{
			public void run()
			{
				Product.print_product(2);
			}
		}.start();
        
		new Thread("t2")
		{
			public void run()
			{
				Product.print_product(5);
			}
		}.start();
		new Thread("t3")
		{
			public void run()
			{
				Product.print_product(6);
			}
		}.start();
		
		new Thread("t4")
		{
			public void run()
			{
				Product.print_product(8);
			}
		}.start();
	}

}
