package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;

public class Orders extends JInternalFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	Font tblfont = new Font("Arial", Font.PLAIN, 16);
	Font lblfont2 = new Font("Arial", Font.BOLD, 16);
	Font lblfont3 = new Font("Arial Black", Font.BOLD, 16);
	
	String month [] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	String day [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			 "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
			 "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String year [] = {"2021", "2022", "2023", "2024", "2025"};
	String mop [] = {"COD", "Cheque", "Deposit"};
	String status1 [] = {"Unpaid", "Paid"};
	String status2 [] = {"Unpaid", "Completed", "In Transit", "Cancelled"};
	
	JButton btnAddO = new JButton("Add"); 
	JFrame frmAdd = new JFrame();
	JButton btnConA = new JButton("Confirm");
	JTextField addNum = new JTextField();
	JComboBox<String> addMon = new JComboBox<String>(month);
	JComboBox<String> addDay = new JComboBox<String>(day);
	JComboBox<String> addYear = new JComboBox<String>(year);
	JTextField addItem = new JTextField();
	JComboBox<String> addMOP = new JComboBox<String>(mop);
	JTextField addQty = new JTextField();
	JTextField addPrc = new JTextField();
	JComboBox<String> addStat = new JComboBox<String>(status1);
	
	JButton btnUpdO = new JButton("Edit");
	JFrame frmUpd = new JFrame();
	JButton btnCheck = new JButton("Check");
	JButton btnConU = new JButton("Update");
	JTextField updNum = new JTextField();
	JComboBox<String> updStat = new JComboBox<String>(status2);

	JTable table = new JTable();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	// Removed
		String url = "";
		String user = "";
		String pass = "";
	
	public void paint(Graphics gp) { 
		super.paint(gp); Graphics2D graphics = (Graphics2D) gp;
			graphics.setColor(new Color(169,190,221));
			graphics.setStroke(new BasicStroke(3));
		    graphics.drawLine(20, 70, 800, 70);
	}
	
	public Orders() {
        initOrdrComp();
        Table();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
	
	public void Table() {
		try{
			con = DriverManager.getConnection(url,user,pass);
			String sql = "SELECT * FROM vxoknhvq_db01.orders";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}	
	}
	
	void initOrdrComp() {
		Font lblfont = new Font("Arial Black", Font.BOLD, 50);
		
		getContentPane().setLayout(null);
		this.setBackground(new Color(34,40,49));
		
		JPanel ordrPanel = new JPanel();
			ordrPanel.setLayout(null);
						
		JLabel lbl = new JLabel("Orders");
			lbl.setFont(lblfont);
			lbl.setBounds(20,10,340,60);
			lbl.setOpaque(true);
			lbl.setBackground(new Color(34,40,49));
			lbl.setForeground(Color.white);

		JLabel lblBG = new JLabel("");
    		lblBG.setBounds(55,14,717,600);
    		lblBG.setIcon(new ImageIcon(getClass().getResource("pngBG2.png")));
    		
    	DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);	
    		
    		table.setEnabled(false);
    		
    	JTableHeader head = table.getTableHeader();
    		head.setBackground(new Color(57,62,70));
    		head.setFont(lblfont2);
    		head.setForeground(Color.white);
    		head.setBorder(null);
    				
    	JScrollPane	sp = new JScrollPane(table);
    		sp.setBounds(20, 90, 780, 450);
	    	sp.setVisible(true);
	    	sp.setBackground(new Color(57,62,70));
	    	sp.getViewport().setBackground(new Color(57,62,70));
    		
	    	table.setDefaultRenderer(Object.class, centerRenderer);
    		table.setRowHeight(40);
    		table.setFont(tblfont);
    		table.setForeground(Color.white);
    		table.setBackground(new Color(34,40,49));
    		table.setGridColor(new Color(169,190,221));
    		table.getTableHeader().setReorderingAllowed(false);
    		table.getTableHeader().setPreferredSize(new Dimension(sp.getWidth(),45));
    		
    		btnAddO.setBounds(580, 560, 100, 40);
    		btnAddO.setFont(lblfont3);
    		btnAddO.setForeground(Color.white);
    		btnAddO.setBackground(new Color(57,62,70));
    		btnAddO.setFocusPainted(false); 
    		btnAddO.addActionListener(this);
    		
    		btnUpdO.setBounds(700, 560, 100, 40);
    		btnUpdO.setFont(lblfont3);
    		btnUpdO.setForeground(Color.white);
    		btnUpdO.setBackground(new Color(57,62,70));
    		btnUpdO.setFocusPainted(false); 
    		btnUpdO.addActionListener(this);
    		
    		add(btnAddO);
    		add(btnUpdO);
    		add(sp);
			add(lbl);
			add(lblBG);
		add(ordrPanel);
		
		Font txtfont = new Font("Monospaced", Font.PLAIN, 14);
		Font txtin = new Font("Monospaced", Font.PLAIN, 16);
		
			frmAdd.setSize(350,600);
			frmAdd.setResizable(false);
			frmAdd.getContentPane().setLayout(null);
			frmAdd.setLocationRelativeTo(null);
			frmAdd.setIconImage(new ImageIcon(getClass().getResource("IconLogo.png")).getImage());
			frmAdd.setTitle("Add Order");
			
		JPanel p_addo = new JPanel();
			p_addo.setLayout(null);
			p_addo.setBounds(0,0,350,600);
			p_addo.setBackground(new Color(57,62,70));
			
		JLabel lblImg = new JLabel("");
			lblImg.setIcon(new ImageIcon(getClass().getResource("Logo.png")));
			lblImg.setBounds(100, 20, 140, 135);
		
		JLabel lblin1 = new JLabel("Enter order details.");
			lblin1.setFont(txtin);
			lblin1.setBounds(80, 170, 300, 20);
			lblin1.setForeground(Color.white);
			
		JLabel lblnum = new JLabel("Order Number:");
			lblnum.setBounds(20, 210, 120, 20);
			lblnum.setFont(txtfont);
			lblnum.setForeground(Color.white);
			lblnum.setBackground(new Color(57,62,70));
			lblnum.setOpaque(true);
			
			addNum.setBounds(150, 210, 180, 20);
			
		JLabel lbldate = new JLabel("Date Ordered:");
			lbldate.setBounds(20, 250, 120, 20);
			lbldate.setFont(txtfont);
			lbldate.setForeground(Color.white);
			lbldate.setBackground(new Color(57,62,70));
			lbldate.setOpaque(true);
			
			addMon.setBounds(150, 250, 50, 20);
			addMon.setSelectedIndex(1);
			addDay.setBounds(210, 250, 50, 20);
			addDay.setSelectedIndex(22);
			addYear.setBounds(270, 250, 60, 20);
			addYear.setSelectedIndex(0);
			
		JLabel lblitem = new JLabel("Product:");
			lblitem.setBounds(20, 290, 120, 20);
			lblitem.setFont(txtfont);
			lblitem.setForeground(Color.white);
			lblitem.setBackground(new Color(57,62,70));
			lblitem.setOpaque(true);
			
			addItem.setBounds(150, 290, 180, 20);
			
		JLabel lblmop = new JLabel("Payment method:");
			lblmop.setBounds(20, 330, 120, 20);
			lblmop.setFont(txtfont);
			lblmop.setForeground(Color.white);
			lblmop.setBackground(new Color(57,62,70));
			lblmop.setOpaque(true);
			
			addMOP.setBounds(150, 330, 180, 20);
			addMOP.setSelectedIndex(0);
			
		JLabel lblqty = new JLabel("Quantity:");
			lblqty.setBounds(20, 370, 120, 20);
			lblqty.setFont(txtfont);
			lblqty.setForeground(Color.white);
			lblqty.setBackground(new Color(57,62,70));
			lblqty.setOpaque(true);
			
			addQty.setBounds(150, 370, 180, 20);
			
		JLabel lblprc = new JLabel("Total Price:");
			lblprc.setBounds(20, 410, 120, 20);
			lblprc.setFont(txtfont);
			lblprc.setForeground(Color.white);
			lblprc.setBackground(new Color(57,62,70));
			lblprc.setOpaque(true);	
			
			addPrc.setBounds(150, 410, 180, 20);
			
		JLabel lblstat = new JLabel("Status:");
			lblstat.setBounds(20, 450, 120, 20);
			lblstat.setFont(txtfont);
			lblstat.setForeground(Color.white);
			lblstat.setBackground(new Color(57,62,70));
			lblstat.setOpaque(true);	
			
			addStat.setBounds(150, 450, 180, 20);	
			
			btnConA.setBounds(115, 500, 125, 35);
	    	btnConA.setFont(txtfont);
	    	btnConA.setBackground(new Color(34,40,49));
	    	btnConA.setForeground(Color.white);
	    	btnConA.setFocusable(false);
	    	btnConA.addActionListener(this);
			
			p_addo.add(lblin1);
			p_addo.add(lblImg);
			p_addo.add(addNum);
			p_addo.add(addMon);
			p_addo.add(addDay);
			p_addo.add(addYear);
			p_addo.add(addItem);
			p_addo.add(addMOP);
			p_addo.add(addQty);
			p_addo.add(addPrc);
			p_addo.add(addStat);
			p_addo.add(lblnum);
			p_addo.add(lbldate);
			p_addo.add(lblitem);
			p_addo.add(lblmop);
			p_addo.add(lblqty);
			p_addo.add(lblprc);
			p_addo.add(lblstat);
			p_addo.add(btnConA);
		frmAdd.add(p_addo);
		
			frmUpd.setSize(350,500);
			frmUpd.setResizable(false);
			frmUpd.getContentPane().setLayout(null);
			frmUpd.setLocationRelativeTo(null);
			frmUpd.setIconImage(new ImageIcon(getClass().getResource("IconLogo.png")).getImage());
			frmUpd.setTitle("Update Order");
		
		JPanel p_updo = new JPanel();
			p_updo.setLayout(null);
			p_updo.setBounds(0,0,350,500);
			p_updo.setBackground(new Color(57,62,70));
			
		JLabel lblImg2 = new JLabel("");
			lblImg2.setIcon(new ImageIcon(getClass().getResource("Logo.png")));
			lblImg2.setBounds(100, 20, 140, 135);
		
		JLabel lblin2 = new JLabel("Update order details.");
			lblin2.setFont(txtin);
			lblin2.setBounds(80, 170, 300, 20);
			lblin2.setForeground(Color.white);
			
		JLabel lblnum2 = new JLabel("Order Number:");
			lblnum2.setBounds(20, 210, 120, 20);
			lblnum2.setFont(txtfont);
			lblnum2.setForeground(Color.white);
			lblnum2.setBackground(new Color(57,62,70));
			lblnum2.setOpaque(true);
			
			updNum.setBounds(150, 210, 180, 20);
			
			btnCheck.setBounds(115, 250, 125, 35);
			btnCheck.setFont(txtfont);
			btnCheck.setBackground(new Color(34,40,49));
			btnCheck.setForeground(Color.white);
			btnCheck.setFocusable(false);
			btnCheck.addActionListener(this);
		
		JLabel lblnstat = new JLabel("Update Status:");
			lblnstat.setBounds(20, 300, 120, 20);
			lblnstat.setFont(txtfont);
			lblnstat.setForeground(Color.white);
			lblnstat.setBackground(new Color(57,62,70));
			lblnstat.setOpaque(true);		
			
			updStat.setBounds(150, 300, 180, 20);
			
			btnConU.setBounds(115, 340, 125, 35);
			btnConU.setFont(txtfont);
			btnConU.setBackground(new Color(34,40,49));
			btnConU.setForeground(Color.white);
			btnConU.setFocusable(false);
			btnConU.addActionListener(this);
			
			p_updo.add(lblin2);
			p_updo.add(lblImg2);
			p_updo.add(updNum);
			p_updo.add(btnCheck);
			p_updo.add(updStat);
			p_updo.add(btnConU);
			p_updo.add(lblnum2);
			p_updo.add(lblnstat);
		frmUpd.add(p_updo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAddO) {
			frmAdd.setVisible(true);
			frmUpd.setVisible(false);
			addNum.setText("");
			addMon.setSelectedIndex(1);
			addDay.setSelectedIndex(22);
			addYear.setSelectedIndex(0);
			addItem.setText("");
			addMOP.setSelectedIndex(0);
			addQty.setText("");
			addPrc.setText("");
			addStat.setSelectedIndex(0);
		}
		
		if(e.getSource() == btnConA) {
			try{
				String sql = "INSERT INTO orders (OrderNum, Date, Item, MOP, Quantity, Price, Status)"
					+ "VALUES (?,?,?,?,?,?,?)";
				
				con = DriverManager.getConnection(url,user,pass);
				pst = con.prepareStatement(sql);
				pst.setString(1, addNum.getText());
				pst.setString(2, addMon.getSelectedItem().toString() + " " + addDay.getSelectedItem().toString() + ", "
								+ addYear.getSelectedItem().toString());
				pst.setString(3, addItem.getText());
				pst.setString(4, addMOP.getSelectedItem().toString());
				pst.setString(5, addQty.getText());
				pst.setString(6, addPrc.getText());
				pst.setString(7, addStat.getSelectedItem().toString());
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Order # " + addNum.getText() + " added succesfully.", 
								"Product added", JOptionPane.INFORMATION_MESSAGE);
				
				frmAdd.setVisible(false);
				
			} catch (SQLException | HeadlessException ex) {
				JOptionPane.showMessageDialog(null, ex);
			}	
			Table();
		}
		
		if(e.getSource() == btnUpdO) {
			frmAdd.setVisible(false);
			frmUpd.setVisible(true);
			updStat.setSelectedIndex(1);
			updStat.setEnabled(false);
			btnConU.setEnabled(false);
			
		}
		if(e.getSource() == btnCheck) {
			try {
				con = DriverManager.getConnection(url,user,pass);
				PreparedStatement st = (PreparedStatement) 
		            	con.prepareStatement("Select OrderNum from orders where OrderNum=?");
	
		        st.setString(1, updNum.getText());
		        ResultSet rs = st.executeQuery();
		        
		        if (rs.next()) {
		        	JOptionPane.showMessageDialog(null, "Update product# " + updNum.getText() + "'s information.",
		        			"Update product", JOptionPane.INFORMATION_MESSAGE);
		        	updNum.setEnabled(false);
		        	updStat.setEnabled(true);
		        	btnConU.setEnabled(true);

		        } else {
		        	JOptionPane.showMessageDialog(null, "Order # " + updNum.getText() + " does not exist.",
		        			"Update product", JOptionPane.ERROR_MESSAGE);
		        	updNum.setText("");
		        }	
			} catch (SQLException | HeadlessException ex) {
				JOptionPane.showMessageDialog(null, ex);
			}	
		}
		
		if (e.getSource() == btnConU) {
			try {
				String sql = "UPDATE orders SET Status=? WHERE OrderNum=?";
    			con = DriverManager.getConnection(url,user,pass);
    			pst = con.prepareStatement(sql);
    			pst.setString(1, updStat.getSelectedItem().toString());
    			pst.setString(2, updNum.getText());
    			pst.executeUpdate();
    			
    			JOptionPane.showMessageDialog(null, "Product # " + updNum.getText() + " updated succesfully.", 
    							"Product update", JOptionPane.INFORMATION_MESSAGE);
    			
    			frmUpd.setVisible(false);
    			
    		} catch (SQLException | HeadlessException ex) {
    			JOptionPane.showMessageDialog(null, ex);
    		}		
			Table();
		}
		
	}

}