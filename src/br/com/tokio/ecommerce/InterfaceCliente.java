package br.com.tokio.ecommerce;

import javax.swing.*;
import java.lang.reflect.Method;
import java.awt.*;
import java.awt.event.*;

public class InterfaceCliente extends JFrame {
	public JButton close;

	// Painel Lateral
	private JPanel pnMain;
	private JButton btMainServices, btMyServices, btHelpServices, btSeeSite;
	private JLabel lbImgUser, lbImgLogo;

	// Painel de comprar serviços
	private JPanel pnMainServices;
	private JButton btResidencial, btFianca, btImobiliario, btAuto, btVida, btAcidente;
	private JLabel lbTitleMainServices, lbTitleBuyServices, lbRecomendadosMainServices;

	// Painel Ajuda
	private JPanel pnHelp;
	private JLabel lbHelpTitle,lbHelpServicos,lbHelpTextArea, lbHelpExplicacao;
	private JTextArea txaHelpMessage;
	private JButton btHelpSend;
	private JComboBox cbHelpServicos;

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
		getContentPane().setLayout(null);
		

		//////////////////////////////////// PAINEL
		//////////////////////////////////// LATEAL/////////////////////////////////////
		pnMain = new JPanel();
		pnMain.setLayout(null);
		pnMain.setBackground(Color.decode("#007256"));
		pnMain.setBounds(0, 0, 175, 600);
		pnMain.setVisible(true);
		
