package gradmatic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class StudentGradeMod {

	JFrame frame = new JFrame();
	JTextField textFieldQuiz = new JTextField();
	JTextField textFieldExam = new JTextField();
	JTextField textFieldActivity = new JTextField();
	JTextField textFieldOther = new JTextField();
	JTextField textFieldComputed = new JTextField();
	JTextField textField = new JTextField();
	JTextField textField_1 = new JTextField();
	JTextField textField_2 = new JTextField();
	JTextField textField_3 = new JTextField();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentGradeMod window = new StudentGradeMod();
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
	public StudentGradeMod() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setResizable(false);
		frame.setBounds(new Rectangle(0, 0, 600, 450));
		frame.setBounds(100, 100, 552, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 547, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Color panelColor = new Color(111, 158, 227);
		Color txtFieldColor = new Color(15, 54, 96);
		
			panel.setBackground(panelColor);
			;
		JLabel lblStudentLabel = new JLabel("Student Name");
		lblStudentLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblStudentLabel.setBounds(25, 11, 145, 29);
		panel.add(lblStudentLabel);
		
		JButton btn1stGrad = new JButton("1st Grading");
		btn1stGrad.setForeground(Color.WHITE);
		btn1stGrad.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 14));
		btn1stGrad.setBounds(25, 58, 107, 35);
		panel.add(btn1stGrad);
		
			btn1stGrad.setBorderPainted(false);
			btn1stGrad.setOpaque(true);
			btn1stGrad.setBackground(txtFieldColor);
		
		JButton btn2ndGrad = new JButton("2nd Grading");
		btn2ndGrad.setForeground(Color.WHITE);
		btn2ndGrad.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 13));
		btn2ndGrad.setBounds(156, 58, 107, 35);
		panel.add(btn2ndGrad);
		
			btn2ndGrad.setBorderPainted(false);
			btn2ndGrad.setOpaque(true);
			btn2ndGrad.setBackground(txtFieldColor);
		
		JButton btn3rdGrading = new JButton("3rd Grading");
		btn3rdGrading.setForeground(Color.WHITE);
		btn3rdGrading.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 13));
		btn3rdGrading.setBounds(283, 58, 107, 35);
		panel.add(btn3rdGrading);
		
			btn3rdGrading.setBorderPainted(false);
			btn3rdGrading.setOpaque(true);
			btn3rdGrading.setBackground(txtFieldColor);
		
		JButton btn4thGrading = new JButton("4th Grading");
		btn4thGrading.setForeground(Color.WHITE);
		btn4thGrading.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 14));
		btn4thGrading.setBounds(417, 58, 107, 35);
		panel.add(btn4thGrading);
		
			btn4thGrading.setBorderPainted(false);
			btn4thGrading.setOpaque(true);
			btn4thGrading.setBackground(txtFieldColor);
		
		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblQuiz.setBounds(38, 132, 46, 21);
		panel.add(lblQuiz);
		
		JLabel lblExam = new JLabel("Exam");
		lblExam.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblExam.setBounds(38, 172, 52, 20);
		panel.add(lblExam);
		
		JLabel lblActivity = new JLabel("Activity");
		lblActivity.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblActivity.setBounds(38, 209, 62, 26);
		panel.add(lblActivity);
		
		JLabel lblOther = new JLabel("Other");
		lblOther.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblOther.setBounds(38, 259, 62, 14);
		panel.add(lblOther);
		
		textFieldQuiz = new JTextField();
		textFieldQuiz.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldQuiz.setBounds(137, 130, 46, 29);
		panel.add(textFieldQuiz);
		textFieldQuiz.setColumns(10);
		
			textFieldQuiz.setForeground(Color.WHITE);
			textFieldQuiz.setBackground(txtFieldColor);
		
		textFieldExam = new JTextField();
		textFieldExam.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldExam.setBounds(137, 170, 46, 29);
		panel.add(textFieldExam);
		textFieldExam.setColumns(10);
		
			textFieldExam.setForeground(Color.WHITE);
			textFieldExam.setBackground(txtFieldColor);
		
		textFieldActivity = new JTextField();
		textFieldActivity.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldActivity.setBounds(137, 210, 46, 29);
		panel.add(textFieldActivity);
		textFieldActivity.setColumns(10);
		
			textFieldActivity.setForeground(Color.WHITE);
			textFieldActivity.setBackground(txtFieldColor);
		
		textFieldOther = new JTextField();
		textFieldOther.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldOther.setBounds(137, 254, 46, 29);
		panel.add(textFieldOther);
		textFieldOther.setColumns(10);
		
			textFieldOther.setForeground(Color.WHITE);
			textFieldOther.setBackground(txtFieldColor);
		
		JLabel lblQuizTot = new JLabel("/ 50");
		lblQuizTot.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		lblQuizTot.setBounds(193, 131, 52, 26);
		panel.add(lblQuizTot);
		
		JLabel lblExamTot = new JLabel("/ 100");
		lblExamTot.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		lblExamTot.setBounds(192, 171, 46, 27);
		panel.add(lblExamTot);
		
		JLabel lblActivityTot = new JLabel("/ 50");
		lblActivityTot.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		lblActivityTot.setBounds(193, 213, 46, 22);
		panel.add(lblActivityTot);
		
		JLabel lblOtherTot = new JLabel("/ 50");
		lblOtherTot.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		lblOtherTot.setBounds(193, 261, 46, 14);
		panel.add(lblOtherTot);
		
		JLabel lblComputed = new JLabel("Computed Grade");
		lblComputed.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 20));
		lblComputed.setBounds(346, 146, 157, 29);
		panel.add(lblComputed);
		
		textFieldComputed = new JTextField();
		textFieldComputed.setFont(new Font("Arial Black", Font.PLAIN, 11));
		textFieldComputed.setBounds(344, 185, 159, 29);
		panel.add(textFieldComputed);
		textFieldComputed.setColumns(10);
		
			textFieldComputed.setForeground(Color.WHITE);
			textFieldComputed.setBackground(txtFieldColor);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setForeground(Color.WHITE);
		btnCompute.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnCompute.setBounds(170, 314, 93, 35);
		panel.add(btnCompute);
		
			btnCompute.setBorderPainted(false);
			btnCompute.setOpaque(true);
			btnCompute.setBackground(txtFieldColor);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnClear.setBounds(297, 314, 93, 35);
		panel.add(btnClear);
		
			btnClear.setBorderPainted(false);
			btnClear.setOpaque(true);
			btnClear.setBackground(txtFieldColor);
			
			textField = new JTextField();
			textField.setForeground(Color.WHITE);
			textField.setFont(new Font("Arial Black", Font.PLAIN, 11));
			textField.setColumns(10);
			textField.setBackground(new Color(15, 54, 96));
			textField.setBounds(233, 132, 46, 29);
			panel.add(textField);
			
			textField_1 = new JTextField();
			textField_1.setForeground(Color.WHITE);
			textField_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
			textField_1.setColumns(10);
			textField_1.setBackground(new Color(15, 54, 96));
			textField_1.setBounds(233, 172, 46, 29);
			panel.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setForeground(Color.WHITE);
			textField_2.setFont(new Font("Arial Black", Font.PLAIN, 11));
			textField_2.setColumns(10);
			textField_2.setBackground(new Color(15, 54, 96));
			textField_2.setBounds(233, 212, 46, 29);
			panel.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setForeground(Color.WHITE);
			textField_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
			textField_3.setColumns(10);
			textField_3.setBackground(new Color(15, 54, 96));
			textField_3.setBounds(233, 256, 46, 29);
			panel.add(textField_3);
	
	}
}
