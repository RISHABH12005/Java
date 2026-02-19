class Inventory
{
	int a[] = new int[5];
	int top = -1;	
}
class Producer extends Thread
{
	Inventory I;int i;
	Producer(Inventory ob)
	{I = ob;}
	void produce()
	{
		if(I.top==4)
			System.out.println("Overflow");
		else{
			I.top++;
			I.a[I.top] = I.top;
			System.out.println("Produced:"+I.top);
		}
	}
	public void run()
	{
		for(i=0;i<5;i++)
			produce();
	}
}
class Consumer extends Thread
{
	Inventory I;int i;
	Consumer(Inventory ob)
	{I = ob;}
	void consume()
	{
		if(I.top==-1)
			System.out.println("Underflow");
		else{
			System.out.println("Consumed:"+I.top);
			I.a[I.top] = I.top;
			I.top--;
		}
	}
	public void run()
	{
		for(i=0;i<5;i++)
			consume();
	}
}
class PC
{
	public static void main(String arg[])
	{Inventory ob = new Inventory();
	Producer ob1 = new Producer(ob);
	Consumer ob2 = new Consumer(ob);
	ob1.start();
	ob2.start();}
	
}