import java.util.Scanner;

public class InventoryManagement {								//Part 1.3 User-defined class named InventoryManagement
	private String[] name = new String[100];					//Variables and arrays are privatized to prevent access from other class
	private int[] amount = new int[100];
	private double[]value = new double[100];
	private double[] totalperproduct = new double[100];
	private char respond;
	private double totalinventory;
	
	Scanner scan = new Scanner(System.in);						//Part 1.2 Java pre-defined class of Scanner
	
	InventoryManagement(){										//Part 1.4 Constructor with no argument
		int i=0;
		do {
			System.out.print("Please enter the name of products in the inventory: ");
			name[i]= scan.next();scan.nextLine();
			System.out.print("Please enter the amount of products in the inventory: ");
			amount[i] = scan.nextInt();
			System.out.print("Please enter the value per products in the inventory: RM");
			value[i] = scan.nextDouble();
			i++;
			System.out.print("Is there any other products in the inventory? (y-yes n-no): ");
			respond = scan.next().charAt(0);
			while(respond != 'y' && respond != 'n') {
				System.out.println("Wrong input! Please enter y for yes or n for no only!");
				System.out.print("Is there any other products in the inventory? (y-yes n-no): ");
				respond = scan.next().charAt(0);
			}
		}while(respond == 'y' && i<name.length);
		totalperproduct = calculateTotalValuePerProduct(amount, value);
		totalinventory = calculateTotalInventory(totalperproduct);
		printDetails(name, amount, value, totalperproduct, totalinventory);
	}
	
	InventoryManagement(String[] name){						//Part 1.4 Constructor with 1 argument
		for(int i = 0; i < name.length; i++) {
			System.out.print("Please enter the amount of " + name[i] + " in the inventory: ");
			amount[i] = scan.nextInt();
			System.out.print("Please enter the value per " +name[i] + " in the inventory: RM");
			value[i] = scan.nextDouble();
		}
		totalperproduct = calculateTotalValuePerProduct(amount, value);
		totalinventory = calculateTotalInventory(totalperproduct);
		printDetails(name, amount, value, totalperproduct, totalinventory);
	}
	
	InventoryManagement(String[] name, double[] value){		//Part 1.4 Constructor with 2 argument
		amount = new int[name.length];
		for (int i = 0; i < name.length; i++) {
			System.out.print("Please enter amount of " + name[i] + " in the inventory: ");
			amount[i] = scan.nextInt();
		}
		totalperproduct = calculateTotalValuePerProduct(amount, value);
		totalinventory = calculateTotalInventory(totalperproduct);
		printDetails(name, amount, value, totalperproduct, totalinventory);
	}
	
	double[] calculateTotalValuePerProduct(int[]amount, double[] value) {		//Part 1.3 Method for user-defined class to calculate total value per product in inventory
		for(int i = 0; i < amount.length; i++) {
			totalperproduct[i] = amount[i] * value[i];
		}
		return totalperproduct;
	}
	
	double calculateTotalInventory(double[] totalperproduct) {					//Part 1.3 Method for user-defined class to calculate total inventory
		double total = 0;
		for (int i = 0; i < totalperproduct.length; i++) {
			total += totalperproduct[i];
		}
		return total;
	}
	
	void printDetails(String[] name, int[] amount, double[] value, double[] totalperproduct, double totalinventory) {		//Part 1.3 Method for user-defined class to print out details of inventory
		System.out.println();
		System.out.println("Inventory");
			for(int i = 0; i < name.length; i++) {
				if(name[i] != null) {
					System.out.println();
					System.out.println("Inventory product " + (i+1) + ": " + name[i]);
					System.out.println("Amount of product: " + amount[i]);
					System.out.printf("Value per product: RM%.2f%n",value[i]);
					System.out.printf("Total value for product: RM%.2f%n",totalperproduct[i]);
				}
			}
			System.out.println();
			System.out.printf("Total Inventory: RM%.2f%n",totalinventory);
	}
}
