/*
 * 管理员.java
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

	/** Creates new form 管理员 */
	/** Creates new form 管理 */
	private User u;

	public Admin(User u) {
		this.setIconImage(new ImageIcon("D:/java程序实训/dodada/src/图/logo深蓝.jpg")
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
		jTable1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		Object title[] = { "用户id", "用户密码", "用户名称", "身份" };
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
		jTable3.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		Object title[] = { "游戏名称", "游戏价格", "游戏类型" };
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
		jTable2.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		Object title[] = { "用户id", "用户密码", "用户名称", "身份" };
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
		用户 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		商家 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton4 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		游戏 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton6 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		公告 = new javax.swing.JPanel();
		jLabel91 = new javax.swing.JLabel();
		jButton37 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jButton19 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		用户.setBackground(new java.awt.Color(0, 102, 153));

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

		javax.swing.GroupLayout 用户Layout = new javax.swing.GroupLayout(用户);
		用户.setLayout(用户Layout);
		用户Layout
				.setHorizontalGroup(用户Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								用户Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												用户Layout
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
		用户Layout
				.setVerticalGroup(用户Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 568,
								Short.MAX_VALUE)
						.addGroup(
								用户Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jButton3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton1)
										.addContainerGap(461, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7ba1\u7406\u7528\u6237", 用户);

		商家.setBackground(new java.awt.Color(0, 102, 153));

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

		javax.swing.GroupLayout 商家Layout = new javax.swing.GroupLayout(商家);
		商家.setLayout(商家Layout);
		商家Layout
				.setHorizontalGroup(商家Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								商家Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												商家Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																商家Layout
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
																商家Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				112,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		商家Layout
				.setVerticalGroup(商家Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								商家Layout
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

		jTabbedPane1.addTab("\u7ba1\u7406\u5546\u5bb6", 商家);

		游戏.setBackground(new java.awt.Color(0, 102, 153));

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

		javax.swing.GroupLayout 游戏Layout = new javax.swing.GroupLayout(游戏);
		游戏.setLayout(游戏Layout);
		游戏Layout
				.setHorizontalGroup(游戏Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								游戏Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												游戏Layout
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
		游戏Layout
				.setVerticalGroup(游戏Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 568,
								Short.MAX_VALUE)
						.addGroup(
								游戏Layout
										.createSequentialGroup()
										.addGap(14, 14, 14)
										.addComponent(jButton6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8)
										.addContainerGap(463, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7ba1\u7406\u6e38\u620f", 游戏);

		公告.setBackground(new java.awt.Color(0, 102, 153));

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

		javax.swing.GroupLayout 公告Layout = new javax.swing.GroupLayout(公告);
		公告.setLayout(公告Layout);
		公告Layout
				.setHorizontalGroup(公告Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								公告Layout
										.createSequentialGroup()
										.addGroup(
												公告Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																公告Layout
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
																公告Layout
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
																公告Layout
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
		公告Layout
				.setVerticalGroup(公告Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								公告Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												公告Layout
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

		jTabbedPane1.addTab("\u516c\u544a\u7ba1\u7406", 公告);

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
		JOptionPane.showMessageDialog(this, "未开发完毕");
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "未开发完毕");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "未开发完毕");
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
		JOptionPane.showMessageDialog(this, "发布成功");
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
	private javax.swing.JPanel 公告;
	private javax.swing.JPanel 商家;
	private javax.swing.JPanel 游戏;
	private javax.swing.JPanel 用户;
	// End of variables declaration//GEN-END:variables

}