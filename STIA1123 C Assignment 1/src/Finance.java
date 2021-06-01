import java.util.Scanner;

public class Finance {						//Part 1.3 User defined class named Finance //sub class for GroceryStoreBusiness
	private double sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome;	//Variables are privatized to prevent the variables to be access from other class
	
	Scanner scan = new Scanner(System.in);							//Part 1.2 Java per-defined class of Scanner
	
	Finance(){																						//Part 1.4 Constructor with no argument
		System.out.print("Please enter this month's sales: RM");
		sales = scan.nextDouble();
		System.out.print("Please enter this month's cost of goods: RM");
		costofgoods = scan.nextDouble();
		System.out.print("Please enter this month's operating expenses: RM");
		operatingExpense = scan.nextDouble();
		System.out.print("Please enter this month's tax expenses: RM");
		tax = scan.nextDouble();
		grossProfit = calculateGrossProfit(sales, costofgoods);
		operatingIncome = calculateOperatingIncome(grossProfit, operatingExpense);
		netIncome = calculateNetIncome(operatingIncome, tax);
		printDetails(sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome);
	}
	
	Finance(double sales){																			//Part 1.4 Constructor with 1 argument
		System.out.printf("This month's sales: RM%.2f%n",sales);
		System.out.print("Please enter this month's cost of goods: RM");
		costofgoods = scan.nextDouble();
		System.out.print("Please enter this month's operating expenses: RM");
		operatingExpense = scan.nextDouble();
		System.out.print("Please enter this month's tax expenses: RM");
		tax = scan.nextDouble();
		grossProfit = calculateGrossProfit(sales, costofgoods);
		operatingIncome = calculateOperatingIncome(grossProfit, operatingExpense);
		netIncome = calculateNetIncome(operatingIncome, tax);
		printDetails(sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome);
	}
	
	Finance(double sales, double costofgoods){														//Part 1.4 Constructor with 2 argument
		System.out.printf("This month's sales: RM%.2f%n",sales);
		System.out.printf("This month's cost of goods: RM%.2f%n",costofgoods);
		System.out.print("Please enter this month's operating expenses: RM");
		operatingExpense = scan.nextDouble();
		System.out.print("Please enter this month's tax expenses: RM");
		tax = scan.nextDouble();
		grossProfit = calculateGrossProfit(sales, costofgoods);
		operatingIncome = calculateOperatingIncome(grossProfit, operatingExpense);
		netIncome = calculateNetIncome(operatingIncome, tax);
		printDetails(sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome);
	}
	
	double calculateGrossProfit(double sales, double costofgoods) {					//Part 1.3 Method for user-defined class to calculate the gross profit
		return sales - costofgoods;													//gross profit = sales - cost of goods
	}
	
	double calculateOperatingIncome(double grossprofit, double operatingexpense) {	//Part 1.3 Method for user-defined class to calculate the operating income 
		return grossprofit - operatingexpense;										//operating income = gross profit - operating expenses
	}
	
	double calculateNetIncome(double operatingincome, double tax) {		//Part 1.3 Method for user-defined class to calculate the net income
		return operatingincome - tax;									//net income = operating income - taxes
	}
	
	void printDetails(double sales, double costofgoods, double operatingexpense, double tax, double grossprofit, double operatingincome, double netincome) {	//Part 1.3 Method for user-defined class to print out the details of finance
		System.out.println();
		System.out.println("Financial Statement");
		System.out.printf("Sales: RM%.2f%n",sales);
		System.out.printf("Cost of goods: RM%.2f%n",costofgoods);
		System.out.printf("Gross Profit: RM%.2f%n",grossprofit);
		System.out.printf("Operating Expense: RM%.2f%n",operatingexpense);
		System.out.printf("Operating Income: RM%.2f%n",operatingincome);
		System.out.printf("Taxes expense: RM%.2f%n",tax);
		System.out.printf("Net Income: RM%.2f%n",netincome);
	}
}
