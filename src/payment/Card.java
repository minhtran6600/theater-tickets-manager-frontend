package payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Card {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card window = new Card();
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
	public Card() {
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
		
		JLabel lblNewLabel = new JLabel("Please swipe or insert card");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(88, 100, 295, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnNewButton.setBounds(146, 183, 139, 53);
		frame.getContentPane().add(btnNewButton);
	}

}
