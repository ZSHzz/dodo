/*
 * 论坛.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Font;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import servers.Client;

import model.User;

/**
 *
 * @author  __USER__
 */
public class 论坛 extends javax.swing.JFrame {
	private static User u;

	/** Creates new form 论坛 */
	public 论坛(User u) {
		this.setIconImage(new ImageIcon("D:/java程序实训/dodada/src/图/logo深蓝.jpg")
				.getImage());
		initComponents();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.dispose();
		论坛.u = u;
		load();
		load1();
		load2();
		load3();
		load4();
		load5();
		load6();
	}

	private void load() {
		try {
			Client c = new Client();
			String s = c.view5();
			this.jTextField1.setText(s);

			jTextField1.setFont(new Font("微软雅黑", Font.PLAIN, 25));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load1() {
		try {
			Client c = new Client();
			String s = c.view9();
			this.jTextField4.setText(s);

			jTextField4.setFont(new Font("微软雅黑", Font.PLAIN, 25));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load2() {
		try {
			Client c = new Client();
			String s = c.view8();
			this.jTextField5.setText(s);

			jTextField5.setFont(new Font("微软雅黑", Font.PLAIN, 25));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load3() {
		try {
			Client c = new Client();
			String s = c.view7();
			this.jTextField2.setText(s);

			jTextField2.setFont(new Font("微软雅黑", Font.PLAIN, 25));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load4() {
		try {
			Client c = new Client();
			String s = c.view6();
			this.jTextField6.setText(s);

			jTextField6.setFont(new Font("微软雅黑", Font.PLAIN, 25));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load5() {
		try {
			Client c = new Client();
			String s = c.view4();
			this.jTextField7.setText(s);

			jTextField7.setFont(new Font("微软雅黑", Font.PLAIN, 25));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void load6() {
		try {
			Client c = new Client();
			String s = c.view3();
			this.jTextField3.setText(s);

			jTextField3.setFont(new Font("微软雅黑", Font.PLAIN, 25));

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
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jButton10 = new javax.swing.JButton();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jButton19 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u5546\u5e97 shop");

		jButton1.setBackground(new java.awt.Color(0, 153, 204));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u767b\u9646");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u7cbe\u9009");

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/英雄联盟.jpg"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/魔兽世界.jpg"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/炉石传说.jpg"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Win. iOS  6GB");

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/穿越火线.jpg"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(255, 255, 255));
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/守望先锋.png"))); // NOI18N
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Win.  2GB");

		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("Win. 1GB");

		jButton7.setBackground(new java.awt.Color(255, 255, 255));
		jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/极品飞车.png"))); // NOI18N
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/logo深蓝.jpg"))); // NOI18N

		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("Win.  1GB");

		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText(" Win.  1GB");

		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Win. iOS  1GB");

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel10.setForeground(new java.awt.Color(204, 204, 204));
		jLabel10
				.setText("\u5173\u4e8e\u672c\u7ad9 | \u8054\u7cfb\u672c\u7ad9 | \u62db\u8058\u4fe1\u606f | \u95ee\u9898\u53cd\u9988");

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel11.setForeground(new java.awt.Color(204, 204, 204));
		jLabel11
				.setText("\u5065\u5eb7\u6e38\u620f\u5fe0\u544a\uff1a\u62b5\u5236\u4e0d\u826f\u6e38\u620f\uff0c\u62d2\u7edd\u76d7\u7248\u6e38\u620f\uff0c\u6ce8\u610f\u81ea\u6211\u4fdd\u62a4\uff0c\u8c28\u9632\u4e0a\u5f53\u53d7\u9a97");

		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/刀剑神域.jpg"))); // NOI18N
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText(" Win. iOS");

		jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("\u82f1\u96c4\u8054\u76df");

		jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel14.setForeground(new java.awt.Color(255, 255, 255));
		jLabel14.setText("\u9b54\u517d\u4e16\u754c");

		jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel15.setForeground(new java.awt.Color(255, 255, 255));
		jLabel15.setText("\u7089\u77f3\u4f20\u8bf4");

		jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel16.setForeground(new java.awt.Color(255, 255, 255));
		jLabel16.setText("\u7a7f\u8d8a\u706b\u7ebf");

		jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel17.setForeground(new java.awt.Color(255, 255, 255));
		jLabel17.setText("\u5b88\u671b\u5148\u950b");

		jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel18.setForeground(new java.awt.Color(255, 255, 255));
		jLabel18.setText("\u6781\u54c1\u98de\u8f66");

		jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel19.setForeground(new java.awt.Color(255, 255, 255));
		jLabel19.setText("\u5200\u5251\u795e\u57df");

		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/地下城勇士.jpg"))); // NOI18N
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jLabel20.setForeground(new java.awt.Color(255, 255, 255));
		jLabel20.setText("\uffe520                            Win. iOS");

		jLabel21.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel21.setForeground(new java.awt.Color(255, 255, 255));
		jLabel21.setText("\u5730\u4e0b\u57ce\u52c7\u58eb");

		jButton19.setBackground(new java.awt.Color(0, 153, 204));
		jButton19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton19.setForeground(new java.awt.Color(255, 255, 255));
		jButton19.setText("\u9996\u9875");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
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
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				82,
																				82,
																				82)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				265,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jLabel11)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												373,
																												373,
																												373)
																										.addComponent(
																												jButton1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												119,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton19,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												118,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												27,
																												27,
																												27))
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								590,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				69,
																				69,
																				69)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel16,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				85,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								false)
																																						.addGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								jPanel1Layout
																																										.createSequentialGroup()
																																										.addGroup(
																																												jPanel1Layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addComponent(
																																																jLabel13,
																																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																																85,
																																																javax.swing.GroupLayout.PREFERRED_SIZE)
																																														.addGroup(
																																																jPanel1Layout
																																																		.createSequentialGroup()
																																																		.addPreferredGap(
																																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																		.addComponent(
																																																				jTextField1,
																																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																																				119,
																																																				Short.MAX_VALUE)))
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												jLabel3))
																																						.addComponent(
																																								jButton5,
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								0,
																																								0,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jButton2,
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								223,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jLabel2,
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								70,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addGap(
																																104,
																																104,
																																104))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jTextField5,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																117,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel6)
																														.addGap(
																																113,
																																113,
																																113)))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												10,
																												10,
																												10)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jButton9,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																223,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jTextField2,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				111,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				39,
																																				39,
																																				39)
																																		.addComponent(
																																				jLabel12))
																														.addComponent(
																																jLabel19,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																85,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGap(
																												104,
																												104,
																												104)))
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel17,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								85,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jButton10,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												215,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel21,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																114,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel20)))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												jPanel1Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				false)
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jTextField4)
																																						.addGap(
																																								18,
																																								18,
																																								18)
																																						.addComponent(
																																								jLabel7))
																																		.addComponent(
																																				jButton6,
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				223,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jTextField3)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jLabel8))
																																		.addComponent(
																																				jButton7,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				223,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addComponent(
																																				jLabel18,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				85,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												jPanel1Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				false)
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addGroup(
																																								jPanel1Layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																										.addComponent(
																																												jLabel14,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												85,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addComponent(
																																												jTextField7,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												131,
																																												javax.swing.GroupLayout.PREFERRED_SIZE))
																																						.addGap(
																																								27,
																																								27,
																																								27)
																																						.addComponent(
																																								jLabel5))
																																		.addComponent(
																																				jButton3,
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				223,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGap(
																																127,
																																127,
																																127)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel15,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				85,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addComponent(
																																								jButton4,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								223,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								jPanel1Layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jTextField6,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												121,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												Short.MAX_VALUE)
																																										.addComponent(
																																												jLabel4)))))))
																		.addGap(
																				32,
																				32,
																				32))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap(
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel1)
																		.addGap(
																				732,
																				732,
																				732)))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																87,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton19,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				78,
																				Short.MAX_VALUE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(9, 9, 9)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																36,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel13))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												37,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel14))
																						.addComponent(
																								jLabel5))
																		.addGap(
																				13,
																				13,
																				13)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
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
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(
																																				jLabel6)
																																		.addComponent(
																																				jTextField5,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				35,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addComponent(
																																jTextField4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																35,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel17)
																														.addComponent(
																																jLabel16)))
																						.addComponent(
																								jLabel7))
																		.addGap(
																				52,
																				52,
																				52)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jButton10,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																jLabel12)
																														.addComponent(
																																jLabel20,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																29,
																																Short.MAX_VALUE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel21)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												34,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												1,
																												1,
																												1)
																										.addComponent(
																												jLabel19))))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				121,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jTextField6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								37,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				6,
																				6,
																				6)
																		.addComponent(
																				jLabel15)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				121,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel18)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																107,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				39,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				2,
																				2,
																				2)
																		.addComponent(
																				jLabel11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				39,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				7,
																				7,
																				7)))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shouye(null).setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		new Login(null).setVisible(true);
		this.dispose();
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "未开发");
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton9) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 支付1();
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton7) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 支付5();
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton6) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2

			try {
				new 支付6(u);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton5) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 支付4();
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton4) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 支付();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton2) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 支付2();
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton3) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 支付3();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		论坛 frame = new 论坛(u);
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 论坛(u).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	// End of variables declaration//GEN-END:variables

}