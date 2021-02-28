package bt_laptrinh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JLabel;

public class room {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					room window = new room();
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
	public room() {
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
		
		Choice choice = new Choice();
		choice.setBounds(10, 28, 120, 20);
		frame.getContentPane().add(choice);
		
		List list = new List();
		list.setBounds(10, 54, 120, 197);
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
		
		JLabel lblNewLabel = new JLabel("Ch\u1ECDn room");
		lblNewLabel.setBounds(10, 11, 79, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
