package com.MultithreadEx;

class ThreadJoin extends Thread
{
	ThreadJoin(String name)
	{
		super(name);
	}
	public void run()
	{
		//this will print 1 to 5
		for(int i = 0; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			//Displaying value of i with the name of thread
			System.out.println("Thread: "+Thread.currentThread().getName()+": "+i);
		}
	}
}
public class ThreadJoinEx  
{
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin("t1");
		ThreadJoin t2 = new ThreadJoin("t2");
		ThreadJoin t3 = new ThreadJoin("t3");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();

	}

}
