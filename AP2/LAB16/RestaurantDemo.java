import java.util.Scanner;
interface Restaurant
{
	void showMenu();
	Object[][] placeOrder();
	int calculateBill(Object cart[][]);
}
class Dominos implements Restaurant
{
	Object ar[][];
	int prodCount = 0;
	Object cart[][];
	Dominos()
	{ar = new Object[][]{{1,"Pizza",300},{2, "GB", 200},{3, "Tacos", 100},{4, "Diet Coke", 50}};}
	public void showMenu()
	{
		for(int i=0; i<ar.length; i++)
			System.out.println(ar[i][0]+ "\t" + ar[i][1] + "\t" + ar[i][2]);
	}
	public Object[][] placeOrder()
	{
		String name;
		int quant = 0, op = 0,i;
		char ch = 'N';
		Scanner sc = new Scanner (System.in);
		do{
			showMenu();
			System.out.print("Enter your choice:");
			op = sc.nextInt();
			System.out.print("Enter the quantity:");
			quant = sc.nextInt();
			prodCount++;
			Object localCart[][] = new Object[prodCount][3];
			if(prodCount>1)
			{for(i=0;i<cart.length;i++)
			{
				localCart[i][0] = cart[i][0];
				localCart[i][1] = cart[i][1];
				localCart[i][2] = cart[i][2];
			}}
			localCart[prodCount-1][0] = ar[op-1][1];
			localCart[prodCount-1][1] = quant;
			localCart[prodCount-1][2] = ar[op-1][2];
			cart = localCart;
			System.out.print("Do you want to continue(y/Y)?:");
			ch = sc.next().charAt(0);
			System.out.println();
		}while(ch=='y'||ch=='Y');
		
		return cart;
	}
	public int calculateBill(Object cart[][])
	{
		int i=0, totalBill=0;
		System.out.println("Number of items in your cart:"+prodCount);
		System.out.println("There are following items in your cart:");
		if(prodCount == 0){
			System.out.println("There are no items in the cart");
		}
		else{
			for(i = 0; i<cart.length; i++)
			{
				System.out.println(cart[i][0]+" "+cart[i][1]+" "+cart[i][2]);
			}
		}
		System.out.print("And the total cart value is:");
		for(i=0;i<cart.length;i++)
		{
			totalBill += (int)cart[i][1]*(int)cart[i][2];
		}
		return totalBill;
	}
}
class RestaurantDemo
{
	public static void main(String ar[])
	{
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		Dominos ob = new Dominos();
		Object Cart[][] = new Object[0][0];
		do{
			System.out.println("1. Display Menu");
			System.out.println("2. Place Order");
			System.out.println("3. Display Cart and Bill Generation");
			System.out.println("4. Exit");
			System.out.print("Enter your choice");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					ob.showMenu();
					break;
				case 2: 
					Cart = ob.placeOrder();
					break;
				case 3:
					System.out.println(ob.calculateBill(Cart));
					break;
			}
		}while(ch!=4);

		System.out.println();
		System.out.println("Thank You");
		

	}
}