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

public class socketSignup extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtRepassword;
	private JTextField txtFullname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					socketSignup frame = new socketSignup();
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
	public socketSignup() {
		setTitle("\u0110\u0103ng k\u00ED m\u1EDBi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up Form");
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
		separator_1.setBounds(10, 234, 414, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Re password:");
		lblNewLabel_3.setBounds(10, 164, 76, 14);
		contentPane.add(lblNewLabel_3);
		
		txtRepassword = new JPasswordField();
		txtRepassword.setBounds(117, 161, 307, 20);
		contentPane.add(txtRepassword);
		
		JLabel lblNewLabel_4 = new JLabel("Full name:");
		lblNewLabel_4.setBounds(10, 195, 76, 14);
		contentPane.add(lblNewLabel_4);
		
		txtFullname = new JTextField();
		txtFullname.setBounds(117, 192, 307, 20);
		contentPane.add(txtFullname);
		txtFullname.setColumns(10);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = new String(txtPassword.getPassword());
				String repassword = new String(txtRepassword.getPassword());
				String fullname = txtFullname.getText();
				
				StringBuilder ab = new StringBuilder();
				
				if(username.equals("")) {
					ab.append("Username is empty \n");
				}
				
				if(password.equals("")) {
					ab.append("Password is empty \n");
				}else if(repassword.equals("")) {
					ab.append("REPassword is empty \n");
				}else if(!repassword.equals(password)){
					ab.append("Password is not match Repassword\n");
				}
				
				if(fullname.equals("")) {
					ab.append("Full name is empty \n");
				}
				
				if(ab.length() > 0) {
					JOptionPane.showMessageDialog(contentPane, 
							ab.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
					return;
				}else {
					JOptionPane.showMessageDialog(contentPane, "Signup successfully.");				
				}
			}
		});
		btnSignup.setBounds(118, 247, 89, 23);
		contentPane.add(btnSignup);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(237, 247, 89, 23);
		contentPane.add(btnCancel);
		
		
	}
}




