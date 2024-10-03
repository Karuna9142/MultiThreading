package com.multiThreading.interconnected;

 class MyThread extends Thread
 {
	 //declare one sum variable
	 int sum = 0;
	 
	 public void run()
	 {
		 //this keyword refers to current object
		 synchronized(this)
		 {
			 System.out.println("Child thread start working");
			 for(int i =0; i<=10; i++)
			 {
				 sum = sum+i;
				 System.out.println("Sum :- "+sum);
			 }
		 }
		 System.out.println("Child thread give notification to main thread");
		 this.notify();//we need to send the notification using notify method
	 }
 }
public class WaitNotifyEx {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread m1 = new MyThread();
		m1.start();
		synchronized(m1)
		{
			System.out.println("Main thread is trying to call wait methid...");
			m1.wait();
			System.out.println("Main thread get notify...");
			System.out.println(m1.sum);
		}
		
		

	}

}
