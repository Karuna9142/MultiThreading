package com.multiThreading;

class ThreadName extends Thread
{
	ThreadName(String threadName)
	{
		super(threadName);
	}
	public void run()
	{
		System.out.println("Thread is executing...");
	}
}
public class ThreadNameEx {

	public static void main(String[] args) {
		
		//without using the set() method we can change the name of  thread by using constructor
		ThreadName t1 = new ThreadName("Karuna");
		System.out.println("Thread 1:- "+t1.getName());
		
		t1.start();
	}

}
