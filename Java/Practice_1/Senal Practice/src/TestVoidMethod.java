public class TestVoidMethod {

	public static void main(String[] args) {
		// If the Grade Number is above 78.5 Percent,
		// It will display the Grade Information. 
		System.out.print("The Grade is ");
		printGrade(78.5);

		// If the Grade Number is below 59.5 Percent,
		// It will display the Grade Information
		System.out.print("The Grade is ");
		printGrade(59.5);
	}


	public static void printGrade(double score){
		if (score >= 90.0) {
			System.out.println('A');
		}
		else if (score >= 80.0) {
			System.out.println('B');
		}
		else if (score >= 70.0) {
			System.out.println('C');
		}
		else if (score >= 60.0) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
	  }	
	}