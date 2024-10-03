package com.MultithreadEx;

class Tabel
{
	synchronized void printTable(int n) 
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(n*i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class PrintTable01 extends Thread
{
	Table t;
	public PrintTable01(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(2);
	}
}
class PrintTable02 extends Thread
{
	Table t;
	public PrintTable02(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(3);
	}
}
public class SynchronizedThreadEx {

	public static void main(String[] args) {
		Table obj = new Table();
		PrintTable01 t1 = new PrintTable01(obj);
		PrintTable02 t2 = new PrintTable02(obj);
		
		t1.start();
		t2.start();
	}

}
