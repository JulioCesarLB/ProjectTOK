package br.com.tokio.ecommerce;

import javax.swing.*;
import java.lang.reflect.Method;
import java.awt.*;
import java.awt.event.*;

public class InterfaceCliente extends JFrame {
	public JButton close;
	
	//Painel principal de entrada
	private JPanel pnMain;
	private JButton btMainServices, btMyServices, btBuyServices, btHelpServices, btSeeSite;

	public InterfaceCliente() {
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
		close = new JButton("X");
		close.setForeground(Color.WHITE);
		close.setBounds(645, 11, 45, 23);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.setBackground(Color.decode("#007256"));
		
		pnMain = new JPanel();
		pnMain.setLayout(null);
		pnMain.setBackground(Color.decode("#007256"));
		pnMain.setBounds(0,0,175,600);
		pnMain.setVisible(true);
		
		btMainServices = new JButton("HOME");
		btMainServices.setBounds(0,204,175,40);
		btMainServices.setFont(new Font("Dialog", Font.PLAIN, 9));
		btMainServices.setBackground(Color.decode("#007256"));
		btMainServices.setForeground(Color.WHITE);
		btMainServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMainServices);
		
		btMyServices = new JButton("Meus Seguros");
		btMyServices.setBounds(0,244,175,40);
		btMyServices.setFont(new Font("Dialog", Font.PLAIN, 9));
		btMyServices.setBackground(Color.decode("#007256"));
		btMyServices.setForeground(Color.WHITE);
		btMyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMyServices);
		
		btBuyServices = new JButton("Novo Seguro");
		btBuyServices.setBounds(0,284,175,40);
		btBuyServices.setFont(new Font("Dialog", Font.PLAIN, 9));
		btBuyServices.setBackground(Color.decode("#007256"));
		btBuyServices.setForeground(Color.WHITE);
		btBuyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btBuyServices);
		
		btHelpServices = new JButton("Ajuda");
		btHelpServices.setBounds(0,324,175,40);
		btHelpServices.setFont(new Font("Dialog", Font.PLAIN, 9));
		btHelpServices.setBackground(Color.decode("#007256"));
		btHelpServices.setForeground(Color.WHITE);
		btHelpServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btHelpServices);
		
		btSeeSite = new JButton("Visite o site");
		btSeeSite.setBounds(0,364,175,40);
		btSeeSite.setFont(new Font("Dialog", Font.PLAIN, 9));
		btSeeSite.setBackground(Color.decode("#007256"));
		btSeeSite.setForeground(Color.WHITE);
		btSeeSite.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btSeeSite);
		
		
		
		
		getContentPane().add(close);
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
			btSeeSite.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	btSeeSite.setBackground(Color.decode("#00574f"));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        btSeeSite.setBackground(Color.decode("#007256"));
			    }

			});
			//FIM EVENTOS DE HOVER
			
			// EVENTOS DE AÇÃO
			btSeeSite.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent argse) {
					openURL("https://www.tokiomarine.com.br/");

				}
			});
			
	}
	   	private String errMsg = "Erro ao tentar abrir o browser";
	    public void openURL(String url) {
	        String osName = System.getProperty("os.name");
	        String browser = null;
	        try {
	            if (osName.startsWith("Mac OS")) {
	                Class fileMgr = Class.forName("com.apple.eio.FileManager");
	                Method openURL = fileMgr.getDeclaredMethod("openURL",
	                        new Class[]{String.class});
	                openURL.invoke(null, new Object[]{url});
	            } else if (osName.startsWith("Windows")) {
	                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
	            } else { //assume Unix or Linux   
	                String[] browsers = {
	                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"
	                };
	                for (int count = 0; count < browsers.length && browser == null; count++) {
	                    if (Runtime.getRuntime().exec(
	                            new String[]{"which", browsers[count]}).waitFor() == 0) {
	                        browser = browsers[count];
	                    }
	                }
	                JOptionPane.showMessageDialog(null,browser);
	                if (browser == null) {
	                    JOptionPane.showMessageDialog(null,"Navegador não encontrado!");
	                } else {
	                    Runtime.getRuntime().exec(new String[]{browser,url});
	                }
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, errMsg + ":\n" + e.getLocalizedMessage());
	        }
	    }

	public void close() {

		this.setVisible(false);
	}
}
