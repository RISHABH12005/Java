class ThreadDemo implements Runnable
{
	public void run()
	{
		int i = 0;
		for(i=0;i<3;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
	}
}
class RunnableThread
{
	public static void main(String arg[])
	{
		ThreadDemo ob1 = new ThreadDemo();
		ThreadDemo ob2 = new ThreadDemo();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		t1.start();
		t2.start();
	}
}