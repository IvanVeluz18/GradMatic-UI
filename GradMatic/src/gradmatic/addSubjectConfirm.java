package gradmatic;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class addSubjectConfirm  {

	private JFrame frame;
	private JTextField textFieldSubjectID;
	private JTextField textFieldSubjectName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addSubjectConfirm window = new addSubjectConfirm();
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
	public addSubjectConfirm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame.setResizable(false);
		frame.setBounds(100, 100, 366, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Color panelColor = new Color(111, 158, 227);
		Color txtFieldColor = new Color(15, 54, 96);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 231);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSubjectConfirm = new JButton("Confirm");
		btnSubjectConfirm.setForeground(Color.WHITE);
		btnSubjectConfirm.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 17));
		btnSubjectConfirm.setBounds(118, 174, 113, 35);
		
			btnSubjectConfirm.setBorderPainted(false);
			btnSubjectConfirm.setOpaque(true);
			btnSubjectConfirm.setBackground(txtFieldColor);
		
		panel.add(btnSubjectConfirm);
		
		JLabel lblSubjectID = new JLabel("Subject ID");
		lblSubjectID.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 19));
		lblSubjectID.setBounds(137, 11, 102, 24);
		panel.add(lblSubjectID);
		
		textFieldSubjectID = new JTextField();
		textFieldSubjectID.setForeground(Color.WHITE);
		textFieldSubjectID.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldSubjectID.setBounds(80, 43, 199, 35);
		panel.add(textFieldSubjectID);
		textFieldSubjectID.setColumns(10);
		
		JLabel lblSubjectName = new JLabel("Subject Name");
		lblSubjectName.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 19));
		lblSubjectName.setBounds(118, 95, 150, 24);
		panel.add(lblSubjectName);
		
		textFieldSubjectName = new JTextField();
		textFieldSubjectName.setForeground(Color.WHITE);
		textFieldSubjectName.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldSubjectName.setBounds(80, 123, 199, 35);
		
			panel.setBackground(panelColor);
			textFieldSubjectName.setBackground(txtFieldColor);
			textFieldSubjectID.setBackground(txtFieldColor);
		
		panel.add(textFieldSubjectName);
		textFieldSubjectName.setColumns(10);
	}
}
