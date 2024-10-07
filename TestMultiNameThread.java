package com.multiThreading;

class ThreadMulti extends Thread
{
	public void run()
	{
		System.out.println("Running...");
	}
}
public class TestMultiNameThread {

	public static void main(String[] args) {
		ThreadMulti t1 = new ThreadMulti();
		ThreadMulti t2 = new ThreadMulti();
		
		System.out.println("Name of t1:- "+t1.getName());
		System.out.println("Name of t2:- "+t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Karuna Mishra");
		System.out.println("After changing name of t1:-  "+t1.getName());

	}

}
