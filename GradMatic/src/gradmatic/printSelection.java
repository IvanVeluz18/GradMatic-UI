package gradmatic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ComboBoxModel;

public class printSelection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					printSelection window = new printSelection();
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
	public printSelection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(SystemColor.textInactiveText);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAutoRequestFocus(false);
		
		frame.setBounds(100, 100, 516, 300);
		//frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 0, 0);
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frame.getContentPane().add(panel);
		panel.setLayout(null);	
		
		Color panelColor = new Color(111, 158, 227);
		Color txtFieldColor = new Color(15, 54, 96);
			
		panel.setBackground(panelColor);
		
		String[] subjList = {"MATHEMATICS", "SCIENCE", "ENGLISH", "AP", "MAPEH", "TLE", "FILIPINO", "ESP"};
		DefaultComboBoxModel<String> cboxModel2 = new DefaultComboBoxModel<String>(subjList);	
		JComboBox cboxSubject = new JComboBox(cboxModel2);
		cboxSubject.setEditable(true);
		cboxSubject.setForeground(Color.WHITE);
		cboxSubject.setBounds(45, 46, 160, 38);
		panel.add(cboxSubject);
		
		cboxSubject.setOpaque(true);
		cboxSubject.setBackground(txtFieldColor);
			
			
		String[] secList = {"SECTION 1", "SECTION 2", "SECTION 3", "SECTION 4"};
		DefaultComboBoxModel<String> cboxModel = new DefaultComboBoxModel<String>(secList);
		JComboBox cboxSection = new JComboBox(cboxModel);
		cboxSection.setForeground(Color.WHITE);
		cboxSection.setEditable(true);
		cboxSection.setBounds(290, 46, 160, 38);
		panel.add(cboxSection);
		
		cboxSection.setOpaque(true);
		cboxSection.setBackground(txtFieldColor);
		
		JLabel lblSubject = new JLabel("Select Subject");
		lblSubject.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblSubject.setBounds(64, 11, 116, 30);
		panel.add(lblSubject);
		
		JLabel lblSection = new JLabel("Select Section");
		lblSection.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		lblSection.setBounds(304, 21, 128, 14);
		panel.add(lblSection);
		
		JButton btnAddSub = new JButton("Add Subject");
		btnAddSub.setForeground(Color.WHITE);
		btnAddSub.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btnAddSub.setBounds(45, 99, 160, 38);
		panel.add(btnAddSub);
			
			btnAddSub.setBorderPainted(false);
			btnAddSub.setOpaque(true);
			btnAddSub.setBackground(txtFieldColor);
		
		JButton btnModSub = new JButton("Modify Subject");
		btnModSub.setForeground(Color.WHITE);
		btnModSub.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btnModSub.setBounds(45, 148, 160, 38);
		panel.add(btnModSub);
		
			btnModSub.setBorderPainted(false);
			btnModSub.setOpaque(true);
			btnModSub.setBackground(txtFieldColor);
		
		JButton btnDeleteSub = new JButton("Delete Subject");
		btnDeleteSub.setForeground(Color.WHITE);
		btnDeleteSub.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
		btnDeleteSub.setBounds(45, 197, 160, 40);
		panel.add(btnDeleteSub);
		
			btnDeleteSub.setBorderPainted(false);
			btnDeleteSub.setOpaque(true);
			btnDeleteSub.setBackground(txtFieldColor);
		
		JButton btnPrintSec = new JButton("Print Section List");
		btnPrintSec.setForeground(Color.WHITE);
		btnPrintSec.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnPrintSec.setBounds(368, 197, 116, 41);
		panel.add(btnPrintSec);
		
			btnPrintSec.setBorderPainted(false);
			btnPrintSec.setOpaque(true);
			btnPrintSec.setBackground(txtFieldColor);
		
		JButton btnPrintStud = new JButton("Print Student Cards");
		btnPrintStud.setForeground(Color.WHITE);
		btnPrintStud.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 13));
		btnPrintStud.setBounds(235, 199, 116, 38);
		panel.add(btnPrintStud);
		
			btnPrintStud.setBorderPainted(false);
			btnPrintStud.setOpaque(true);
			btnPrintStud.setBackground(txtFieldColor);
			
			JLabel lblStudent = new JLabel("Select Student");
			lblStudent.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
			lblStudent.setBounds(300, 102, 128, 14);
			panel.add(lblStudent);
			
			String[] studList = {"wala pa"};
			DefaultComboBoxModel<String> cboxList = new DefaultComboBoxModel<String>(studList);
			JComboBox cboxStudent = new JComboBox(cboxList);
			cboxStudent.setOpaque(true);
			cboxStudent.setForeground(Color.WHITE);
			cboxStudent.setEditable(true);
			cboxStudent.setBackground(new Color(15, 54, 96));
			cboxStudent.setBounds(290, 124, 160, 38);
			panel.add(cboxStudent);
		
	}
}