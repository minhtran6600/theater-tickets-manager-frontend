package payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PaymentWindow2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentWindow2 window = new PaymentWindow2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaymentWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(86, 19, 61, 58);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 31, 175, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cash");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(86, 92, 107, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Card");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.setBounds(234, 92, 107, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_2.setBounds(86, 168, 107, 42);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_3.setBounds(234, 168, 107, 42);
		frame.getContentPane().add(btnNewButton_3);
	}
}
