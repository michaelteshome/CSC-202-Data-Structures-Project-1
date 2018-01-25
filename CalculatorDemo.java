import java.util.*;
public class CalculatorDemo {

	public static String response;
	static Scanner kybd = new Scanner(System.in);
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		c1.read();
		c1.printResults();
		
		System.out.println("Would you like to try a new calculation with different set of numbers");
		response = kybd.nextLine();
		
		
		while(response.equalsIgnoreCase("yes")) {
			c2.read();
			c2.printResults();
			System.out.print("Would you like to try a new calculation with different set of numbers");
			response =  kybd.nextLine();
			
			if(response.equalsIgnoreCase("no")) {
				System.out.println("Have a nice day");
				System.exit(0);
			}
			
			
			
		}
		
		
		
	}

	
	
	
}
