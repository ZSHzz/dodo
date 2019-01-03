/*
 * 支付.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.DataConnect;
import java.awt.BorderLayout;
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
public class 支付 extends javax.swing.JFrame {

	/** Creates new form 支付 */
	public 支付() {
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
				url = new URL("file:/D:/FFOutput/2（炉石传说）.avi");
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
		jLabel1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jButton6 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("dodo\u6e38\u620f");

		jPanel1.setBackground(new java.awt.Color(0, 102, 153));

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u7efc\u5408\u8bc4\u5206\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("8.9");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/炉石传说标.jpg"))); // NOI18N
		jButton1.setToolTipText("\u70b9\u51fb\u89c2\u770b\u89c6\u9891");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1
				.setText("\u300a\u7089\u77f3\u4f20\u8bf4\uff1a\u9b54\u517d\u82f1\u96c4\u4f20\u300b\u662f\u4e00\u6b3e\u7531\u66b4\u96ea\u5a31\u4e50\u5f00\u53d1\u7684\u96c6\u6362\u5f0f\u5361\u724c\u6e38\u620f\u3002");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6
				.setText("\u6e38\u620f\u80cc\u666f\u8bbe\u5b9a\u4e8e\u66b4\u96ea\u7684\u9b54\u517d\u7cfb\u5217\uff0c\u5171\u4e5d\u4f4d\u9b54\u517d\u4e2d\u7684\u89d2\u8272\u4f5c\u4e3a\u4e5d\u79cd\u4e0d\u540c\u7684\u804c\u4e1a\u3002");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7
				.setText("\u800c\u73a9\u5bb6\u8981\u505a\u7684\uff0c\u5c31\u662f\u6839\u636e\u81ea\u5df1\u73b0\u6709\u7684\u5361\u724c\u7ec4\u5efa\u5408\u9002\u7684\u5361\u7ec4\u3002");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8
				.setText("\u6307\u6325\u82f1\u96c4\uff0c\u9a71\u52a8\u968f\u4ece\uff0c\u65bd\u5c55\u6cd5\u672f\uff0c\u4e0e\u6e38\u620f\u597d\u53cb\u6216\u7d20\u4e0d\u76f8\u8bc6\u7684\u5bf9\u624b\u4e00\u51b3\u9ad8\u4e0b\u3002");

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("\u8d2d\u4e70");

		jButton3.setBackground(new java.awt.Color(0, 153, 204));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u786e\u5b9a\u652f\u4ed8  \uffe5100");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
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
																								javax.swing.GroupLayout.Alignment.LEADING)
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
																																jLabel7)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								jLabel8,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								698,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																																		.addGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addGap(
																																								104,
																																								104,
																																								104)
																																						.addComponent(
																																								jButton19,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								117,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jLabel3)
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																						.addComponent(
																																								jLabel4)
																																						.addGap(
																																								28,
																																								28,
																																								28)))
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				jLabel6)
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
																																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																																						.addGroup(
																																								jPanel1Layout
																																										.createSequentialGroup()
																																										.addGap(
																																												18,
																																												18,
																																												18)
																																										.addComponent(
																																												jButton7)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												jButton8))))))
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								359,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								672,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				193,
																				193,
																				193)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				428,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(78, Short.MAX_VALUE)));
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
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				70,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel3)
																		.addComponent(
																				jButton19))
														.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																213,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
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
																				60,
																				60,
																				60)
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
										.addGap(23, 23, 23)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(2, 2, 2)
										.addComponent(
												jLabel6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												34,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(29, 29, 29)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(59, 59, 59)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
		VideoPlayer sp = new VideoPlayer();
		sp.play();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		String sql1 = " DELETE  FROM  shoucang WHERE id =7";
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
		String sql = "insert into shoucang values('炉石传说','战略 ',7)";

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

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

		Desktop desktop = Desktop.getDesktop();
		URI uri = null;
		try {
			uri = new URI("http://hs.blizzard.cn/download/");
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
		支付 frame = new 支付();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new 支付().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	// End of variables declaration//GEN-END:variables

}