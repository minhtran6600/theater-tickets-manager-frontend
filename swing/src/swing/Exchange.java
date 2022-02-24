package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exchange {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exchange window = new Exchange();
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
	public Exchange() {
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
		
		JButton btnNewButton = new JButton("Front");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(47, 168, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Middle");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(162, 168, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Balcony");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_2.setBounds(279, 168, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(139, 28, 42, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Date of Performance:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(42, 69, 149, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Seat ID:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setBounds(125, 96, 56, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_3.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(197, 26, 171, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 67, 171, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 106, 171, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Exchange");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 11, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
