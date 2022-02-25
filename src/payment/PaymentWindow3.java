package payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PaymentWindow3 {

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
					PaymentWindow3 window = new PaymentWindow3();
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
	public PaymentWindow3() {
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
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(8, 10, 78, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Street Address:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(8, 48, 107, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("City:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(8, 92, 96, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Zip:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(8, 136, 78, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(8, 180, 57, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(8, 210, 57, 43);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(75, 19, 107, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 57, 155, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 19, 107, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 101, 147, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(69, 145, 122, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(73, 189, 118, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(73, 223, 118, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Confirm");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_2.setBounds(231, 210, 83, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_3.setBounds(330, 210, 83, 21);
		frame.getContentPane().add(btnNewButton_3);
	}

}
