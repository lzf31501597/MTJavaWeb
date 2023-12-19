package com.itheima.servlet.demo.listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



/*
 * GUI小窗口演示监听器
 */
public class MyFrame extends Frame {

	public static void main(String[] args) {
		// 1.创建小窗口对象（被件听的对象）
		MyFrame myFrame = new MyFrame();
		// 社渚窗口名称
		myFrame.setName("小窗口");
		// 设置窗口的高度
		myFrame.setBounds(0, 0, 300, 200);
		//2.设置窗口显示
		myFrame.setVisible(true);

		//在事件源上绑定监听器
		myFrame.addWindowListener(new MywindowListener());
	}

}

/**
 * 监听对象
 */

class MywindowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		MyFrame myFrame = (MyFrame) e.getSource();
		System.out.println(myFrame.getName());
		System.out.println("窗口关闭了。。。");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
	
}
