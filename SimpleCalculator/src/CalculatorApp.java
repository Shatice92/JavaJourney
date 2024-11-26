import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		double number1 = scanner.nextDouble();
		System.out.println("Please enter second number: ");
		double number2 = scanner.nextDouble();
		System.out.println("Please select your operation(Addition,Subtraction,Multiplication,Division)");
		String operation = scanner.next();
		System.out.println("Your entered first number is " + number1 + " second number is " + number2 + " and " +
				                   "operation " + operation);
		boolean isValid = false;
		while (!isValid) {
			try {
				ICalculator calculator = OperationFactory.getOperation(operation);
				double result = calculator.calculate(number1, number2);
				System.out.println("The result is: " + result);
			}
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Please try again..");
				System.out.println("Enter the operation: ");
				operation = scanner.next();
			}
			scanner.close();
		}
	}
}