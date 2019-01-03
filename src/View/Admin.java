/*
 * ����Ա.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import servers.Client;

import model.Game;
import model.Gannouncement;
import model.Paihangbang;
import model.User;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  __USER__
 */
public class Admin extends javax.swing.JFrame {

	/** Creates new form ����Ա */
	/** Creates new form ���� */
	private User u;

	public Admin(User u) {
		this.setIconImage(new ImageIcon("D:/java����ʵѵ/dodada/src/ͼ/logo����.jpg")
				.getImage());
		this.u = u;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//this.dispose();
		//load();
		//this.setTitle(g.getName());
		try {
			loadTable();
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
		try {
			loadTable1();
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

		try {
			loadTable2();
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

	private void loadTable() throws UnknownHostException, IOException,
			ClassNotFoundException {
		User u = new User();
		ArrayList<User> user = u.viewData1();
		jTable1.setRowHeight(35);
		jTable1.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		Object title[] = { "�û�id", "�û�����", "�û�����", "���" };
		Object detail[][] = new Object[user.size()][4];
		for (int i = 0; i < user.size(); i++) {
			detail[i][0] = user.get(i).getName();
			detail[i][1] = user.get(i).getPw();
			detail[i][2] = user.get(i).getId();
			detail[i][3] = user.get(i).getStatus();

		}
		this.jTable1.setModel(new DefaultTableModel(detail, title));

	}

	private void loadTable1() throws UnknownHostException, IOException,
			ClassNotFoundException {
		Game g = new Game();
		ArrayList<Game> game = g.viewData2();
		jTable3.setRowHeight(35);
		jTable3.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		Object title[] = { "��Ϸ����", "��Ϸ�۸�", "��Ϸ����" };
		Object detail[][] = new Object[game.size()][3];
		for (int i = 0; i < game.size(); i++) {
			detail[i][0] = game.get(i).getGname();
			detail[i][1] = game.get(i).getGtype();
			detail[i][2] = game.get(i).getGprice();

		}
		this.jTable3.setModel(new DefaultTableModel(detail, title));
	}

	private void loadTable2() throws UnknownHostException, IOException,
			ClassNotFoundException {
		User u = new User();
		ArrayList<User> user = u.viewData3();
		jTable2.setRowHeight(35);
		jTable2.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		Object title[] = { "�û�id", "�û�����", "�û�����", "���" };
		//Object length[]={};
		Object detail[][] = new Object[user.size()][4];
		for (int i = 0; i < user.size(); i++) {
			detail[i][0] = user.get(i).getName();
			detail[i][1] = user.get(i).getPw();
			detail[i][2] = user.get(i).getId();
			detail[i][3] = user.get(i).getStatus();

		}
		this.jTable2.setModel(new DefaultTableModel(detail, title));

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		�û� = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		�̼� = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton4 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		��Ϸ = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton6 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		���� = new javax.swing.JPanel();
		jLabel91 = new javax.swing.JLabel();
		jButton37 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jButton19 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		�û�.setBackground(new java.awt.Color(0, 102, 153));

		jButton1.setBackground(new java.awt.Color(0, 153, 204));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u5220\u9664");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(0, 153, 204));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u4fee\u6539");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout �û�Layout = new javax.swing.GroupLayout(�û�);
		�û�.setLayout(�û�Layout);
		�û�Layout
				.setHorizontalGroup(�û�Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								�û�Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												�û�Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																112,
																Short.MAX_VALUE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																112,
																Short.MAX_VALUE))
										.addContainerGap()));
		�û�Layout
				.setVerticalGroup(�û�Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 568,
								Short.MAX_VALUE)
						.addGroup(
								�û�Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton1)
										.addContainerGap(461, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7ba1\u7406\u7528\u6237", �û�);

		�̼�.setBackground(new java.awt.Color(0, 102, 153));

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jButton4.setBackground(new java.awt.Color(0, 153, 204));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u4fee\u6539");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton7.setBackground(new java.awt.Color(0, 153, 204));
		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u5220\u9664");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout �̼�Layout = new javax.swing.GroupLayout(�̼�);
		�̼�.setLayout(�̼�Layout);
		�̼�Layout
				.setHorizontalGroup(�̼�Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								�̼�Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												�̼�Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																�̼�Layout
																		.createSequentialGroup()
																		.addGap(
																				10,
																				10,
																				10)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				111,
																				Short.MAX_VALUE))
														.addGroup(
																�̼�Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				112,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		�̼�Layout
				.setVerticalGroup(�̼�Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								�̼�Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton7)
										.addContainerGap(461, Short.MAX_VALUE))
						.addComponent(jScrollPane2,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 568,
								Short.MAX_VALUE));

