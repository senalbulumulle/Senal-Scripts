import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	// Make a int variable called "count"
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;

	public GUI() {
		
		// Make a new Jframe object 
		frame = new JFrame();
		
		// Make a JButton Object
		JButton button = new JButton("Click Me");
		
		// Make an action listener object for button
		button.addActionListener(this);
		
		// Make a JLabel Object
		label = new JLabel("Number of Clicks: 0");
		
		// Make a new JPanel object
	    panel = new JPanel();
		
		// Set the Border of the Panel 
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		
		// Set the layout of the panel 
		panel.setLayout(new GridLayout(0, 1));
		
		// Call Panel to add button
		panel.add(button);
		
		// Call JLabel to add label
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Make a Title
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		
		// Make a new gui object 
		new GUI();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Increment the count
		count++;
		
		// Set the text 
		label.setText("Number of clicks: " + count);
	}

}
