package br.com.tokio.ecommerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceCliente extends JFrame {
	
	public InterfaceCliente() {
		componentes();
		eventos();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// setUndecorated(true);
		setBounds(0, 0, 1000, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setIconImage(new ImageIcon("images//icon.png").getImage());
	}
	
	public void componentes() {
		
	}
	public void eventos() {
		
	}
}
