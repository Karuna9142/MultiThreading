package com.MultithreadEx;

class Table
{
	public void printTable(int n) 
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(n*i);
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class PrintTable1 extends Thread
{
	Table t;
	public PrintTable1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(2);
	}
}
class PrintTable2 extends Thread
{
	Table t;
	public PrintTable2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
public class MutualThreadEx {

	public static void main(String[] args) {
		Table obj = new Table();
		PrintTable1 t1 = new PrintTable1(obj);
		PrintTable2 t2 = new PrintTable2(obj);
		
		t1.start();
		t2.start();
	}

}
