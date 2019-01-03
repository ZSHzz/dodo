/*
 * Announcement.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Font;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import servers.Client;

import model.Gannouncement;
import model.User;

/**
 *
 * @author  __USER__
 */
public class Announcement extends javax.swing.JFrame {

	public Announcement() {
		initComponents();
		this.setVisible(true);

		this.setLocationRelativeTo(null);
		this.dispose();
		load();
		this.setIconImage(new ImageIcon("D:/java≥Ã–Ú µ—µ/dodada/src/Õº/logo…Ó¿∂.jpg")
				.getImage());

	}

	private void load() {
		try {
			Client c = new Client();
			String s = c.view();
			this.jTextArea1.setText(s);
			jTextArea1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 25));
			jTextArea1.setLineWrap(true);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel91 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jLabel91.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel91.setForeground(new java.awt.Color(255, 255, 255));
		jLabel91.setText("dodo\u6e38\u620f\u516c\u544a");

		jButton9.setBackground(new java.awt.Color(0, 153, 204));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("\u9996\u9875");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(0, 153, 204));
		jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton10.setForeground(new java.awt.Color(255, 255, 255));
		jButton10.setText("\u5237\u65b0");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

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
																				164,
																				164,
																				164)
																		.addComponent(
																				jLabel91)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				62,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				135,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				66,
																				66,
																				66)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				479,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				223,
																				223,
																				223)
																		.addComponent(
																				jButton10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				135,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				29,
																				29,
																				29)
																		.addComponent(
																				jLabel91)
																		.addGap(
																				11,
																				11,
																				11))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				53,
																				Short.MAX_VALUE)
																		.addGap(
																				18,
																				18,
																				18)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												353,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(21, 21, 21)
										.addComponent(
												jButton10,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												53, Short.MAX_VALUE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		load();
		
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shouye(null).setVisible(true);
		this.dispose();
	}

	public static void main(String args[]) {
		Announcement frame = new Announcement();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Announcement().setVisible(true);
			}
		});
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel91;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}