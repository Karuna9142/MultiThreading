package com.MultithreadEx;

class Thread4 extends Thread
{
	Thread4(String name , int priority)
	{
		//set priority
		super(name);
		setPriority(priority);
	}
	//execution
	public void run()
	{
		for(int i = 1; i<5; i++)
		{
			System.out.println(getName()+ " numbers = " +" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		Thread4 t1 = new Thread4("High priority thread",Thread.MAX_PRIORITY);
		Thread4 t2 = new Thread4("Mid priority thread",Thread.NORM_PRIORITY);
		Thread4 t3 = new Thread4("Min priority thread",Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
