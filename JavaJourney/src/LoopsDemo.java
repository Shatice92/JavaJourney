public class LoopsDemo {
	public static void main(String[] args) {
		// For Loop Example
		System.out.println("For Loop:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Iteration " + i);
		}
		
		// While Loop Example
		System.out.println("\nWhile Loop:");
		int i = 0;
		while (i < 5) {
			System.out.println("Iteration " + i);
			i++;
		}
		
		// Do-While Loop Example
		System.out.println("\nDo-While Loop:");
		i = 0;
		do {
			System.out.println("Iteration " + i);
			i++;
		} while (i < 5);
		
		//Add a loop to print the first 10 even numbers. You can use any loop you prefer.
		System.out.println("First 10 even numbers are: ");
		for (int j = 0; j < 10; j++) {
			System.out.println(2*j);
		}
		
		//Try creating a simple multiplication table (1x1, 1x2, 1x3, etc.) using a nested loop.
		for (int j = 1; j <= 10; j++) {
			for (int k = 1; k <=10 ; k++) {
				System.out.print(j+"*"+k+"="+(j*k)+"\t");
			}
			System.out.println();
			
		}
	}
}