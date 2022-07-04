package br.com.tokio.ecommerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;

public class InterfaceCorretor extends JFrame {
	public JButton close;

	// Painel Lateral
	private JPanel pnMain;
	private JButton btMainServices, btMyServices, btBuyServices, btHelpServices, btRelatorios;
	private JLabel lbImgUser, lbImgLogo, lbNameCorretor;
	
	// Painel cancelar serviços
	private JPanel pnCancel;
	private JLabel lbCancelTitle,lbCancelTitleDados, lbCancelApolice, lbCancelName, lbCancelEndereco, lbCancelRural, lbCancelPortaria, lbCancelAlvenaria;
	private JTextField txCancelApolice, txCancelNome, txCancelEndereco, txCancelRural, txCancelPortaria, txCancelAlvenaria;
	private ButtonGroup gpCancel;
	private JRadioButton rbCancelImobiliario, rbCancelResidencial, rbCancelFianca;
	private JButton btCancelarApolice;

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
		getContentPane().setLayout(null);

		pnMain = new JPanel();
		pnMain.setLayout(null);
		pnMain.setBackground(Color.decode("#007256"));
		pnMain.setBounds(0, 0, 175, 600);
		pnMain.setVisible(true);

		lbImgUser = new JLabel(new ImageIcon("images//user-branco.png"));
		lbImgUser.setBounds(20, 10, 135, 135);
		pnMain.add(lbImgUser);

		lbImgLogo = new JLabel(new ImageIcon("images//logo-tokio-marine-seguradora-branco.png"));
		lbImgLogo.setBounds(10, 550, 155, 36);
		pnMain.add(lbImgLogo);

		lbNameCorretor = new JLabel("<html><body><center>Julio Cesar Lopes Batista</body></html>"); // Colocar nome do corretor
		lbNameCorretor.setBounds(10, 171, 165, 25);
		lbNameCorretor.setFont(new Font("Dialog", Font.BOLD, 12));
		lbNameCorretor.setForeground(Color.WHITE);
		pnMain.add(lbNameCorretor);

