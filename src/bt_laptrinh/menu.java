package bt_laptrinh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
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
		
		JButton btnPhngChat = new JButton("Ph\u00F2ng chat");
		btnPhngChat.setBounds(89, 99, 89, 23);
		frame.getContentPane().add(btnPhngChat);
		
		JButton btnBnB = new JButton("B\u1EA1n b\u00E8");
		btnBnB.setBounds(250, 99, 89, 23);
		frame.getContentPane().add(btnBnB);
		
		JLabel lblNewLabel = new JLabel("\u1EE8ng d\u1EE5ng CHAT ONLINE");
		lblNewLabel.setBounds(162, 57, 123, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
