package bt_laptrinh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class socketMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					socketMenu frame = new socketMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public socketMenu() {
		setTitle("Menu ch\u00EDnh \u1EE9ng d\u1EE5ng");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu \u1EE9ng d\u1EE5ng Chat Online");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(89, 27, 320, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ph\u00F2ng Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				socketRoom frRoom = new socketRoom();	
				frRoom.setLocationRelativeTo(null);
				frRoom.setVisible(true);
			}
		});
		btnNewButton.setBounds(70, 109, 122, 68);
		contentPane.add(btnNewButton);
		
		JButton btnBnB = new JButton("B\u1EA1n b\u00E8");
		btnBnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				socketFriend frFriend = new socketFriend();	
				frFriend.setLocationRelativeTo(null);
				frFriend.setVisible(true);
			}
		});
		btnBnB.setBounds(235, 109, 122, 68);
		contentPane.add(btnBnB);
	}
}
