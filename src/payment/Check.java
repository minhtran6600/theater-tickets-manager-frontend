package payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Check {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check window = new Check();
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
	public Check() {
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
		
		JLabel lblNewLabel = new JLabel("Check Info");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(135, 0, 152, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 25, 71, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("License #:");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(21, 63, 105, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Routing #:");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(21, 99, 96, 39);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Account #:");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(21, 137, 105, 39);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(100, 35, 76, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 73, 112, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 109, 110, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(123, 148, 112, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(194, 35, 81, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Amount:");
		lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(21, 174, 105, 39);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Date:");
		lblNewLabel_1_3_2.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_3_2.setBounds(21, 214, 105, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(123, 186, 112, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(123, 223, 112, 26);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnNewButton.setBounds(300, 111, 112, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnNewButton_1.setBounds(300, 186, 112, 39);
		frame.getContentPane().add(btnNewButton_1);
	}

}
