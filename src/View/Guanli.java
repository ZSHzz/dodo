/*
 * 管理.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.*;

import servers.Client;

/**
 *
 * @author  __USER__
 */
public class Guanli extends javax.swing.JFrame {

	/** Creates new form 管理 */
	private User u;

	public Guanli(User u) {
		this.setIconImage(new ImageIcon("D:/java程序实训/dodada/src/图/logo深蓝.jpg")
				.getImage());
		this.u = u;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//this.dispose();
		load();
		try {
			loadImg();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setTitle(u.getName());
	}

	private void loadImg() throws UnknownHostException, IOException {

		File f = new File("C:\\dodo\\" + u.getName() + ".jpg");

		if (!f.exists() || f.length() == 0) {
			Client c = new Client();
			f = new File("C:\\dodo\\" + u.getName() + ".jpg");
			c.loadFile(u.getName(), f);

		}
		if (f.exists() && f.length() != 0) {
			ImageIcon image = new ImageIcon(f.getAbsolutePath());
			// image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT));
			Image img = image.getImage();
			img = img.getScaledInstance(this.jButton7.getWidth(), this.jButton7
					.getHeight(), Image.SCALE_DEFAULT);
			image.setImage(img);

			this.jButton7.setIcon(image);
		}
	}

	private void load() {
		try {
			Client c = new Client();
			String s = c.view10();
			this.jTextArea1.setText(s);
			jTextArea1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
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

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jButton7 = new javax.swing.JButton();
		jTextField5 = new javax.swing.JTextField();
		jButton8 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton13 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u6dfb\u52a0\u6e38\u620f");

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField1.setForeground(new java.awt.Color(204, 204, 204));
		jTextField1.setText("dodo\u6e38\u620f");

		jButton1.setBackground(new java.awt.Color(0, 153, 204));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u9009\u62e9");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(0, 153, 204));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u4e0a\u4f20");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u5220\u9664\u6e38\u620f");

		jButton3.setBackground(new java.awt.Color(0, 153, 204));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u9009\u62e9");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField2.setForeground(new java.awt.Color(204, 204, 204));
		jTextField2.setText("\u67d0\u67d0\u6e38\u620f");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u8bbe\u7f6e\u6e38\u620f\u4ef7\u683c");

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField4.setForeground(new java.awt.Color(204, 204, 204));

		jButton5.setBackground(new java.awt.Color(0, 102, 153));
		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u6e38\u620f\u6392\u884c\u699c");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(0, 153, 255));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u786e\u8ba4\u4fee\u6539");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"炉石传说", "刀剑神域", "英雄联盟", "魔兽世界", "穿越火线", "极品飞车", "守望先锋" }));

		jButton11.setBackground(new java.awt.Color(0, 153, 204));
		jButton11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton11.setForeground(new java.awt.Color(255, 255, 255));
		jButton11.setText("\u9996\u9875");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setBackground(new java.awt.Color(0, 153, 204));
		jButton12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton12.setForeground(new java.awt.Color(255, 255, 255));
		jButton12.setText("\u5546\u5e97");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
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
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																105,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																105,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																178,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				125,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				100,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				364,
																				364,
																				364))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								330,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jButton3)
																						.addContainerGap(
																								209,
																								Short.MAX_VALUE))
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								142,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(
																								26,
																								26,
																								26)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jButton5)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																147,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton11,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																138,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGap(
																																23,
																																23,
																																23))
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jButton1)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addComponent(
																																jButton2)
																														.addContainerGap(
																																290,
																																Short.MAX_VALUE)))))))
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
																				41,
																				41,
																				41)
																		.addComponent(
																				jButton12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				138,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				269,
																				269,
																				269)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				228,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(331, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(16, 16, 16)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																52,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																54,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																52,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(100, 100, 100)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				94,
																				94,
																				94)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								32,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton3)))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				32,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton2)
																		.addComponent(
																				jButton1)))
										.addGap(70, 70, 70)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				46,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				47,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(51, 51, 51)
										.addComponent(
												jButton6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												64,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(57, 57, 57)));

		jTabbedPane1.addTab("\u5546\u5bb6\u6e38\u620f\u7ba1\u7406", jPanel1);

		jPanel2.setBackground(new java.awt.Color(0, 102, 153));

		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jTextField5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField5.setForeground(new java.awt.Color(204, 204, 204));
		jTextField5.setText("\u8bf7\u5199\u4e0b\u4f60\u7684\u8bc4\u8bba");
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});
		jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jTextField5FocusGained(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(0, 153, 204));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u786e\u8ba4\u53d1\u8868");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel16.setForeground(new java.awt.Color(204, 204, 204));
		jLabel16.setText("\u697c\u4e3b");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextArea1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTextArea1);

		jButton13.setBackground(new java.awt.Color(0, 153, 204));
		jButton13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton13.setForeground(new java.awt.Color(255, 255, 255));
		jButton13.setText("\u5237\u65b0");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(0, 153, 204));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("\u9996\u9875");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addContainerGap(
																				51,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel16)
																		.addGap(
																				68,
																				68,
																				68))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				25,
																				25,
																				25)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				151,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																469,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																469,
																Short.MAX_VALUE))
										.addGap(9, 9, 9)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																144,
																Short.MAX_VALUE)
														.addComponent(
																jButton13,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton9,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				58,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				25,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton8,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												58,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton13))))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				134,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				364,
																				Short.MAX_VALUE)
																		.addGap(
																				28,
																				28,
																				28))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel16)
																		.addContainerGap()))));

		jTabbedPane1.addTab("\u8bc4\u8bba\u7ba1\u7406", jPanel2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644,
				Short.MAX_VALUE));

		jTabbedPane1.getAccessibleContext().setAccessibleName(
				"\u6e38\u620f\u7ba1\u7406");

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shouye(u).setVisible(true);
		this.dispose();
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		load();
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		new 论坛(u).setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Gamepaihangbang().setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "未开发");
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "未开发");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		File f = jfc.getSelectedFile();
		if (!f.exists())
			JOptionPane.showMessageDialog(this, "img no exists");
		else if (!f.getAbsolutePath().endsWith(".jpg"))
			JOptionPane.showMessageDialog(this, "img format not allow");
		else {

			ImageIcon image = new ImageIcon(f.getAbsolutePath());
			image.setImage(image.getImage().getScaledInstance(WIDTH, HEIGHT,
					Image.SCALE_DEFAULT));
			Image img = image.getImage();
			img = img.getScaledInstance(this.jButton7.getWidth(), this.jButton7
					.getHeight(), Image.SCALE_DEFAULT);
			image.setImage(img);

			this.jButton7.setIcon(image);
		}

		Client c;
		try {
			c = new Client();
			c.uploadFile(u.getName(), f);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		File f = jfc.getSelectedFile();
		if (!f.exists())
			JOptionPane.showMessageDialog(this, "img no exists");
		else if (!f.getAbsolutePath().endsWith(".jpg"))
			JOptionPane.showMessageDialog(this, "img format not allow");
		else {

			ImageIcon image = new ImageIcon(f.getAbsolutePath());
			image.setImage(image.getImage().getScaledInstance(WIDTH, HEIGHT,
					Image.SCALE_DEFAULT));
			Image img = image.getImage();
			img = img.getScaledInstance(this.jButton7.getWidth(), this.jButton7
					.getHeight(), Image.SCALE_DEFAULT);
			image.setImage(img);

			this.jButton7.setIcon(image);
		}

		Client c;
		try {
			c = new Client();
			c.uploadFile(u.getName(), f);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {
		this.jTextField5.setText("");
	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		Client c;
		try {
			c = new Client();
			c.send1(u, this.jTextField5.getText());
			load();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JOptionPane.showMessageDialog(this, "发表成功");
		jTextArea1.setLineWrap(true);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

		try {
			Client c = new Client();
			Gameprice u = c.setprice(this.jTextField4.getText(),
					this.jComboBox1.getSelectedItem() + "");
			if (u == null)
				JOptionPane.showMessageDialog(this, "修改失败");
			else
				JOptionPane.showMessageDialog(this, "修改成功");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, e.getMessage());

		}
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}