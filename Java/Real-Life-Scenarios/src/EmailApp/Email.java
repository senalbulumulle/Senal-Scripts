package EmailApp;


import java.util.Scanner;


public class Email {
	// Make String Variables for the data
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	// Make an int variable for the mailbox capacity
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 16;
	// Make a String for the alternative email address
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	
	// Constructor to receive the first name and last name 
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("EMAIL CREATED " + this.firstname + " " + this.lastname); 
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		
		// Print what the new default password is 
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "."  + companySuffix;
		
		// Print what the new email address is 
		System.out.println("Your email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		
		// Create a new Scanner Object 
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		// Make a if-then statement for department choices.
		if (depChoice == 1) {
			return "sales";
		}
		else if (depChoice == 2) {
			return "dev";
		}
		else if (depChoice == 3) {
			return "acct";
		}
		else {
			return "";
		}
	}
	// Generate a random password
	private String randomPassword (int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}:";
		
		// Make a new password string
		char[] password = new char[length];
		
		// Make a loop to get more characters for the random password
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password [i] = passwordSet.charAt (rand);
			
		}
		
		// Show the Password to User
		return new String (password);
	}

	// Set the mailbox capacity
	public void setMailboxCapacity (int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set Alternate Email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Make a Public int variable called "getMailboxCapacity" to return "mailboxCapacity".
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	// Make a Public String called "getAlternativeEmail" to return "alternativeEmail".
	public String getAlternateEmail() {
		return alternateEmail();
	}
	
	private String alternateEmail() {
		return alternateEmail;
	}

	// Make a Public String called "getPassword" to return "password".
	public String getPassword() {
		return password;
	}
	
	// Make a new method called "showInfo()".
	public String showInfo() {
		return "DISPLAY NAME: " + firstname + " " + lastname + "COMPANY EMAIL: " + email + "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}

}
