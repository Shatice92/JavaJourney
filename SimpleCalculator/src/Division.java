public class Division implements ICalculator {
	@Override
	public double calculate(double number1, double number2) {
		if (number2 == 0) {
			throw new ArithmeticException("Division by zero is not allowed. Please enter a non-zero divisor.");
		}
		return number1 / number2;
	}
}