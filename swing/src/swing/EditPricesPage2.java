package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EditPricesPage2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditPricesPage2 window = new EditPricesPage2();
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
	public EditPricesPage2() {
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
		
		JLabel lblNewLabel = new JLabel("Front:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(77, 23, 52, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMid = new JLabel("Mid:");
		lblMid.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblMid.setBounds(88, 95, 41, 43);
		frame.getContentPane().add(lblMid);
		
		JLabel lblBalcony = new JLabel("Balcony:");
		lblBalcony.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblBalcony.setBounds(62, 160, 61, 43);
		frame.getContentPane().add(lblBalcony);
		
		textField = new JTextField();
		textField.setBounds(139, 35, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 107, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 172, 86, 20);
		frame.getContentPane().add(textField_2);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(294, 65, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.setBounds(294, 138, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Edit prices pg 2");
		lblNewLabel_1.setBounds(10, 0, 119, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
