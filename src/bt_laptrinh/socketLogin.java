package bt_laptrinh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class socketLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					socketLogin frame = new socketLogin();
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
	public socketLogin() {
		setTitle("\u0110\u0103ng nh\u1EADp h\u1EC7 th\u1ED1ng");
		setBackground(SystemColor.menu);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(148, 23, 147, 28);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 74, 414, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(10, 102, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(117, 99, 307, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(10, 133, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(117, 130, 307, 20);
		contentPane.add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 199, 414, 2);
		contentPane.add(separator_1);
		
		JCheckBox chkRemember = new JCheckBox("Remember me ?");
		chkRemember.setSelected(true);
		chkRemember.setBounds(117, 157, 138, 23);
		contentPane.add(chkRemember);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = new String(txtPassword.getPassword());
				
				StringBuilder ab = new StringBuilder();
				
				if(username.equals("")) {
					ab.append("Username is empty \n");
				}
				if(password.equals("")) {
					ab.append("Password is empty \n");
				}
				if(ab.length() > 0) {
					JOptionPane.showMessageDialog(contentPane, 
							ab.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(username.equals("ftp") && password.equals("123456")) {
					JOptionPane.showMessageDialog(contentPane, "Login successfully.");
					if(chkRemember.isSelected()) {
						JOptionPane.showMessageDialog(contentPane, "Login information is remember");
					}
					socketMenu frMenu = new socketMenu();
					frMenu.setLocationRelativeTo(null);
					frMenu.setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(contentPane,"Invalid username or password","Failure",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(117, 216, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");
				chkRemember.setSelected(true);
			}
		});
		btnReset.setBounds(240, 216, 89, 23);
		contentPane.add(btnReset);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 260, 414, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_3 = new JLabel("N\u1EBFu nh\u01B0 b\u1EA1n ch\u01B0a c\u00F3 t\u00E0i kho\u1EA3n th\u00EC h\u00E3y \u0111\u0103ng k\u00FD ");
		lblNewLabel_3.setBounds(10, 275, 285, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton lblNewLabel_4 = new JButton("T\u1EA1i \u0111\u00E2y");
		lblNewLabel_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				socketSignup frSignup = new socketSignup();
				frSignup.setLocationRelativeTo(null);
				frSignup.setVisible(true);
			}
		});
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(286, 269, 76, 27);
		contentPane.add(lblNewLabel_4);
	}
}
