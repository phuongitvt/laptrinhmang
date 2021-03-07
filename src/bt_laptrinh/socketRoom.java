package bt_laptrinh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;

public class socketRoom extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					socketRoom frame = new socketRoom();
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
	public socketRoom() {
		setResizable(false);
		setTitle("Ph\u00F2ng chat");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ph\u00F2ng chat");
		lblNewLabel.setBounds(10, 11, 68, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 30, 102, 22);
		contentPane.add(comboBox);
		
		JList list = new JList();
		list.setBounds(10, 63, 102, 197);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(122, 30, 312, 189);
		contentPane.add(list_1);
		
		textField = new JTextField();
		textField.setBounds(122, 230, 219, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("G\u1EEDi");
		btnNewButton.setBounds(345, 230, 89, 30);
		contentPane.add(btnNewButton);
	}
}
