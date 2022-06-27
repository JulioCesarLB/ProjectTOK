package br.com.tokio.ecommerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceCorretor extends JFrame {
	public JButton close;
	public InterfaceCorretor() {
		componentes();
		eventos();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setFocusableWindowState(true);
		this.setUndecorated(true);
		this.setBounds(0, 0, 1000, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setIconImage(new ImageIcon("images//icon.png").getImage());
	}
	
	public void componentes() {
		setLayout(null);
		close = new JButton("close");
		close.setBounds(100,100,100,100);
		add(close);
	}
	public void eventos() {
	}
	public void close() {
		
		this.setVisible(false);
	}
}
