package com.videoplayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame implements ActionListener{


    private JButton jb;
    public Test()
    {
        this.setSize(300, 200);
        this.setLocation(300, 400);
        jb=new JButton("��ת");
        this.add(jb);
        jb.addActionListener(this);//�����¼�����
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
           @SuppressWarnings("unused")
		Test Test=new Test();
           
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==jb)
        {
            this.dispose();//�����ťʱframe1����,newһ��frame2
            new test2();
        }
    }

}

