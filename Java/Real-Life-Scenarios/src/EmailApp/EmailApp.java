package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		// Make an Email Variable call "em1"
		Email em1 = new Email("John", "Smith");
		
		// Make em1 to set to "getAlternateEmail()"
		em1.setAlternateEmail("js@gmail.com");
		
		// Print out "alternateEmail()"
		System.out.println(em1.getAlternateEmail());

	}

}
