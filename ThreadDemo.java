package com.MultithreadEx;

class Thread5  extends Thread
{
	public void run()
	{
		for(int i = 1; i<5; i++)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Currently thread working:- "+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		//we start with thread t1
		t1.start();
		
		try
		{
			t1.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		//t2 start working t3
		
		t2.start();
		try
		{
			t2.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		// t2 dead t3 start
		t3.start();
		try
		{
			t3.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
     
	}

}