		btMainServices = new JButton("HOME");
		btMainServices.setBounds(0, 204, 175, 40);
		btMainServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMainServices.setBackground(Color.decode("#007256"));
		btMainServices.setForeground(Color.WHITE);
		btMainServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMainServices);

		btMyServices = new JButton("Meus Clientes");
		btMyServices.setBounds(0, 244, 175, 40);
		btMyServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMyServices.setBackground(Color.decode("#007256"));
		btMyServices.setForeground(Color.WHITE);
		btMyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMyServices);

		btBuyServices = new JButton("Ocorrências");
		btBuyServices.setBounds(0, 284, 175, 40);
		btBuyServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btBuyServices.setBackground(Color.decode("#007256"));
		btBuyServices.setForeground(Color.WHITE);
		btBuyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btBuyServices);

		btHelpServices = new JButton("Finalizar Seguros");
		btHelpServices.setBounds(0, 324, 175, 40);
		btHelpServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btHelpServices.setBackground(Color.decode("#007256"));
		btHelpServices.setForeground(Color.WHITE);
		btHelpServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btHelpServices);

		btRelatorios = new JButton("Relatórios");
		btRelatorios.setBounds(0, 364, 175, 40);
		btRelatorios.setFont(new Font("Dialog", Font.PLAIN, 11));
		btRelatorios.setBackground(Color.decode("#007256"));
		btRelatorios.setForeground(Color.WHITE);
		btRelatorios.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btRelatorios);

		close = new JButton("Sair");
		close.setForeground(Color.WHITE);
		close.setBounds(0, 404, 175, 40);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.setFont(new Font("Dialog", Font.PLAIN, 15));
		close.setBackground(Color.decode("#007256"));
		pnMain.add(close);
		
		/////////////////////////////////////////////////PAINEL CANCELAR SERVIÇOS////////////////////////////////////
		pnCancel = new JPanel();
		pnCancel.setLayout(null);
		pnCancel.setVisible(false);
		pnCancel.setBounds(177, 0, 525, 600);
		
		lbCancelTitle = new JLabel("Cancelar Serviços");
		lbCancelTitle.setBounds(165, 45, 208, 25);
		lbCancelTitle.setFont(new Font("Dialog", Font.BOLD, 23));
		pnCancel.add(lbCancelTitle);
		
		rbCancelResidencial = new JRadioButton("Residencial Premiado");
		rbCancelResidencial.setBounds(50,87,125,18);
		pnCancel.add(rbCancelResidencial);
		
		rbCancelFianca = new JRadioButton("Fiança Locatícia - Aluguel");
		rbCancelFianca.setBounds(207,87,145,18);
		pnCancel.add(rbCancelFianca);
		
		rbCancelImobiliario = new JRadioButton("Imobiliario");
		rbCancelImobiliario.setBounds(386,87,78,18);
		pnCancel.add(rbCancelImobiliario);
		
		gpCancel = new ButtonGroup();
		gpCancel.add(rbCancelResidencial);
		gpCancel.add(rbCancelFianca);
		gpCancel.add(rbCancelImobiliario);
		
		lbCancelApolice = new JLabel("<html> <body> <center>Busque o serviço pela <br> apólice </center> </body></html>");
		lbCancelApolice.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelApolice.setBounds(40, 121, 158, 36);
		pnCancel.add(lbCancelApolice);
		
		
		txCancelApolice = new JTextField();
		txCancelApolice.setBounds(200,127,152,30);
		txCancelApolice.setFont(new Font("Dialog", Font.PLAIN, 20));
		pnCancel.add(txCancelApolice);
		
		lbCancelTitleDados= new JLabel("Dados do serviço");
		lbCancelTitleDados.setBounds(165, 178, 193, 25);
		lbCancelTitleDados.setFont(new Font("Dialog", Font.BOLD, 23));
		pnCancel.add(lbCancelTitleDados);
		
		lbCancelName = new JLabel("Nome");
		lbCancelName.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelName.setBounds(55, 214, 37, 18);
		pnCancel.add(lbCancelName);
		
		txCancelNome = new JTextField();
		txCancelNome.setBounds(100,214,352,20);
		txCancelNome.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelNome);
		
		lbCancelEndereco = new JLabel("Endereco");
		lbCancelEndereco.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelEndereco.setBounds(32, 250, 60, 18);
		pnCancel.add(lbCancelEndereco);
		
		txCancelEndereco = new JTextField();
		txCancelEndereco.setBounds(100,250,352,20);
		txCancelEndereco.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelEndereco);
		
		lbCancelPortaria = new JLabel("Portaria elétrica");
		lbCancelPortaria.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelPortaria.setBounds(32, 285, 103, 18);
		pnCancel.add(lbCancelPortaria);
		
		txCancelPortaria = new JTextField();
		txCancelPortaria.setBounds(145,285,40,20);
		txCancelPortaria.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelPortaria);
		
		lbCancelAlvenaria = new JLabel("Alvenaria");
		lbCancelAlvenaria.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelAlvenaria.setBounds(200, 285, 61, 18);
		pnCancel.add(lbCancelAlvenaria);
		
		txCancelAlvenaria = new JTextField();
		txCancelAlvenaria.setBounds(270,285,40,20);
		txCancelAlvenaria.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelAlvenaria);
		
		lbCancelRural = new JLabel("Moradia rural");
		lbCancelRural.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelRural.setBounds(320, 285, 90, 18);
		pnCancel.add(lbCancelRural);
		
		txCancelRural = new JTextField();
		txCancelRural.setBounds(415,285,40,20);
		txCancelRural.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelRural);
		
		lbCancelVaç = new JLabel("Moradia rural");
		lbCancelRural.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelRural.setBounds(320, 285, 90, 18);
		pnCancel.add(lbCancelRural);
		
		txCancelRural = new JTextField();
		txCancelRural.setBounds(415,285,40,20);
		txCancelRural.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelRural);
	
		btCancelarApolice = new JButton("Buscar");
		btCancelarApolice.setBounds(362, 127, 90, 30);
		btCancelarApolice.setFont(new Font("Dialog", Font.BOLD, 15));
		btCancelarApolice.setBackground(Color.decode("#007256"));
		btCancelarApolice.setForeground(Color.WHITE);
		btCancelarApolice.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnCancel.add(btCancelarApolice);
		
		getContentPane().add(pnCancel);
		this.getContentPane().add(pnMain);
	}

	public void eventos() {
		// EVENTOS DE HOVER
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
		close.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				close.setBackground(Color.decode("#00574f"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				close.setBackground(Color.decode("#007256"));
			}

		});

	}

	public void close() {
		this.setVisible(false);
	}
}
