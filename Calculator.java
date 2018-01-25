import java.util.*;
public class Calculator {

	private String choice;
	private String linkedChoice;
	private int numericChoice;
	private LinkedList<Integer> link = new LinkedList<>();
	private int n1, n2, n3, n4, n5;
	private String num1, num2, num3, num4, num5;
	
	static Scanner kybd = new Scanner(System.in);
	
	public Calculator() {
		
	}
	
	public void read() {
		System.out.println("Hi, what operation do you want to choose: +, -, /, *");
		choice = kybd.nextLine();
		
		if(choice.length() > 1) {
			System.out.println("Wrong Format:");
			System.exit(0);
		}
		
		
		
		if(choice.equalsIgnoreCase("+") || choice.equalsIgnoreCase("-") || choice.equalsIgnoreCase("/") || choice.equalsIgnoreCase("*")) {
			System.out.println("Arithmetic Operator Selected: " + "[" + getChoice() + "]");
		}
		else { 
			System.out.println("Wrong Format:");
			System.exit(0);
		}
		
		System.out.println("\n");
		System.out.println("Enter 5 numbers: ");
		n1 = kybd.nextInt();
		n2 = kybd.nextInt();
		n3 = kybd.nextInt();
		n4 = kybd.nextInt();
		n5 = kybd.nextInt();
		
		num1 = Integer.toString(n1);
		num2 = Integer.toString(n2);
		num3 = Integer.toString(n3);
		num4 = Integer.toString(n4);
		num5 = Integer.toString(n5);
		
	}
	
	public void addCalculateData() {
		link.push(n1);
		link.push(n2);
		link.push(n3);
		link.push(n4);
		link.push(n5);
		for(int x = 0; x < link.size(); x++) {
			System.out.println(link.get(x));
			System.out.println("---");
		}
		
		System.out.println("we will start our calculation");
		//Start Calculating
		int sum1 = link.pop() + link.pop();
		System.out.println("We will now push" + " " + sum1 + " " + "into the stack");
		link.push(sum1);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum2 = link.pop() + link.pop();
		System.out.println("We will now push" + " " + sum2 + " " + "into the stack");
		link.push(sum2);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum3 = link.pop() + link.pop();
		System.out.println("We will now push" + " " + sum3 + " " + "into the stack");
		link.push(sum3);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum4 = link.pop() + link.pop();
		System.out.println("We will now push" + " " + sum4 + " " + "into the stack");
		link.push(sum4);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		
	}
	
	public void multiplyData() {
		link.push(n1);
		link.push(n2);
		link.push(n3);
		link.push(n4);
		link.push(n5);
		for(int x = 0; x < link.size(); x++) {
			System.out.println(link.get(x));
			System.out.println("---");
		}
		
		System.out.println("we will start our calculation");
		//Start Calculating
		int sum1 = link.pop() * link.pop();
		System.out.println("We will now push" + " " + sum1 + " " + "into the stack");
		link.push(sum1);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum2 = link.pop() * link.pop();
		System.out.println("We will now push" + " " + sum2 + " " + "into the stack");
		link.push(sum2);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum3 = link.pop() * link.pop();
		System.out.println("We will now push" + " " + sum3 + " " + "into the stack");
		link.push(sum3);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum4 = link.pop() * link.pop();
		System.out.println("We will now push" + " " + sum4 + " " + "into the stack");
		link.push(sum4);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
	}
	
	public void subtractData() {
		link.push(n1);
		link.push(n2);
		link.push(n3);
		link.push(n4);
		link.push(n5);
		for(int x = 0; x < link.size(); x++) {
			System.out.println(link.get(x));
			System.out.println("---");
		}
		
		System.out.println("we will start our calculation");
		//Start Calculating
		int sum1 = link.pop() - link.pop();
		System.out.println("We will now push" + " " + sum1 + " " + "into the stack");
		link.push(sum1);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum2 = link.pop() - link.pop();
		System.out.println("We will now push" + " " + sum2 + " " + "into the stack");
		link.push(sum2);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum3 = link.pop() - link.pop();
		System.out.println("We will now push" + " " + sum3 + " " + "into the stack");
		link.push(sum3);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum4 = link.pop() - link.pop();
		System.out.println("We will now push" + " " + sum4 + " " + "into the stack");
		link.push(sum4);
		System.out.println(sum4);
		
	}
	
	public void divideData() {
		link.push(n1);
		link.push(n2);
		link.push(n3);
		link.push(n4);
		link.push(n5);
		for(int x = 0; x < link.size(); x++) {
			System.out.println(link.get(x));
			System.out.println("---");
		}
		
		System.out.println("we will start our calculation");
		//Start Calculating
		int sum1 = link.pop() / link.pop();
		System.out.println("We will now push" + " " + sum1 + " " + "into the stack");
		link.push(sum1);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum2 = link.pop() / link.pop();
		System.out.println("We will now push" + " " + sum2 + " " + "into the stack");
		link.push(sum2);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum3 = link.pop() / link.pop();
		System.out.println("We will now push" + " " + sum3 + " " + "into the stack");
		link.push(sum3);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
		
		int sum4 = link.pop() / link.pop();
		System.out.println("We will now push " + " " + sum4 + " " + "into the stack");
		link.push(sum4);
		System.out.println("Remaining Original Numbers at the end of the stack" + link);
	}
	
	public void printResults() {
		if(choice.equalsIgnoreCase("+")) {
			addCalculateData();
		}
		
		if(choice.equalsIgnoreCase("*")) {
			multiplyData();
		}
		
		if(choice.equalsIgnoreCase("-")) {
			subtractData();
		}
		
		if(choice.equalsIgnoreCase("/")) {
			divideData();
		}
		
		
	}
	
	
	public String getChoice() {
		return choice;
	}
	
	public void setChoice(String c) {
		this.choice = c;
	}
	
	public int getnumericChoice() {
		return numericChoice;
	}
	
	public void setNumericChoice(int n) {
		this.numericChoice = n;
	}
	
	public int getNum1() {
		return n1;
	}
	
	public int getNum2() {
		return n2;
	}
	
	public int getNum3() {
		return n3;
	}
	
	public int getNum4() {
		return n4;
	}
	
	public int getNum5() {
		return n5;
	}
	
	
}
