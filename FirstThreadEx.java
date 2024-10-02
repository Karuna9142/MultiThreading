package com.MultithreadEx;

class ThreadEx1 extends Thread
{
	@Override
	public void run()
	{
		//code to be execute
		System.out.println("Thread is running");
	}
}
public class FirstThreadEx {

	public static void main(String[] args) {
		
		MyThreadEx3 obj = new MyThreadEx3();
		//obj.start();
		System.out.println("This is the main thread:- ");
	}

}
