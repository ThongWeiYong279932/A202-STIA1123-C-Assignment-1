
public class Main {

	public static void main(String[] args) {
		String[] productname = {"Cabbage", "Tomato", "Corn", "Mango", "Watermelon", "Dragon Fruit"};
		double[] price = {3.30, 4.00, 4.50, 6.00, 3.00, 4.00};
		String[] method = {"Advertisement", "Promotion Events"};
		double[] cost = {2500, 1500};
		String[] executivename = {"Adam", "Amelia", "Theresa", "Antonio"};
		
		System.out.println("Grocery Store #1");
		GroceryStoreBusiness a1 = new GroceryStoreBusiness();
		
		System.out.println();
		System.out.println("Grocery Store #2");
		GroceryStoreBusiness a2 = new GroceryStoreBusiness("Fruits and vegetables");
		
		System.out.println();
		System.out.println("Grocery Store #3");
		GroceryStoreBusiness a3 = new GroceryStoreBusiness("Fruits and vegetables", "Kampung Kilang Papan, Hulu Bernam");
		
		System.out.println();
		System.out.println("Products for grocery store #1");
		ProductDescription b1 = new ProductDescription();
		
		System.out.println();
		System.out.println("Products for grocery store #2");
		ProductDescription b2 = new ProductDescription(productname);
		
		System.out.println();
		System.out.println("Products for grocery store #3");
		ProductDescription b3 = new ProductDescription(productname, price);
		
		System.out.println();
		System.out.println("Maketing details for January");
		Marketing c1 = new Marketing();
		
		System.out.println();
		System.out.println("Maketing details for February");
		Marketing c2 = new Marketing(method);
		
		System.out.println();
		System.out.println("Maketing details for March");
		Marketing c3 = new Marketing(method, cost);
		
		System.out.println();
		System.out.println("Employees Management for grocery store #1");
		EmployeeManagement d1 = new EmployeeManagement();
		
		System.out.println();
		System.out.println("Employees Management for grocery store #2");
		EmployeeManagement d2 = new EmployeeManagement(6);
		
		System.out.println();
		System.out.println("Employees Management for grocery store #3");
		EmployeeManagement d3 = new EmployeeManagement(4, executivename);
		
		System.out.println();
		System.out.println("Inventory Management for January");
		InventoryManagement e1 = new InventoryManagement();
		
		System.out.println();
		System.out.println("Inventory Management for February");
		InventoryManagement e2 = new InventoryManagement(productname);
		
		System.out.println();
		System.out.println("Inventory Management for March");
		InventoryManagement e3 = new InventoryManagement(productname, price);
		
		System.out.println();
		System.out.println("Financial Statement for January");
		Finance f1 = new Finance();
		
		System.out.println();
		System.out.println("Financial Statement for February");
		Finance f2 = new Finance(7000);
		
		System.out.println();
		System.out.println("Financial Statement for March");
		Finance f3 = new Finance(6500, 1500);
		
		System.out.println();
		System.out.println("Customer #1");
		Customer g1 = new Customer();
		
		System.out.println();
		System.out.println("Customer #2");
		Customer g2 = new Customer(price);
		
		System.out.println();
		System.out.println("Customer #3");
		Customer g3 = new Customer(productname, price);
		
	}

}
