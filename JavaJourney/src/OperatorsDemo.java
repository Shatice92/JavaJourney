public class OperatorsDemo {
	public static void main(String[] args) {
		// Arithmetic Operators
		int a = 10, b = 5;
		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modulus: " + (a % b));
		
		System.out.println((a + b > 10 ? "the sum is greater than 10" : "the sum is lower than 10"));
		System.out.println((a % 2 == 0 ? "a is even number" : "a is odd number"));
		System.out.println("divide by zero" + b / 0);//throw an arithmetic exception
		
		// Relational Operators
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a > b: " + (a > b));
		
		// Logical Operators
		boolean x = true, y = false;
		System.out.println("x && y: " + (x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: " + (!x));
		
		// Assignment Operators
		int result = 10;
		result += 5;  // result = result + 5
		System.out.println("Result after += 5: " + result);
		
		// Unary Operators
		int z = 0;
		System.out.println("z++: " + z++);
		System.out.println("++z: " + ++z);
		
		
	}
}