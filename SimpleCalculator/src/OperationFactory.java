public class OperationFactory {
	public static ICalculator getOperation(String operation) {
		switch (operation.toLowerCase()) {
			case "addition":
				return new Addition();
			case "subtraction":
				return new Subtraction();
			case "multiplication":
				return new Multiplication();
			case "division":
				return new Division();
			default:
				throw new IllegalArgumentException("Invalid operation: Please choose from Addition, Subtraction, " +
						                                   "Multiplication, or Division. " + operation);
			
		}
	}
}