		btMainServices = new JButton("HOME");
		btMainServices.setBounds(0, 204, 175, 40);
		btMainServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMainServices.setBackground(Color.decode("#007256"));
		btMainServices.setForeground(Color.WHITE);
		btMainServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMainServices);
		
		lbImgUser= new JLabel(new ImageIcon("images//user-branco.png"));
		lbImgUser.setBounds(20,10,135,135);
		pnMain.add(lbImgUser);
		
		lbImgLogo = new JLabel(new ImageIcon("images//logo-tokio-marine-seguradora-branco.png"));
		lbImgLogo.setBounds(10,550,155,36);
		pnMain.add(lbImgLogo);

		btMyServices = new JButton("Meus Seguros");
		btMyServices.setBounds(0, 244, 175, 40);
		btMyServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMyServices.setBackground(Color.decode("#007256"));
		btMyServices.setForeground(Color.WHITE);
		btMyServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMyServices);

		btHelpServices = new JButton("Ajuda");
		btHelpServices.setBounds(0, 284, 175, 40);
		btHelpServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btHelpServices.setBackground(Color.decode("#007256"));
		btHelpServices.setForeground(Color.WHITE);
		btHelpServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btHelpServices);
		
		btSeeSite = new JButton("Visite o site");
		btSeeSite.setBounds(0, 324, 175, 40);
		btSeeSite.setFont(new Font("Dialog", Font.PLAIN, 11));
		btSeeSite.setBackground(Color.decode("#007256"));
		btSeeSite.setForeground(Color.WHITE);
		btSeeSite.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btSeeSite);
		
		close = new JButton("Sair");
		close.setForeground(Color.WHITE);
		close.setBounds(0, 364, 175, 40);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.setFont(new Font("Dialog", Font.PLAIN, 11));
		close.setBackground(Color.decode("#007256"));
		pnMain.add(close);
		//////////////////////////////////// FIM PAINEL
		//////////////////////////////////// LATEAL/////////////////////////////////////

		///////////////////////////////////////// PAINEL
		///////////////////////////////////////// PRINCIPAL////////////////////////////////////////

		pnMainServices = new JPanel();
		pnMainServices.setLayout(null);
		pnMainServices.setVisible(true);
		pnMainServices.setBounds(177, 0, 525, 600);

		lbTitleMainServices = new JLabel("HOME");
		lbTitleMainServices.setBounds(217, 45, 75, 20);
		lbTitleMainServices.setFont(new Font("Dialog", Font.BOLD, 25));
		pnMainServices.add(lbTitleMainServices);

		lbTitleBuyServices = new JLabel("ADIQUIRA UM NOVO SEGURO RESIDENCIAL");
		lbTitleBuyServices.setBounds(48, 185, 430, 20);
		lbTitleBuyServices.setFont(new Font("Dialog", Font.BOLD, 20));
		pnMainServices.add(lbTitleBuyServices);

		btResidencial = new JButton("Residencial Premiado");
		btResidencial.setBounds(25, 220, 145, 80);
		btResidencial.setFont(new Font("Dialog", Font.PLAIN, 11));
		btResidencial.setBackground(Color.decode("#007256"));
		btResidencial.setForeground(Color.WHITE);
		btResidencial.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMainServices.add(btResidencial);

		btFianca = new JButton("Fian\u00E7a Locat\u00EDcia - Aluguel");
		btFianca.setBounds(188, 220, 147, 80);
		btFianca.setFont(new Font("Dialog", Font.PLAIN, 9));
		btFianca.setBackground(Color.decode("#007256"));
		btFianca.setForeground(Color.WHITE);
		btFianca.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMainServices.add(btFianca);

		btImobiliario = new JButton("Imobili\u00E1rio");
		btImobiliario.setBounds(354, 220, 145, 80);
		btImobiliario.setFont(new Font("Dialog", Font.PLAIN, 11));
		btImobiliario.setBackground(Color.decode("#007256"));
		btImobiliario.setForeground(Color.WHITE);
		btImobiliario.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMainServices.add(btImobiliario);

		lbRecomendadosMainServices = new JLabel("CATEGORIAS RECOMENDADAS");
		lbRecomendadosMainServices.setBounds(113, 390, 309, 20);
		lbRecomendadosMainServices.setFont(new Font("Dialog", Font.BOLD, 20));
		pnMainServices.add(lbRecomendadosMainServices);

		btAuto = new JButton("Automóveis");
		btAuto.setBounds(25, 425, 145, 80);
		btAuto.setFont(new Font("Dialog", Font.PLAIN, 12));
		btAuto.setBackground(Color.decode("#007256"));
		btAuto.setForeground(Color.WHITE);
		btAuto.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMainServices.add(btAuto);

		btVida = new JButton("Vida");
		btVida.setBounds(188, 425, 147, 80);
		btVida.setFont(new Font("Dialog", Font.PLAIN, 12));
		btVida.setBackground(Color.decode("#007256"));
		btVida.setForeground(Color.WHITE);
		btVida.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMainServices.add(btVida);

		btAcidente = new JButton("Acidentes Pessoais");
		btAcidente.setBounds(354, 425, 145, 80);
		btAcidente.setFont(new Font("Dialog", Font.PLAIN, 12));
		btAcidente.setBackground(Color.decode("#007256"));
		btAcidente.setForeground(Color.WHITE);
		btAcidente.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMainServices.add(btAcidente);

		///////////////////////////////////////// FIM PAINEL
		///////////////////////////////////////// PRINCIPAL////////////////////////////////////////

		////////////////////////////////////////////////// PN
		////////////////////////////////////////////////// HELP////////////////////////////////////////
		pnHelp = new JPanel();
		pnHelp.setLayout(null);
		pnHelp.setBounds(176, 0, 525, 600);
		pnHelp.setVisible(false);

		lbHelpTitle = new JLabel("AJUDA");
		lbHelpTitle.setBounds(220, 45, 87, 25);
		lbHelpTitle.setFont(new Font("Dialog", Font.BOLD, 23));
		pnHelp.add(lbHelpTitle);
		
		lbHelpExplicacao = new JLabel("<html><body><center>Envie suas dúvidas direto para o seu corretor,<br> que retornará assim que possível em seu email.<center></body></html>");
		lbHelpExplicacao.setBounds(106, 93, 312, 43);
		lbHelpExplicacao.setFont(new Font("Dialog", Font.PLAIN, 15));
		pnHelp.add(lbHelpExplicacao);
		
		lbHelpServicos = new JLabel("<html><body>Selecione o serviço <br> que necessita de ajuda:</body></html>");
		lbHelpServicos.setBounds(36,165,208,43);
		lbHelpServicos.setFont(new Font("Dialog", Font.BOLD, 18));
		pnHelp.add(lbHelpServicos);
		
		lbHelpTextArea = new JLabel("Escreva abaixo o seu problema/dúvida: ");
		lbHelpTextArea.setBounds(130,264,265,25);
		lbHelpTextArea.setFont(new Font("Dialog", Font.BOLD, 13));
		pnHelp.add(lbHelpTextArea);
		
		txaHelpMessage = new JTextArea();
		txaHelpMessage.setBounds(36,291,449,143);
		pnHelp.add(txaHelpMessage);
		
		btHelpSend = new JButton("Enviar");
		btHelpSend.setBounds(161,464,208,70);
		btHelpSend.setFont(new Font("", Font.BOLD, 20));
		btHelpSend.setBackground(Color.decode("#007256"));
		btHelpSend.setForeground(Color.WHITE);
		btHelpSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnHelp.add(btHelpSend);
		
		cbHelpServicos= new JComboBox(); /// colocar os serviços do user
		cbHelpServicos.setFont(new Font("Dialog", Font.PLAIN, 13));
		cbHelpServicos.setForeground(Color.decode("#007256"));
		cbHelpServicos.setBounds(267,178,218,30);
		pnHelp.add(cbHelpServicos);
		//////////////////////////////////////////////// FIM PN
		//////////////////////////////////////////////// HELP////////////////////////////////////////////
		

		
		getContentPane().add(pnMainServices);
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
		// FIM EVENTOS DE HOVER

		// EVENTOS DE AÃ‡ÃƒO
		btMainServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				if(pnHelp.isVisible()) {
					pnHelp.setVisible(false);
					pnMainServices.setVisible(true);
					getContentPane().add(pnMainServices);
				}

			}
		});
		btHelpServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				if(pnMainServices.isVisible()) {
					pnMainServices.setVisible(false);
					pnHelp.setVisible(true);
					getContentPane().add(pnHelp);
				}

			}
		});
		
		btSeeSite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				OpenURL.open("https://www.tokiomarine.com.br/");

			}
		});
		btAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				OpenURL.open("https://www.tokiomarine.com.br/seguros-automoveis/");

			}
		});
		btVida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				OpenURL.open("https://www.tokiomarine.com.br/seguros-vida/");

			}
		});
		btAcidente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				OpenURL.open("https://www.tokiomarine.com.br/seguros-acidentes/");

			}
		});

	}

	public void close() {

		this.setVisible(false);
	}
}
