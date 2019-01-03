/*
 * 注册.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.User;
import servers.Client;

/**
 *
 * @author  __USER__
 */
public class 注册 extends javax.swing.JFrame {

	/** Creates new form 注册 */
	private static User u;

	@SuppressWarnings("static-access")
	public 注册(User u) {
		initComponents();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.dispose();
		this.setIconImage(new ImageIcon("D:/java程序实训/dodada/src/图/logo深蓝.jpg")
				.getImage());
		this.u = u;

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jRadioButton1 = new javax.swing.JRadioButton();
		jButton2 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("dodo\u6e38\u620f");

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 39));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u6b22\u8fce\u52a0\u5165dodo\u6e38\u620f");

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField1.setForeground(new java.awt.Color(153, 153, 153));
		jTextField1.setText("\u8bf7\u8f93\u5165\u8d26\u53f7");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				Haode(evt);
			}
		});

		jPasswordField1.setFont(new java.awt.Font("宋体", 0, 24));
		jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
		jPasswordField1.setText("5200");
		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});
		jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				hidepw(evt);
			}
		});

		jRadioButton1.setBackground(new java.awt.Color(0, 102, 153));
		jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
		jRadioButton1
				.setText("\u5df2\u540c\u610f\u300adodo\u6e38\u620f\u6761\u6b3e\u300b");

		jButton2.setBackground(new java.awt.Color(0, 153, 204));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u6ce8\u518c");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField2.setForeground(new java.awt.Color(153, 153, 153));
		jTextField2.setText("\u8bf7\u8f93\u5165\u6635\u79f0");
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				Ok(evt);
			}
		});

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"用户", "管理员", "商家" }));

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 32));
		jLabel2.setText("\u6635\u79f0");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 32));
		jLabel3.setText("\u8d26\u53f7");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 32));
		jLabel4.setText("\u5bc6\u7801");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				169,
																				169,
																				169)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				359,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				52,
																				52,
																				52)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jRadioButton1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												257,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												176,
																												Short.MAX_VALUE)
																										.addComponent(
																												jComboBox1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel4)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel2))
																										.addGap(
																												18,
																												18,
																												18)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jPasswordField1)
																														.addComponent(
																																jTextField2,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																424,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																424,
																																Short.MAX_VALUE))))
																		.addGap(
																				38,
																				38,
																				38)))
										.addContainerGap(74, Short.MAX_VALUE))
						.addGroup(
								jPanel1Layout.createSequentialGroup().addGap(
										127, 127, 127).addComponent(jButton2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										433,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(113, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												79,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																67,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																67,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(26, 26, 26)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																67,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jRadioButton1)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												78,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(33, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void Ok(java.awt.event.FocusEvent evt) {
		this.jTextField2.setText("");
	}

	private void Haode(java.awt.event.FocusEvent evt) {
		this.jTextField1.setText("");

		//	this.jTextField2.;
	}

	private void hidepw(java.awt.event.FocusEvent evt) {
		this.jPasswordField1.setText("");
		//	this.jPasswordField1.setEchoChar('*');
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		String status = this.jComboBox1.getSelectedItem() + "";
		String name = this.jTextField2.getText();
		String pw = this.jPasswordField1.getText();
		String id = this.jTextField1.getText();

		try {
			Client c = new Client();
			User u = c.register(status, pw, id, name);
			if (u == null) {
				JOptionPane.showMessageDialog(this, "注册失败");
				new Login(u).setVisible(true);
			} else {

				JOptionPane.showMessageDialog(this, "注册成功");
				if (jComboBox1.getSelectedItem() == "管理员") {

					new Admin(u).setVisible(true);
					this.dispose();
				}
				if (jComboBox1.getSelectedItem() == "用户") {

					new Login(u).setVisible(true);
					this.dispose();
				}
				if (jComboBox1.getSelectedItem() == "商家") {

					new Guanli(u).setVisible(true);
					this.dispose();
				}
				this.dispose();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		注册 frame = new 注册(u);
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 注册(null).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}