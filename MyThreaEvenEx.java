package com.MultithreadEx;

class Thread3 implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Running method...");
		for(int i = 1; i<40; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class MyThreaEvenEx {

	public static void main(String[] args) {
		Thread3 t1 = new Thread3();
		Thread t = new Thread(t1);
		t.start();

	}

}
