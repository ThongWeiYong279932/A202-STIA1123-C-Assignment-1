import java.util.Scanner;

public class Customer {						//Part 1.3 User-defined class called Customer
	private String name;					//Variables and arrays are privatized to prevent access from other class
	private int amount;
	private double price;
	private double totalprice;
	private double[] totalpriceperitem = new double[100];
	
	Scanner scan = new Scanner(System.in);		//Part 1.2 Java pre-defined class of Scanner
	
	Customer(){									//Part 1.4 Constructor with no argument
		System.out.print("Please enter the name of product you want: ");
		name = scan.nextLine();
		if(name.equalsIgnoreCase("Cabbage")) {
			price = 3.3;
		}
		else if(name.equalsIgnoreCase("Tomato")) {
			price = 4.0;
		}
		else if(name.equalsIgnoreCase("Corn")) {
			price = 4.5;
		}
		else if(name.equalsIgnoreCase("Mango")) {
			price = 6.0;
		}
		else if(name.equalsIgnoreCase("Watermelon")) {
			price = 3.0;
		}
		else if(name.equalsIgnoreCase("Dragon Fruit")) {
			price = 4.0;
		}
		else {
			System.out.println("Sorry, the product that you enter is not provided in our store");
		}
		System.out.printf("Price: RM%.2f%n",price);
		System.out.print("Please enter the amount of product that you want: ");
		amount = scan.nextInt();
		totalprice = calculateTotalPrice(amount, price);
		printBills(name, amount, price, totalprice);
	}
	
	Customer(double[] price){					//Part 1.4 Constructor with 1 argument
		double p = 0;
		System.out.print("Please enter the name of product you want: ");
		name = scan.nextLine();
		if(name.equalsIgnoreCase("Cabbage")) {
			p = price[0];
		}
		else if(name.equalsIgnoreCase("Tomato")) {
			p = price[1];
		}
		else if(name.equalsIgnoreCase("Corn")) {
			p = price[2];
		}
		else if(name.equalsIgnoreCase("Mango")) {
			p = price[3];
		}
		else if(name.equalsIgnoreCase("Watermelon")) {
			p = price[4];
		}
		else if(name.equalsIgnoreCase("Dragon Fruit")) {
			p = price[5];
		}
		else {
			System.out.println("Sorry, the product that you enter is not provided in our store");
		}
		System.out.printf("Price: RM%.2f%n",p);
		System.out.print("Please enter the amount of product that you want: ");
		amount = scan.nextInt();
		totalprice = calculateTotalPrice(amount, p);
		printBills(name, amount, p, totalprice);
	}
	
	Customer(String[] name, double[] price){				//Part 1.4 Constructor with 2 argument
		int[] amount = new int[price.length];
		for(int i = 0; i < name.length; i++) {
			System.out.print("Please enter the amount that you want for " + name[i] + " : ");
			amount[i] = scan.nextInt();
		}
		totalpriceperitem = calculateTotalPricePerItem(amount, price);
		totalprice = calculateTotalPrice(totalpriceperitem);
		printBills(name, amount, price, totalpriceperitem, totalprice);
	}

	double calculateTotalPrice(int amount, double price) {			//Part 1.3 Method for user-defined class to calculate total price of all products
		return amount*price;
	}
	
	double calculateTotalPrice(double[] totalpriceperitem) {		//Part 1.3 Method for user-defined class to calculate total price of all products
		for(int i = 0; i < totalpriceperitem.length; i++) {
			totalprice += totalpriceperitem[i];
		}
		return totalprice;
	}
	
	double[] calculateTotalPricePerItem(int[] amount, double[] price) {		//Part 1.3 Method for user-defined class to calculate total price of each products
		for(int i = 0; i<price.length; i++) {
			totalpriceperitem[i] = amount[i] * price[i];
		}
		return totalpriceperitem;
	}
	
	void printBills(String name, int amount, double price, double totalprice) {		//Part 1.3 Method for user-defined class to print out bills of customer
		System.out.println();
		System.out.println("Bill");
		System.out.println("Product name: " + name);
		System.out.println("Product amount: " + amount);
		System.out.printf("Product price: RM%.2f%n",price);
		System.out.printf("Total Charge: RM%.2f%n",totalprice);
	}
	
	void printBills(String[] name, int[] amount, double[] price, double[] totalpriceperitem, double totalprice) {		//Part 1.3 Method for user-defined class to print out bills of customer
		System.out.println();
		System.out.println("Bill");
		for(int i = 0; i < name.length; i++) {
			System.out.println();
			System.out.println("Product name: " + name[i]);
			System.out.println("Product amount: " + amount[i]);
			System.out.printf("Product price: RM%.2f%n",price[i]);
			System.out.printf("Total Price for product: RM%.2f%n",totalpriceperitem[i]);
		}
		System.out.printf("Total Charge: RM%.2f%n",totalprice);
	}
}
