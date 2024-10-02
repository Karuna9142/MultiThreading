package com.MultithreadEx;

class Thread2 implements Runnable
{

@Override
public void run()
{
	System.out.println("I am using runnable interface");
	for(int i = 1;i<=10;i++)
	{
		System.out.println(i);
		//sleep
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
public class MyThread2
{
	public static void main(String[] args) {
		Thread2 runnable = new Thread2();
		
		Thread th = new Thread(runnable);
		th.start();
		
		System.out.println("main thread is running");
	}
}

