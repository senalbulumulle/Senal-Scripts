public class CalculatingPi {

	public static void main(String[] args) {
		System.out.println("i\t\tm(i)");
		for (int i = 10; i <=1000000; i += 10) {
			System.out.println(i + "\t\t" + m(i));
		}
	}
		
		// Create new method for double number
			public static double m(int n) {
				
				// Create a variable for Pi
				double pi = 0;
				double term;
			
				// Create a four loop to calculate a term 
				for (int i = 1; i <=n; i += 2) {
					term = 4.0 * (1.0 / (2 * i -1) -1.0 / (2 * i + 1));
					pi += term;
				}
				return pi;
	}

}
