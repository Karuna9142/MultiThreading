package com.MultithreadEx;

class RunableThread implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("this is the runnable thread");
	}
	
}
public class RunnableThreadEx {

	public static void main(String[] args) {
		
		//Instantiate the runnable
		RunableThread r1 = new RunableThread();
		
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("Main thread is Running");
		

	}

}
