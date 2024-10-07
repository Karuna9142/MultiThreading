package com.multiThreading;

public class TestThreadEx  extends Thread{
	
	public void run()
	{
		System.out.println("Running....");
	}

	public static void main(String[] args) {
		
		TestThreadEx t1 = new TestThreadEx();
		t1.start();
		t1.start(); //can't start a thread twice it throws an exception
		

	}

}
