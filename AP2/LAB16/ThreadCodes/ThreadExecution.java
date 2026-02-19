class ThreadDemo extends Thread
{
	public void run()
	{
		int i = 0;
		for(i=0;i<3;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
	}
}
class ThreadExecution
{
	public static void main(String arg[])
	{
		ThreadDemo ob1 = new ThreadDemo();
		ThreadDemo ob2 = new ThreadDemo();
		ob1.start();
		try{
			ob1.join();
		}catch(Exception e){}
		ob2.start();
	}
}