package gradmatic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class subject extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBackground(new Color(100, 149, 237));
		frame.getContentPane().setForeground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSubj = new JLabel("Subject: ");
		lblSubj.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj.setForeground(new Color(0, 0, 0));
		lblSubj.setBounds(19, 11, 85, 34);
		frame.getContentPane().add(lblSubj);
		
		JButton btn1stQtr = new JButton("1st Grading");
		btn1stQtr.setForeground(new Color(255, 255, 255));
		btn1stQtr.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn1stQtr.setBounds(19, 56, 130, 32);
		btn1stQtr.setBackground(new Color(15, 54, 96));
		frame.getContentPane().add(btn1stQtr);
		
		JButton btn2ndQtr = new JButton("2nd Grading");
		btn2ndQtr.setForeground(Color.WHITE);
		btn2ndQtr.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn2ndQtr.setBackground(new Color(15, 54, 96));
		btn2ndQtr.setBounds(170, 56, 137, 32);
		frame.getContentPane().add(btn2ndQtr);
		
		JButton btn3rdQtr = new JButton("3rd Grading");
		btn3rdQtr.setForeground(Color.WHITE);
		btn3rdQtr.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn3rdQtr.setBackground(new Color(15, 54, 96));
		btn3rdQtr.setBounds(332, 56, 130, 32);
		frame.getContentPane().add(btn3rdQtr);
		
		JButton btn4thQtr = new JButton("4th Grading");
		btn4thQtr.setForeground(Color.WHITE);
		btn4thQtr.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn4thQtr.setBackground(new Color(15, 54, 96));
		btn4thQtr.setBounds(483, 56, 130, 32);
		frame.getContentPane().add(btn4thQtr);
		
		JLabel lblSubj_1 = new JLabel("Totals");
		lblSubj_1.setForeground(Color.BLACK);
		lblSubj_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1.setBounds(99, 99, 76, 32);
		frame.getContentPane().add(lblSubj_1);
		
		JLabel lblSubj_2 = new JLabel("Weights");
		lblSubj_2.setForeground(Color.BLACK);
		lblSubj_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_2.setBounds(445, 99, 76, 32);
		frame.getContentPane().add(lblSubj_2);
		
		JButton btn1stQtr_1 = new JButton("1st Grading");
		btn1stQtr_1.setForeground(Color.WHITE);
		btn1stQtr_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn1stQtr_1.setBackground(new Color(15, 54, 96));
		btn1stQtr_1.setBounds(30, 301, 130, 32);
		frame.getContentPane().add(btn1stQtr_1);
		
		JButton btn1stQtr_1_1 = new JButton("1st Grading");
		btn1stQtr_1_1.setForeground(Color.WHITE);
		btn1stQtr_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn1stQtr_1_1.setBackground(new Color(15, 54, 96));
		btn1stQtr_1_1.setBounds(177, 301, 130, 32);
		frame.getContentPane().add(btn1stQtr_1_1);
		
		JButton btn1stQtr_1_2 = new JButton("1st Grading");
		btn1stQtr_1_2.setForeground(Color.WHITE);
		btn1stQtr_1_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btn1stQtr_1_2.setBackground(new Color(15, 54, 96));
		btn1stQtr_1_2.setBounds(469, 301, 130, 32);
		frame.getContentPane().add(btn1stQtr_1_2);
		
		textField = new JTextField();
		textField.setBounds(196, 141, 31, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 178, 31, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 215, 31, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 252, 31, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(522, 141, 31, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(522, 178, 31, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(522, 215, 31, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(522, 252, 31, 26);
		frame.getContentPane().add(textField_7);
		
		JLabel lblSubj_2_1 = new JLabel("%");
		lblSubj_2_1.setForeground(Color.BLACK);
		lblSubj_2_1.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 21));
		lblSubj_2_1.setBounds(559, 141, 22, 26);
		frame.getContentPane().add(lblSubj_2_1);
		
		JLabel lblSubj_2_1_1 = new JLabel("%");
		lblSubj_2_1_1.setForeground(Color.BLACK);
		lblSubj_2_1_1.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 21));
		lblSubj_2_1_1.setBounds(559, 178, 22, 26);
		frame.getContentPane().add(lblSubj_2_1_1);
		
		JLabel lblSubj_2_1_1_1 = new JLabel("%");
		lblSubj_2_1_1_1.setForeground(Color.BLACK);
		lblSubj_2_1_1_1.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 21));
		lblSubj_2_1_1_1.setBounds(559, 215, 22, 26);
		frame.getContentPane().add(lblSubj_2_1_1_1);
		
		JLabel lblSubj_2_1_1_2 = new JLabel("%");
		lblSubj_2_1_1_2.setForeground(Color.BLACK);
		lblSubj_2_1_1_2.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 21));
		lblSubj_2_1_1_2.setBounds(559, 252, 22, 26);
		frame.getContentPane().add(lblSubj_2_1_1_2);
		
		JLabel lblSubj_1_1 = new JLabel("Quiz:");
		lblSubj_1_1.setForeground(Color.BLACK);
		lblSubj_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_1.setBounds(67, 142, 76, 26);
		frame.getContentPane().add(lblSubj_1_1);
		
		JLabel lblSubj_1_2 = new JLabel("Exam:");
		lblSubj_1_2.setForeground(Color.BLACK);
		lblSubj_1_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_2.setBounds(66, 179, 76, 26);
		frame.getContentPane().add(lblSubj_1_2);
		
		JLabel lblSubj_1_3 = new JLabel("Activity:");
		lblSubj_1_3.setForeground(Color.BLACK);
		lblSubj_1_3.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_3.setBounds(67, 216, 76, 26);
		frame.getContentPane().add(lblSubj_1_3);
		
		JLabel lblSubj_1_4 = new JLabel("Other:");
		lblSubj_1_4.setForeground(Color.BLACK);
		lblSubj_1_4.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_4.setBounds(66, 253, 76, 26);
		frame.getContentPane().add(lblSubj_1_4);
		
		JLabel lblSubj_1_1_1 = new JLabel("Quiz:");
		lblSubj_1_1_1.setForeground(Color.BLACK);
		lblSubj_1_1_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_1_1.setBounds(402, 142, 76, 26);
		frame.getContentPane().add(lblSubj_1_1_1);
		
		JLabel lblSubj_1_2_1 = new JLabel("Exam:");
		lblSubj_1_2_1.setForeground(Color.BLACK);
		lblSubj_1_2_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_2_1.setBounds(401, 179, 76, 26);
		frame.getContentPane().add(lblSubj_1_2_1);
		
		JLabel lblSubj_1_3_1 = new JLabel("Activity:");
		lblSubj_1_3_1.setForeground(Color.BLACK);
		lblSubj_1_3_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_3_1.setBounds(402, 216, 76, 26);
		frame.getContentPane().add(lblSubj_1_3_1);
		
		JLabel lblSubj_1_4_1 = new JLabel("Other:");
		lblSubj_1_4_1.setForeground(Color.BLACK);
		lblSubj_1_4_1.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		lblSubj_1_4_1.setBounds(401, 253, 76, 26);
		frame.getContentPane().add(lblSubj_1_4_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
