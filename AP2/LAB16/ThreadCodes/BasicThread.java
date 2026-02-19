class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Name:"+Thread.currentThread().getName()+" State:"+Thread.currentThread().getState()+" Priority:"+Thread.currentThread().getPriority());
	}
}
class BasicThread
{
	public static void main(String ar[])
	{
		ThreadDemo ob1 = new ThreadDemo();
		ThreadDemo ob2 = new ThreadDemo();
		System.out.println("Thread State Initially: "+ob1.getState());
		System.out.println("Thread State Initially: "+ob2.getState());
		ob1.setName("Thread One");
		ob2.setName("Thread Two");
		ob1.setPriority(2);
		ob2.setPriority(10);
		ob1.start();
		ob2.start();
		
		System.out.println("Thread State Finally: "+ob1.getState());
		System.out.println("Thread State Finally: "+ob2.getState());
	}	
}