package br.com.tokio.ecommerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;

public class InterfaceCorretor extends JFrame {
public JButton close;
	
	//Painel principal de entrada
	private JPanel pnMain;
	private JButton btMainServices, btMyServices, btBuyServices, btHelpServices, btRelatorios;
	private JLabel lbImgUser, lbImgLogo;

	public InterfaceCorretor() {
		componentes();
		eventos();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setBounds(0, 0, 700, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setIconImage(new ImageIcon("images//icon.png").getImage());
	}

	public void componentes() {
		setLayout(null);
		
		pnMain = new JPanel();
		pnMain.setLayout(null);
		pnMain.setBackground(Color.decode("#007256"));
		pnMain.setBounds(0,0,175,600);
		pnMain.setVisible(true);
		
		lbImgUser= new JLabel(new ImageIcon("images//user-branco.png"));
		lbImgUser.setBounds(20,10,135,135);
		pnMain.add(lbImgUser);
		
		lbImgLogo = new JLabel(new ImageIcon("images//logo-tokio-marine-seguradora-branco.png"));
		lbImgLogo.setBounds(10,550,155,36);
		pnMain.add(lbImgLogo);
		
		btMainServices = new JButton("HOME");
		btMainServices.setBounds(0,204,175,40);
		btMainServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMainServices.setBackground(Color.decode("#007256"));
		btMainServices.setForeground(Color.WHITE);
		btMainServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMainServices);
		
		btMyServices = new JButton("Meus Clientes");
		btMyServices.setBounds(0,244,175,40);
		btMyServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMyServices.setBackground(Color.decode("#007256"));
		btMyServices.setForeground(Color.WHITE);
		btMyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMyServices);
		
		btBuyServices = new JButton("Ocorrências");
		btBuyServices.setBounds(0,284,175,40);
		btBuyServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btBuyServices.setBackground(Color.decode("#007256"));
		btBuyServices.setForeground(Color.WHITE);
		btBuyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btBuyServices);
		
		btHelpServices = new JButton("Finalizar Seguros");
		btHelpServices.setBounds(0,324,175,40);
		btHelpServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btHelpServices.setBackground(Color.decode("#007256"));
		btHelpServices.setForeground(Color.WHITE);
		btHelpServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btHelpServices);
		
		btRelatorios = new JButton("Relatórios");
		btRelatorios.setBounds(0,364,175,40);
		btRelatorios.setFont(new Font("Dialog", Font.PLAIN, 11));
		btRelatorios.setBackground(Color.decode("#007256"));
		btRelatorios.setForeground(Color.WHITE);
		btRelatorios.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btRelatorios);
		
		close = new JButton("Sair");
		close.setForeground(Color.WHITE);
		close.setBounds(0, 404, 175, 40);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.setFont(new Font("Dialog", Font.PLAIN, 11));
		close.setBackground(Color.decode("#007256"));
		pnMain.add(close);
		
		
		
		
		this.getContentPane().add(pnMain);
	}

	public void eventos() {
			//EVENTOS DE HOVER
			btMainServices.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	btMainServices.setBackground(Color.decode("#00574f"));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        btMainServices.setBackground(Color.decode("#007256"));
			    }
	
			});
			btMyServices.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	btMyServices.setBackground(Color.decode("#00574f"));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        btMyServices.setBackground(Color.decode("#007256"));
			    }
	
			   
			});
	
			btBuyServices.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	btBuyServices.setBackground(Color.decode("#00574f"));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        btBuyServices.setBackground(Color.decode("#007256"));
			    }

			   
			});
			btHelpServices.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	btHelpServices.setBackground(Color.decode("#00574f"));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        btHelpServices.setBackground(Color.decode("#007256"));
			    }

			});
			btRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	btRelatorios.setBackground(Color.decode("#00574f"));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        btRelatorios.setBackground(Color.decode("#007256"));
			    }

			});
			
	}
	public void close() {
		this.setVisible(false);
	}
}
