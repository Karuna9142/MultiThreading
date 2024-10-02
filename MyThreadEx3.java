package com.MultithreadEx;

class Threadex4 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
		synchronized(MyThreadEx3.class)
		{
	    try
	    {
			Thread.sleep(2000);
			MyThreadEx3.class.wait();
		} 
	    catch (InterruptedException e)
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("Thread is awake");
	}
	
}

public class MyThreadEx3 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Threadex4();
		System.out.println("Thread State: "+t1.getState());//NEW
		t1.start();
		System.out.println("Thread State:- "+t1.getState());//Runnable
		t1.sleep(1000);
		System.out.println("Thread State:- "+t1.getState());//timed waiting
		synchronized(MyThreadEx3.class)
		{
			MyThreadEx3.class.notify();
		}
		t1.sleep(1000);
		System.out.println("Thread state:- "+t1.getState());

	}

}
