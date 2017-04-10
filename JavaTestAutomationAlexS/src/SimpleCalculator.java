import java.util.Scanner;

public class SimpleCalculator {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String operator= null;
		try {
			do {
				System.out.println("Enter first number");
				Double first = readNumber(scan);
				if (first == null) {
					continue;
				}
				System.out.println("Enter second number \n");
				Double second = readNumber(scan);
				if (second == null) {
					continue;
				}
				System.out.println("Enter Operator from the list: + - * / \n");
				operator = readOperator(scan);
				if (operator == null) {
					continue;
				}
				 Double result = 0.0;
				
			switch (operator) {
			case "+":
				result = first + second;
				System.out.println("Result of the operation is " + result );
				break;

			case "-":
				result = first - second;
				System.out.println("Result of the operation is " + result);
				break;

			case "*":
				result = first * second;
				System.out.println("Result of the operation is " + result);
				break;

			case "/":
				if (second != 0) {
					result = first / second;
					System.out.println("Result of the operation is " + result);
				} else {
					System.out.println(
							"You tried deviding by zero (0)! Note, this is just simple calculator and deviding by zero leaves in 'Limits'");
				}
				break;
				default: 
					System.out.println("Invalid operator \n");
			}
		} while (!operator.equals("q"));
	}catch (Throwable e) {
			System.out.println("Please start again");
					}
		finally 
		{scan.close(); //closing read from console
			}
}
	
	public static Double readNumber(Scanner scan) {
		Double number=null;
		try {
			number = scan.nextDouble();
		} catch (Throwable e) {
			System.out.println("You entered invalid number");
	}
		return number;
	}
	public static String readOperator (Scanner scan){
		String operator=null;
			operator = scan.next();
		return operator;
	}
}