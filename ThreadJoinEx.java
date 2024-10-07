package com.multiThreading;

class ThreadJoin extends Thread
{
	public void run()
	{
		for(int i = 0; i<2; i++)
		{
			try {
				Thread.sleep(500);
				System.out.println("The Current thread name is:- "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				
				System.out.println("Exception get Caught:- "+e);
			}
			System.out.println(i);
		}
	}
}
public class ThreadJoinEx {

	public static void main(String[] args) {
		
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();

		t1.start();
		
		//start the second thread after when the first thread t1 has ended or died
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception get caught");
		}
		
		t2.start();
		try {
			System.out.println("The second current thread name is:- "+Thread.currentThread().getName());
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Exception has been caught "+e);
		}
		
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			
			System.out.println("Exception has been caught:- "+e);
		}
		
		

	}

}
