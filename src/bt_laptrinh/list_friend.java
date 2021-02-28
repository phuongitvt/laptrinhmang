package bt_laptrinh;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class list_friend {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_friend window = new list_friend();
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
	public list_friend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 432, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		List list = new List();
		list.setBounds(10, 28, 120, 223);
		frame.getContentPane().add(list);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(144, 28, 267, 197);
		frame.getContentPane().add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(145, 231, 199, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("G\u1EEDi");
		btnNewButton.setBounds(354, 231, 57, 20);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Danh s\u00E1ch b\u1EA1n b\u00E8:");
		lblNewLabel.setBounds(10, 11, 120, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 231, 200, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
