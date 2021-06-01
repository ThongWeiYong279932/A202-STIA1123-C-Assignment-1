import java.util.Scanner;

public class EmployeeManagement {								//Part 1.3 User-defined class named EmployeeManagement //sub class for GroceryStoreBusiness
	private int ordinaryno, executiveno;						//Variables and arrays are privatized to prevent the variables and arrays to be access from other class
	private String[] ordinaryname;
	private String[] executivename;
	private double[] ordinarysalary;
	private double[] executivesalary;
	private double totalordinarysalary, totalexecutivesalary, totalsalary;
	
	
	Scanner scan = new Scanner(System.in);						//Part 1.2 Java pre-defined class of Scanner
	
	EmployeeManagement(){															//Part 1.4 Constructor with no argument
		System.out.print("Please enter the number of ordinary employee: ");
		ordinaryno = scan.nextInt();
		System.out.print("Please enter the number of executive employee: ");
		executiveno = scan.nextInt();
		ordinaryname = new String[ordinaryno];
		ordinarysalary = new double[ordinaryno];
		executivename = new String[executiveno];
		executivesalary = new double[executiveno];
		for(int i = 0; i < ordinaryname.length; i++) {
			System.out.print("Please enter ordinary employee " + (i+1) + " name: ");
			ordinaryname[i] = scan.next();scan.nextLine();
			System.out.print("Please enter his/her salary: RM");
			ordinarysalary[i] = scan.nextDouble();
		}
		for(int j = 0; j < executivename.length; j++) {
			System.out.print("Please enter executive employee " + (j+1) + " name: ");
			executivename[j] = scan.next();scan.nextLine();
			System.out.print("Please enter his/her salary: RM");
			executivesalary[j] = scan.nextDouble();
		}
		totalordinarysalary = calculateTotalOrdinarySalary(ordinarysalary);
		totalexecutivesalary = calculateTotalExecutiveSalary(executivesalary);
		totalsalary = calculateTotalSalary(totalordinarysalary, totalexecutivesalary);
		printDetails(ordinaryno, executiveno, ordinaryname, executivename, ordinarysalary, executivesalary, totalordinarysalary, totalexecutivesalary, totalsalary);
	}
	
	EmployeeManagement(int ordinaryno){														//Part 1.4 Constructor with 1 argument
		System.out.println("The number of ordinary employees: " + ordinaryno);
		System.out.print("Please enter the number of executive employee: ");
		executiveno = scan.nextInt();
		ordinaryname = new String[ordinaryno];
		ordinarysalary = new double[ordinaryno];
		executivename = new String[executiveno];
		executivesalary = new double[executiveno];
		for(int i = 0; i < ordinaryname.length; i++) {
			System.out.print("Please enter ordinary employee " + (i+1) + " name: ");
			ordinaryname[i] = scan.next();scan.nextLine();
			System.out.print("Please enter his/her salary: RM");
			ordinarysalary[i] = scan.nextDouble();
		}
		for(int j = 0; j < executivename.length; j++) {
			System.out.print("Please enter executive employee " + (j+1) + " name: ");
			executivename[j] = scan.next();scan.nextLine();
			System.out.print("Please enter his/her salary: RM");
			executivesalary[j] = scan.nextDouble();
		}
		totalordinarysalary = calculateTotalOrdinarySalary(ordinarysalary);
		totalexecutivesalary = calculateTotalExecutiveSalary(executivesalary);
		totalsalary = calculateTotalSalary(totalordinarysalary, totalexecutivesalary);
		printDetails(ordinaryno, executiveno, ordinaryname, executivename, ordinarysalary, executivesalary, totalordinarysalary, totalexecutivesalary, totalsalary);
	}
	
	EmployeeManagement(int executiveno, String[] executivename){						//Part 1.4 Constructor with 2 argument
		System.out.print("Please enter the number of ordinary employee: ");
		ordinaryno = scan.nextInt();
		System.out.println("The number of executive employees: " + executiveno);
		ordinaryname = new String[ordinaryno];
		ordinarysalary = new double[ordinaryno];
		executivesalary = new double[executiveno];
		for(int i = 0; i < ordinaryname.length; i++) {
			System.out.print("Please enter ordinary employee " + (i+1) + " name: ");
			ordinaryname[i] = scan.next();scan.nextLine();
			System.out.print("Please enter his/her salary: RM");
			ordinarysalary[i] = scan.nextDouble();
		}
		for(int j = 0; j < executivename.length; j++) {
			System.out.print("Please enter executive " + executivename[j] + "'s salary: RM");
			executivesalary[j] = scan.nextDouble();
		}
		totalordinarysalary = calculateTotalOrdinarySalary(ordinarysalary);
		totalexecutivesalary = calculateTotalExecutiveSalary(executivesalary);
		totalsalary = calculateTotalSalary(totalordinarysalary, totalexecutivesalary);
		printDetails(ordinaryno, executiveno, ordinaryname, executivename, ordinarysalary, executivesalary, totalordinarysalary, totalexecutivesalary, totalsalary);
	}
	
	double calculateTotalOrdinarySalary(double[] ordinarysalary) {		//Part 1.3 Method for user-defined class to calculate total salary of ordinary employee
		double totalsalary = 0;
		for (int i = 0; i < ordinarysalary.length; i++) {
			totalsalary += ordinarysalary[i];
		}
		return totalsalary;
	}
	
	double calculateTotalExecutiveSalary(double[] executivesalary) {	//Part 1.3 Method for user-defined class to calculate total salary of executive employee
		double totalsalary = 0;
		for (int i = 0; i < executivesalary.length; i++) {
			totalsalary += executivesalary[i];
		}
		return totalsalary;
	}
	
	double calculateTotalSalary(double totalordinarysalary, double totalexecutivesalary) {		//Part 1.3 Method for user-defined class to calculate total salary of all employee
		return totalordinarysalary + totalexecutivesalary;
	}
	
	void printDetails(int ordinaryno, int executiveno, String[] ordinaryname, String[] executivename, double[] ordinarysalary, double[] executivesalary,
						double totalordinarysalary, double totalexecutivesalary, double totalsalary) {		//Part 1.3 Method for user-defined class to print out the details of employee
								System.out.println();
								System.out.println("Employees Details");
								System.out.println();
								System.out.println("Number of ordinary employee: " + ordinaryno);
								for (int i = 0; i < ordinaryname.length; i++) {
									System.out.println();
									System.out.println("Employee " + (i+1));
									System.out.println("Name: " + ordinaryname[i]);
									System.out.printf("Salary: RM%.2f%n",ordinarysalary[i]);
								}
								System.out.println();
								System.out.println("Number of executive employee: " + executiveno);
								for (int j = 0; j < executivename.length; j++) {
									System.out.println();
									System.out.println("Executive " + (j+1));
									System.out.println("Name: " + executivename[j]);
									System.out.printf("Salary: RM%.2f%n",executivesalary[j]);
								}
								System.out.println();
								System.out.printf("Total salary for ordinary employee: RM%.2f%n",totalordinarysalary);
								System.out.printf("Total salary for executive employee: RM%.2f%n",totalexecutivesalary);
								System.out.printf("Total salary for all employee: RM%.2f%n",totalsalary);
	}
}
