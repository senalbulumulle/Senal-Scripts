import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUILogin implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		
		// Make a JPanel Object
		JPanel panel = new JPanel();
		
		
		// Make a JFrame Object 
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		// Make the panel set layout
		panel.setLayout(null);
		
		// Make a JLabel Object called "userLabel"
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		// Make a JTextField Object called "userText"
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		// Make a JLabel Object called "passwordLabel"
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		// Make a JPasswordField Object called "passwordText"
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		// Make a JButton object called "button"
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		// Make a JLabel object called "success"
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Make a String Variable called "user"
		String user = userText.getText();
		
		// Make a String Variable called "password"
		String password = passwordText.getText();
		
		// Print out "user" and "password" on the console
		System.out.println(user + ", " + password);
		
		// Make an if statement
		if (user.equals("Senal") && password.equals("fluffyDinosaur123")) {
			// Make a Success Message after User Logs in Successfully
			success.setText("Login successful!");
		}
	}

}
