package com.multiThreading;


//if we call the run() directly instead of start()
// it will execute sequentially
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Running..");
		for(int i = 1; i<5; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
class TestCallRunEx {
	public static void main(String[] args)
	{
	  Thread1 t1 = new Thread1();
	  t1.run();
	  t1.run();
	 
		
	}

}

