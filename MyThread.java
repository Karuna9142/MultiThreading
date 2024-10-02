package com.MultithreadEx;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("My first thread is running");
	}
}
public class MyThread  {

	public static void main(String[] args) {
		//object
		Thread t1 = new Thread();
		
		t1.start();
		System.out.println("main thread is running...");

	}

}