		jTabbedPane1.addTab("\u7ba1\u7406\u5546\u5bb6", �̼�);

		��Ϸ.setBackground(new java.awt.Color(0, 102, 153));

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(jTable3);

		jButton6.setBackground(new java.awt.Color(0, 153, 204));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u4fee\u6539");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(0, 153, 204));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u5220\u9664");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout ��ϷLayout = new javax.swing.GroupLayout(��Ϸ);
		��Ϸ.setLayout(��ϷLayout);
		��ϷLayout
				.setHorizontalGroup(��ϷLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								��ϷLayout
										.createSequentialGroup()
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												��ϷLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																112,
																Short.MAX_VALUE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																112,
																Short.MAX_VALUE))
										.addContainerGap()));
		��ϷLayout
				.setVerticalGroup(��ϷLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 568,
								Short.MAX_VALUE)
						.addGroup(
								��ϷLayout
										.createSequentialGroup()
										.addGap(14, 14, 14)
										.addComponent(jButton6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8)
										.addContainerGap(463, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7ba1\u7406\u6e38\u620f", ��Ϸ);

		����.setBackground(new java.awt.Color(0, 102, 153));

		jLabel91.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel91.setForeground(new java.awt.Color(255, 255, 255));
		jLabel91.setText("dodo\u6e38\u620f\u516c\u544a");

		jButton37.setBackground(new java.awt.Color(0, 153, 204));
		jButton37.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jButton37.setForeground(new java.awt.Color(255, 255, 255));
		jButton37.setText("\u786e\u8ba4\u53d1\u5e03");
		jButton37.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton37ActionPerformed(evt);
			}
		});

		jButton19.setBackground(new java.awt.Color(0, 153, 204));
		jButton19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton19.setForeground(new java.awt.Color(255, 255, 255));
		jButton19.setText("\u9996\u9875");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout ����Layout = new javax.swing.GroupLayout(����);
		����.setLayout(����Layout);
		����Layout
				.setHorizontalGroup(����Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								����Layout
										.createSequentialGroup()
										.addGroup(
												����Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																����Layout
																		.createSequentialGroup()
																		.addGap(
																				160,
																				160,
																				160)
																		.addComponent(
																				jLabel91)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				70,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton19,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				107,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																����Layout
																		.createSequentialGroup()
																		.addGap(
																				44,
																				44,
																				44)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				483,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																����Layout
																		.createSequentialGroup()
																		.addGap(
																				170,
																				170,
																				170)
																		.addComponent(
																				jButton37,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				236,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		����Layout
				.setVerticalGroup(����Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								����Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												����Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel91)
														.addComponent(
																jButton19,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(25, 25, 25)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												350,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jButton37,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(46, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u516c\u544a\u7ba1\u7406", ����);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new Deletedata().setVisible(true);
		this.dispose();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		new Deletedata().setVisible(true);
		this.dispose();
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shouye(u).setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "δ�������");
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "δ�������");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "δ�������");
	}

	private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
		Client c;
		try {
			c = new Client();
			c.send(u, this.jTextField2.getText());

			//	load();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(this, "�����ɹ�");
		new Announcement().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Deletedata().setVisible(true);
		this.dispose();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton37;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel91;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JPanel ����;
	private javax.swing.JPanel �̼�;
	private javax.swing.JPanel ��Ϸ;
	private javax.swing.JPanel �û�;
	// End of variables declaration//GEN-END:variables

}