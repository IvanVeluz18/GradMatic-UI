package gradmatic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JTable;

import java.awt.Font;

public class homepage extends JFrame implements ActionListener{

	JFrame mainFrame = new JFrame();
	JPanel panel = new JPanel();
	JTable mainTable = new JTable();
	JButton btnWeight = new JButton("<html><center>"+"ADJUST TOTAL<br>"+"SCORE AND"+"<br>"+"WEIGHTS"+ "</center></html>");
	JButton btnSubj = new JButton("<html><center>" + "SELECT" + "<br>" + "SUBJECT" + "</center></html>");
	String[] secList = {"SECTION 1", "SECTION 2", "SECTION 3", "SECTION 4"};
	DefaultComboBoxModel<String> cboxModel = new DefaultComboBoxModel<String>(secList);
	JComboBox cboxSection = new JComboBox(cboxModel);

	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setForeground(Color.DARK_GRAY);
		setTitle("GradMatic");
		setResizable(false);
		setAutoRequestFocus(false);
		setBounds(100, 100, 900, 600);
		setBackground(new Color(63, 77, 99));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel.setBackground(new Color(111, 158, 227));
		panel.setBounds(24, 24, 260, 523);
		mainFrame.getContentPane().add(panel);
		
		btnWeight.setForeground(Color.WHITE);
		btnWeight.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 20));
		btnWeight.setBounds(33, 387, 197, 87);
		btnWeight.setBackground(new Color(15, 54, 96));
		btnWeight.addActionListener(this); 
		panel.add(btnWeight);
		
		btnSubj.setForeground(Color.WHITE);
		btnSubj.setBounds(33, 284, 197, 81);
		btnSubj.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 21));
		btnSubj.setBackground(new Color(15, 54, 96));
		btnSubj.addActionListener(this); 
		panel.add(btnSubj);
		
		cboxSection.setForeground(SystemColor.text);
		cboxSection.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 19));
		cboxSection.setBounds(33, 166, 197, 42);
		cboxSection.setBackground(new Color(15, 54, 96));
		panel.add(cboxSection);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(77, 27, 94, 87);
    	lblLogo.setIcon(new ImageIcon(getClass().getResource("logo_smol.png")));
		panel.add(lblLogo);
		
		JLabel lblSec = new JLabel("SELECT SECTION:");
		lblSec.setForeground(SystemColor.text);
		lblSec.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 22));
		lblSec.setBounds(33, 133, 178, 34);
		panel.add(lblSec);
		
		mainTable = new JTable();
		mainTable.setBounds(294, 24, 570, 523);
		mainTable.setBackground(new Color(111, 158, 227));
		mainFrame.getContentPane().add(mainTable);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnWeight) {
			subject subj = new subject(); 
			subj.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage homepage = new homepage();
					homepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
 