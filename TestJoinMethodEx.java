package com.multiThreading;

class ThreadEx extends Thread
{
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				System.out.println(e);
				
			}
			System.out.println(i);
		}
	}
}
public class TestJoinMethodEx {

	public static void main(String[] args) {
		
		ThreadEx t1 = new ThreadEx();
		ThreadEx t2 = new ThreadEx();
		ThreadEx t3 = new ThreadEx();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		//Here we can see that when t1 completes its task till then t2 and t3  is in waiting state
		//after t1 thread t2 and t3 will execute their task
		
		//t2 start
		t2.start();
		t3.start();

	}

}
