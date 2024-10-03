package com.multiThreading.interconnected;

class Message
{
	private String msg;
	
	public Message(String str)
	{
		this.msg = str;
	}
	public String getMsg()
	{
		return msg;
	}
	public void setMsg(String str)
	{
		this.msg = str;
	}
}
class Waiting implements Runnable
{
 private Message msg;
 public Waiting(Message m)
 {
	 this.msg = m;
 }
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized(msg)
		{
			try
			{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                msg.wait();
            }
			catch(InterruptedException e)
			{
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
		}
		
	}
	
}
class Notify implements Runnable {

    private Message msg;
    
    public Notify(Message msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                msg.notify();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class WaitNotifyMainEx {

	public static void main(String[] args) {
		Message msg = new Message("process it");
        Waiting waiter = new Waiting(msg);
        new Thread(waiter,"waiter").start();
        
        Waiting waiter1 = new Waiting(msg);
        new Thread(waiter1, "waiter1").start();
        
        Notify notifier = new Notify(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");

	}

}
