class Demo
{
	void display()
	{
		int i = 0;
		for(;i<3;i++)
			System.out.println("Object "+ this + ": "+ i);
	}
}
class ProcessDemo
{
	public static void main(String arg[])
	{
		Demo ob1 = new Demo();
		Demo ob2 = new Demo();
		ob1.display();
		ob2.display();
	}
}