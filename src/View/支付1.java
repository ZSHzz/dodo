/*
 * 支付1.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.DataConnect;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.media.CannotRealizeException;
import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.PrefetchCompleteEvent;
import javax.media.RealizeCompleteEvent;
import javax.media.Time;

import com.videoplayer.VideoPlayer;

/**
 *
 * @author  __USER__
 */
public class 支付1 extends javax.swing.JFrame {

	/** Creates new form 支付1 */
	public 支付1() {
		initComponents();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("D:/java程序实训/dodada/src/图/logo深蓝.jpg")
				.getImage());
	}

	@SuppressWarnings( { "unused" })
	public static class VideoPlayer implements ControllerListener {

		private Player mediaPlayer;
		private Frame f;
		private Player player;
		private Panel panel;
		private Component visual;
		private Component control = null;

		public void play() {
			f = new Frame("JMF Sample1");

			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					if (player != null) {
						player.close();
					}
					System.exit(0);
				}
			});
			f.setSize(500, 400);

			f.setVisible(true);
			URL url = null;
			try {
				//准备一个要播放的视频文件的URL
				url = new URL("file:/D:/FFOutput/7（不知是啥）.avi");
			} catch (MalformedURLException e) {
				e.printStackTrace();

			}
			try {
				//通过调用Manager的createPlayer方法来创建一个Player的对象
				//这个对象是媒体播放的核心控制对象
				player = Manager.createPlayer(url);
			} catch (NoPlayerException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			//对player对象注册监听器，能噶偶在相关事件发生的时候执行相关的动作
			player.addControllerListener(this);

			//让player对象进行相关的资源分配
			player.realize();
		}

		private int videoWidth = 0;
		private int videoHeight = 0;
		private int controlHeight = 30;
		private int insetWidth = 10;
		private int insetHeight = 30;

		//监听player的相关事件
		public void controllerUpdate(ControllerEvent ce) {
			if (ce instanceof RealizeCompleteEvent) {
				//player实例化完成后进行player播放前预处理
				player.prefetch();
			} else if (ce instanceof PrefetchCompleteEvent) {
				if (visual != null)
					return;

				//取得player中的播放视频的组件，并得到视频窗口的大小
				//然后把视频窗口的组件添加到Frame窗口中，
				if ((visual = player.getVisualComponent()) != null) {
					Dimension size = visual.getPreferredSize();
					videoWidth = size.width;
					videoHeight = size.height;
					f.add(visual);
				} else {
					videoWidth = 320;
				}

				//取得player中的视频播放控制条组件，并把该组件添加到Frame窗口中
				if ((control = player.getControlPanelComponent()) != null) {
					controlHeight = control.getPreferredSize().height;
					f.add(control, BorderLayout.SOUTH);
				}

				//设定Frame窗口的大小，使得满足视频文件的默认大小
				f.setSize(videoWidth + insetWidth, videoHeight + controlHeight
						+ insetHeight);
				f.validate();

				//启动视频播放组件开始播放
				player.start();
				mediaPlayer.start();

			} else if (ce instanceof EndOfMediaEvent) {
				//当播放视频完成后，把时间进度条恢复到开始，并再次重新开始播放
				player.setMediaTime(new Time(0));
				player.start();
			}
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton4 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u7efc\u5408\u8bc4\u5206\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("8.8");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/刀剑神域标.png"))); // NOI18N
		jButton1.setToolTipText("\u70b9\u51fb\u89c2\u770b\u89c6\u9891");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(0, 153, 204));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u786e\u5b9a\u652f\u4ed8  \uffe5100");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("\u8d2d\u4e70");

		jTextArea1.setBackground(new java.awt.Color(0, 102, 153));
		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 20));
		jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
		jTextArea1.setRows(5);
		jTextArea1
				.setText("\u300a\u5200\u5251\u795e\u57df\uff1a\u65e0\u9650\u65f6\u523b\u300b\uff08\u53c8\u540d\u300a\u5200\u5251\u795e\u57df\uff1a\u65e0\u9650\u77ac\u95f4\u300b\uff09\u662f\u7531NBGI\u5f00\u53d1\u7684\u4e00\n\u6b3e\u89d2\u8272\u626e\u6f14\u7c7bPSP\u6e38\u620f\u4f5c\u54c1\uff0c\u4e8e2013\u5e743\u670814\u65e5\u53d1\u884c\u3002\u4e3a\u300a\u5200\u5251\u795e\u57df\u300b\u7684\u6e38\u620f\u5316\n\u4f5c\u54c1\u3002\u6e38\u620f\u5185\u5bb9\u662f\u6253\u8d25\u4e8675\u5c42\u7684Boss\u2014\u5e0c\u65af\u514b\u5229\u592b\u540e\u5e76\u6ca1\u6709\u56de\u5230\u73b0\u5b9e\u4e16\u754c\u4ee5\u5f00\n\u59cb\u5c55\u5f00\u7684\u3002\u6e38\u620f\u4e2d\u53ef\u968f\u65f6\u53d8\u6362\u89c6\u89d2\uff0c\u591a\u65b9\u9762\u591a\u89d2\u5ea6\uff0c\u4eab\u53d7\u4e0d\u4e00\u6837\u7684\u89c6\u89c9\u3002\u5728\u6e38\n\u620f\u4e2d\uff0c\u4f19\u4f34AI\u4f1a\u4e3a\u4e86\u6850\u4eba\u4e00\u8d77\u63d0\u9ad8\u3002\u672c\u4f5c\u4ee5\u73a9\u5bb6\u626e\u6f14\u7684\u6850\u4eba\u548c\u4f19\u4f34AI\u7ec4\u961f\u5192\u9669\n\u4e3a\u57fa\u7840\u3002\u539f\u4f5c\u89d2\u8272\u4e5f\u5c06\u6210\u4e3aNPC\uff0c\u53ef\u4ee5\u9009\u62e9\u7684\u4f19\u4f34\u6709\u7740\u5404\u5f0f\u5404\u6837\u7684\u7279\u70b9\u3002AI\u5728\n\u5bf9\u8bdd\u548c\u6218\u6597\u65f6\u7684\u5e94\u5bf9\u90fd\u4f1a\u8ddf\u968f\u73a9\u5bb6\u4e0d\u65ad\u6210\u957f\u3002");
		jScrollPane1.setViewportView(jTextArea1);

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton4.setText("\u6e23\u4f5c");
		jButton4.setBorder(null);
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton4MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton4MouseExited(evt);
			}
		});
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 60,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 65,
				Short.MAX_VALUE));

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 71,
				Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 65,
				Short.MAX_VALUE));

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton5.setText("\u4e00\u822c");
		jButton5.setBorder(null);
		jButton5.setBorderPainted(false);
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton5MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton5MouseExited(evt);
			}
		});
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(255, 255, 255));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton6.setText("\u795e\u4f5c");
		jButton6.setBorder(null);
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton6MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton6MouseExited(evt);
			}
		});
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 62,
				Short.MAX_VALUE));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 64,
				Short.MAX_VALUE));

		jButton7.setText("\u6536\u85cf\u6e38\u620f");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setText("\u53d6\u6d88\u6536\u85cf");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
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
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				111,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				31,
																				31,
																				31)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jScrollPane1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								696,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
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
																																359,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				105,
																																				105,
																																				105)
																																		.addComponent(
																																				jButton19,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				117,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGap(
																												80,
																												80,
																												80)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton7)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jButton8))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel3)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel4))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								false)
																																						.addComponent(
																																								jPanel3,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jButton4,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								60,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton5,
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								71,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jPanel4,
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addComponent(
																																								jPanel5,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jButton6,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								62,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))))))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				162,
																				162,
																				162)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				428,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(74, Short.MAX_VALUE)));
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
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																70,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(jLabel3)
														.addComponent(jButton19))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				3,
																				3,
																				3)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				213,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				9,
																				9,
																				9)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton8,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								46,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								46,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				54,
																				54,
																				54)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jPanel5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												jPanel4,
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jPanel3,
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton6)
																						.addComponent(
																								jButton4)
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								33,
																								Short.MAX_VALUE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												247, Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(77, 77, 77)));

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

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shouye(null).setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		VideoPlayer sp = new VideoPlayer();
		sp.play();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		String sql1 = " DELETE  FROM  shoucang WHERE id =6";
		try {
			DataConnect.getStat().executeUpdate(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String sql = "insert into shoucang values('刀剑神域','战略 ',6)";

		JOptionPane.showMessageDialog(this, "收藏成功");
		try {
			DataConnect.getStat().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton6MouseExited(java.awt.event.MouseEvent evt) {
		this.jPanel5.setBackground(Color.white);
		boolean equals = jPanel5.getX() == jPanel3.getX();
		if (equals) {

			this.jPanel3.setBackground(Color.white);
			this.jPanel4.setBackground(Color.white);

		} else {
			this.jPanel3.setBackground(Color.white);
			this.jPanel4.setBackground(Color.white);

		}
	}

	private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {
		this.jPanel5.setBackground(Color.red);
		boolean equals = jPanel5.getX() == jPanel3.getX();
		if (equals) {

			this.jPanel3.setBackground(Color.white);
			this.jPanel4.setBackground(Color.white);

		} else {
			this.jPanel3.setBackground(Color.red);
			this.jPanel4.setBackground(Color.red);

		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton5MouseExited(java.awt.event.MouseEvent evt) {
		this.jPanel4.setBackground(Color.white);
		boolean equals = jPanel5.getX() == jPanel3.getX();
		if (equals) {

			this.jPanel3.setBackground(Color.white);
			this.jPanel4.setBackground(Color.white);

		} else {
			this.jPanel3.setBackground(Color.white);
			this.jPanel4.setBackground(Color.white);

		}
	}

	private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {
		this.jPanel4.setBackground(Color.red);
		boolean equals = jPanel4.getX() == jPanel3.getX();
		if (equals) {

			this.jPanel3.setBackground(Color.white);
			this.jPanel4.setBackground(Color.white);

		} else {
			this.jPanel3.setBackground(Color.red);
			this.jPanel4.setBackground(Color.red);

		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton4MouseExited(java.awt.event.MouseEvent evt) {
		this.jPanel3.setBackground(Color.white);
	}

	private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {
		this.jPanel3.setBackground(Color.red);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Desktop desktop = Desktop.getDesktop();
		URI uri = null;
		try {
			uri = new URI("http://www.ali213.net/zt/saohr/down/");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			desktop.browse(uri);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		支付1 frame = new 支付1();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 支付1().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}