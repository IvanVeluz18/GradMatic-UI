package gradmatic;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

public class TableSec1 extends JInternalFrame{

	private JFrame frame;
	private JTable TableSec1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableSec1 window = new TableSec1();
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
	public TableSec1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TableSec1 = new JTable();
		TableSec1.setBounds(294, 24, 570, 523);
		TableSec1.setBackground(new Color(111, 158, 227));
		frame.getContentPane().add(TableSec1);
	}

}
