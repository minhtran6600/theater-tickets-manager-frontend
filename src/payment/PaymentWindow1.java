package payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PaymentWindow1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentWindow1 window = new PaymentWindow1();
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
	public PaymentWindow1() {
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
		
		JLabel lblNewLabel = new JLabel("Choose whether a ticket is being purchased for a");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(42, 10, 339, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Single Day");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.setBounds(42, 114, 151, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Season Ticket");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.setBounds(232, 114, 151, 65);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("single event or a season");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(117, 58, 197, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_2.setBounds(169, 204, 102, 49);
		frame.getContentPane().add(btnNewButton_2);
	}
}
