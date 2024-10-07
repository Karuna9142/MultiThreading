package com.multiThreading;

class ThreadPriority extends Thread
{
	public void run()
	{
		System.out.println("I am inside the run method");
	}
}
public class ThreadPriorityEx {

	public static void main(String[] args) {
		
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		//Priority of thread is = 5(default value)
		
		System.out.println("Priority of first thread is:- "+t1.getPriority());
		System.out.println("Priority of second thread is:- "+t2.getPriority());
		System.out.println("Priority of third thread is:- "+t3.getPriority());
		
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);
		
		System.out.println("After setting the priority");
		//displaying the currently executing thread
		System.out.println("Priority of first thread is:- "+t1.getPriority());
		System.out.println("Priority of second thread is:- "+t2.getPriority());
		System.out.println("Priority of third thread is:- "+t3.getPriority());
		

	}

}
