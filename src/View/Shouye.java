/*
 * 首页.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import model.User;

/**
 *
 * @author  __USER__
 */
public class Shouye extends javax.swing.JFrame implements ActionListener,
		Runnable {

	/** Creates new form 首页 
	 * @param u */

	private static User u;

	public Shouye(User u) {
		this.setIconImage(new ImageIcon("D:/java程序实训/dodada/src/图/logo深蓝.jpg")
				.getImage());
		initComponents();
		//this.setVisible(true);
		this.setLocationRelativeTo(null);
		Thread t = new Thread(this);
		t.start();
		Shouye.u = u;
	}

	public void lunbo() {
		for (int i = 1; i <= 5; i++) {
			this.jButton7.setIcon(new ImageIcon("img/" + i + ".jpg"));

			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (i == 5)
				i = 0;
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("dodo\u6e38\u620f");

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/logo深蓝大标.jpg"))); // NOI18N

		jButton3.setBackground(new java.awt.Color(0, 153, 204));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u767b\u9646");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/广告1.jpg"))); // NOI18N

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/广告2.jpg"))); // NOI18N

		jButton7.setBackground(new java.awt.Color(255, 255, 255));
		jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/主1图.PNG"))); // NOI18N
		jButton7.setOpaque(false);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(0, 153, 204));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u5546\u5e97");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(0, 153, 204));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("\u8bba\u575b");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(0, 153, 204));
		jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton10.setForeground(new java.awt.Color(255, 255, 255));
		jButton10.setText("\u5bfc\u822a");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/logo深蓝.jpg"))); // NOI18N

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jLabel10.setForeground(new java.awt.Color(204, 204, 204));
		jLabel10
				.setText("\u5173\u4e8e\u672c\u7ad9 | \u8054\u7cfb\u672c\u7ad9 | \u62db\u8058\u4fe1\u606f | \u95ee\u9898\u53cd\u9988");

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel11.setForeground(new java.awt.Color(204, 204, 204));
		jLabel11
				.setText("\u5065\u5eb7\u6e38\u620f\u5fe0\u544a\uff1a\u62b5\u5236\u4e0d\u826f\u6e38\u620f\uff0c\u62d2\u7edd\u76d7\u7248\u6e38\u620f\uff0c\u6ce8\u610f\u81ea\u6211\u4fdd\u62a4\uff0c\u8c28\u9632\u4e0a\u5f53\u53d7\u9a97");

		jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/箭头左.jpg"))); // NOI18N

		jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/图/箭头右.jpg"))); // NOI18N

		jButton15.setBackground(new java.awt.Color(0, 153, 204));
		jButton15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton15.setForeground(new java.awt.Color(255, 255, 255));
		jButton15.setText("\u6392\u884c\u699c");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setBackground(new java.awt.Color(0, 153, 204));
		jButton16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton16.setForeground(new java.awt.Color(255, 255, 255));
		jButton16.setText("\u516c\u544a");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setBackground(new java.awt.Color(0, 153, 204));
		jButton17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton17.setForeground(new java.awt.Color(255, 255, 255));
		jButton17.setText("\u4e2a\u4eba\u4fe1\u606f");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
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
																				19,
																				19,
																				19)
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
																																jButton1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																408,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				350,
																																				350,
																																				350)
																																		.addComponent(
																																				jButton12,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				58,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				174,
																																				174,
																																				174)
																																		.addComponent(
																																				jButton13,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				58,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				271,
																																				271,
																																				271)
																																		.addComponent(
																																				jButton17))))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												197,
																												197,
																												197)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jButton7,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																596,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton8,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				130,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				38,
																																				38,
																																				38)
																																		.addComponent(
																																				jButton9,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				114,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jButton10,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				123,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				33,
																																				33,
																																				33)
																																		.addComponent(
																																				jButton15,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				114,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				34,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton16,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								114,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jButton3,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												169,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton5,
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												169,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																172,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				31,
																				31,
																				31)
																		.addComponent(
																				jButton11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				265,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								455,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel11))))
										.addGap(50, 50, 50)));
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
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				128,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				34,
																				34,
																				34)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton17)
																						.addComponent(
																								jButton3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								89,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				21,
																				21,
																				21)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton9,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												46,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
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
																																				jButton15,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				46,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jButton10,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				46,
																																				Short.MAX_VALUE))
																														.addGap(
																																50,
																																50,
																																50))
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jButton8,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																46,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				421,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton13,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton12,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								35,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				19,
																				19,
																				19)
																		.addComponent(
																				jButton16,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				46,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								525,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								528,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel10)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				37,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jButton11,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																107,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(42, 42, 42)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jPanel1,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		new 个人信息().setVisible(true);
		this.dispose();
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		new Announcement().setVisible(true);
		this.dispose();
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		new 导航(null).setVisible(true);
		this.dispose();
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton15) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new Gamepaihangbang();
		}
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		if (evt.getSource() == jButton9) {
			this.dispose();//点击按钮时frame1销毁,new一个frame2
			new 商店();
		}
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new 论坛(null).setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new Login(null).setVisible(true);
		this.dispose();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		Shouye Login = new Shouye(u);
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Shouye(u).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JPanel jPanel1;

	// End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		lunbo();
	}
}