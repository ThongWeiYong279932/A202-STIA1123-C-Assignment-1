import java.util.Scanner;

public class Marketing {							//Part 1.3 User-defined class named ProductDescription //subclass of GroceryStoreBusiness
	private String[] method = new String[100];		//Variables and arrays are privatized to prevent the variables and arrays to be access from other class
	private double[] cost = new double [100];
	private char respond;
	private double totalcost;
	
	Scanner scan = new Scanner(System.in);												//Part 1.2 Java pre-defined class of Scanner
	
	Marketing(){																		//Part 1.4 Constructor with no argument
		int i = 0;
		do {
			System.out.print("Please enter the marketing method: ");
			method[i] = scan.next();scan.nextLine();
			System.out.print("Please enter the cost of the marketing method: RM");
			cost[i] = scan.nextDouble();
			i++;
			System.out.print("Is there any other marketing method? (y-yes, n-no): ");
			respond = scan.next().charAt(0);
			while(respond != 'y' && respond != 'n') {
				System.out.println("Wrong input! Please enter y for yes and n for no only!");
				System.out.print("Is there any other marketing method? (y-yes, n-no): ");
				respond = scan.next().charAt(0);
			}
		} while (respond == 'y' && i < method.length);
		totalcost = calculateTotalCost(cost);
		printDetails(method, cost, totalcost);
	}
	
	Marketing(String[] method){														//Part 1.4 Constructor with 1 argument
		for (int i = 0; i < method.length; i++) {
			System.out.print("Please enter the cost of " + method[i] + ": RM");
			cost[i] = scan.nextDouble();			
		}
		totalcost = calculateTotalCost(cost);
		printDetails(method, cost, totalcost);
	}
	
	Marketing(String[] method, double[] cost){										//Part 1.4 Constructor with 2 argument
		totalcost = calculateTotalCost(cost);
		printDetails(method, cost, totalcost);
	}
	
	double calculateTotalCost(double[] cost) {						//Part 1.3 User-defined class to calculate the total cost of marketing
		double totalcost = 0;
		for (int i = 0; i < cost.length; i++) {
			totalcost += cost[i];
		}
		return totalcost;
	}
	
	void printDetails(String[] method, double[] cost, double totalcost) {					//Part 1.3 Method for user-defined class to print out the details of marketing
		System.out.println();
		System.out.println("Marketing Details");
		for (int i = 0; i < method.length; i++) {
			if (method[i] != null) {
				System.out.println("Marketing method " + (i+1) + ": " + method[i]);
				System.out.printf("Cost of marketing method: RM%.2f%n",cost[i]);
			}
		}
		System.out.printf("Total marketing cost: RM%.2f%n",totalcost);
	}
}
