package br.com.tokio.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;

public class InterfaceCorretor extends JFrame {
	public JButton close;

	// Painel Lateral
	private JPanel pnMain;
	private JButton btMainServices, btMyClients, btOcorrencias, btFinalServices, btRelatorios;
	private JLabel lbImgUser, lbImgLogo, lbNameCorretor;
	
	//Painel Principal
	private JPanel pnMainServices;
	
	// Painel cancelar servi�os
	private JPanel pnCancel;
	private JLabel lbCancelTitle,lbCancelTitleDados, lbCancelApolice, lbCancelName, lbCancelEndereco, lbCancelRural, lbCancelPortaria, lbCancelAlvenaria,lbCancelValorServico,lbCancelNomeEmpresa,lbCancelValorImovel,lbCancelTipo;
	private JTextField txCancelApolice, txCancelNome, txCancelEndereco, txCancelRural, txCancelPortaria, txCancelAlvenaria,txCancelValorServico,txCancelNomeEmpresa,txCancelValorImovel,txCancelTipo;
	private ButtonGroup gpCancel;
	private JRadioButton rbCancelImobiliario, rbCancelResidencial, rbCancelFianca;
	private JButton btCancelarApolice, btCancelarDelete, btCancelCancelar;

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

		btMyClients = new JButton("Meus Clientes");
		btMyClients.setBounds(0, 244, 175, 40);
		btMyClients.setFont(new Font("Dialog", Font.PLAIN, 11));
		btMyClients.setBackground(Color.decode("#007256"));
		btMyClients.setForeground(Color.WHITE);
		btMyClients.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btMyClients);

		btOcorrencias = new JButton("Ocorr�ncias");
		btOcorrencias.setBounds(0, 284, 175, 40);
		btOcorrencias.setFont(new Font("Dialog", Font.PLAIN, 11));
		btOcorrencias.setBackground(Color.decode("#007256"));
		btOcorrencias.setForeground(Color.WHITE);
		btOcorrencias.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btOcorrencias);

		btFinalServices = new JButton("Finalizar Seguros");
		btFinalServices.setBounds(0, 324, 175, 40);
		btFinalServices.setFont(new Font("Dialog", Font.PLAIN, 11));
		btFinalServices.setBackground(Color.decode("#007256"));
		btFinalServices.setForeground(Color.WHITE);
		btFinalServices.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnMain.add(btFinalServices);

		btRelatorios = new JButton("Relat�rios");
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
		
		
		/////////////////////////////////////////////////PAINEL HOME//////////////////////////////////////////////////
		pnMainServices = new JPanel();
		pnMainServices.setLayout(null);
		pnMainServices.setVisible(true);
		pnMainServices.setBounds(177, 0, 525, 600);
		
		/////////////////////////////////////////////////FIM PAINEL HOME//////////////////////////////////////////////////

		
		/////////////////////////////////////////////////PAINEL CANCELAR SERVI�OS////////////////////////////////////
		pnCancel = new JPanel();
		pnCancel.setLayout(null);
		pnCancel.setVisible(false);
		pnCancel.setBounds(177, 0, 525, 600);
		
		lbCancelTitle = new JLabel("Cancelar Servi�os");
		lbCancelTitle.setBounds(165, 45, 208, 25);
		lbCancelTitle.setFont(new Font("Dialog", Font.BOLD, 23));
		pnCancel.add(lbCancelTitle);
		
		rbCancelResidencial = new JRadioButton("Residencial Premiado");
		rbCancelResidencial.setSelected(true);		
		rbCancelResidencial.setBounds(50,87,150,18);
		pnCancel.add(rbCancelResidencial);
		
		rbCancelFianca = new JRadioButton("Fian�a Locat�cia - Aluguel");
		rbCancelFianca.setBounds(200,87,175,18);
		pnCancel.add(rbCancelFianca);
		
		rbCancelImobiliario = new JRadioButton("Imobiliario");
		rbCancelImobiliario.setBounds(375,87,90,18);
		pnCancel.add(rbCancelImobiliario);
		
		gpCancel = new ButtonGroup();
		gpCancel.add(rbCancelResidencial);
		gpCancel.add(rbCancelFianca);
		gpCancel.add(rbCancelImobiliario);
		
		lbCancelApolice = new JLabel("<html> <body> <center>Busque o servi�o pela <br> ap�lice </center> </body></html>");
		lbCancelApolice.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelApolice.setBounds(40, 121, 158, 36);
		pnCancel.add(lbCancelApolice);
		
		
		txCancelApolice = new JTextField();
		txCancelApolice.setBounds(200,127,152,30);
		txCancelApolice.setFont(new Font("Dialog", Font.PLAIN, 20));
		pnCancel.add(txCancelApolice);
		
		lbCancelTitleDados= new JLabel("Dados do servi�o");
		lbCancelTitleDados.setBounds(165, 178, 193, 25);
		lbCancelTitleDados.setFont(new Font("Dialog", Font.BOLD, 23));
		pnCancel.add(lbCancelTitleDados);
		
		lbCancelName = new JLabel("Nome");
		lbCancelName.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelName.setBounds(55, 224, 37, 18);
		pnCancel.add(lbCancelName);
		
		txCancelNome = new JTextField();
		txCancelNome.setBounds(100,224,352,20);
		txCancelNome.setEnabled(false);
		txCancelNome.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelNome);
		
		lbCancelEndereco = new JLabel("Endereco");
		lbCancelEndereco.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelEndereco.setBounds(32, 260, 60, 18);
		pnCancel.add(lbCancelEndereco);
		
		txCancelEndereco = new JTextField();
		txCancelEndereco.setBounds(100,260,352,20);
		txCancelEndereco.setEnabled(false);
		txCancelEndereco.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelEndereco);
		
		lbCancelPortaria = new JLabel("Portaria el�trica");
		lbCancelPortaria.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelPortaria.setBounds(32, 295, 103, 18);
		pnCancel.add(lbCancelPortaria);
		
		txCancelPortaria = new JTextField();
		txCancelPortaria.setBounds(145,295,40,20);
		txCancelPortaria.setEnabled(false);
		txCancelPortaria.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelPortaria);
		
		lbCancelAlvenaria = new JLabel("Alvenaria");
		lbCancelAlvenaria.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelAlvenaria.setBounds(200, 295, 61, 18);
		pnCancel.add(lbCancelAlvenaria);
		
		txCancelAlvenaria = new JTextField();
		txCancelAlvenaria.setBounds(270,295,40,20);
		txCancelAlvenaria.setEnabled(false);
		txCancelAlvenaria.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelAlvenaria);
		
		lbCancelRural = new JLabel("Moradia rural");
		lbCancelRural.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelRural.setBounds(320, 295, 90, 18);
		pnCancel.add(lbCancelRural);
		
		txCancelRural = new JTextField();
		txCancelRural.setBounds(415,295,40,20);
		txCancelRural.setEnabled(false);
		txCancelRural.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelRural);
		
		lbCancelValorImovel = new JLabel("Valor do im�vel");
		lbCancelValorImovel.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelValorImovel.setBounds(30, 330, 103, 18);
		pnCancel.add(lbCancelValorImovel);
		
		txCancelValorImovel = new JTextField();
		txCancelValorImovel.setBounds(140,330,111,20);
		txCancelValorImovel.setEnabled(false);
		txCancelValorImovel.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelValorImovel);
		
		lbCancelTipo = new JLabel("Tipo");
		lbCancelTipo.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelTipo.setBounds(270, 330, 37, 18);
		pnCancel.add(lbCancelTipo);
		
		txCancelTipo = new JTextField();
		txCancelTipo.setBounds(310,330,139,20);
		txCancelTipo.setEnabled(false);
		txCancelTipo.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelTipo);
		
		lbCancelNomeEmpresa = new JLabel("Nome da empresa");
		lbCancelNomeEmpresa.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelNomeEmpresa.setVisible(false);
		lbCancelNomeEmpresa.setBounds(30, 365, 125, 18);
		pnCancel.add(lbCancelNomeEmpresa);
		
		txCancelNomeEmpresa = new JTextField();
		txCancelNomeEmpresa.setBounds(160,365,292,20);
		txCancelNomeEmpresa.setVisible(false);
		txCancelNomeEmpresa.setEnabled(false);
		txCancelNomeEmpresa.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelNomeEmpresa);
		
		lbCancelValorServico = new JLabel("Valor do servi�o");
		lbCancelValorServico.setFont(new Font("Dialog", Font.BOLD, 13));
		lbCancelValorServico.setBounds(140, 405, 111, 18);
		pnCancel.add(lbCancelValorServico);
		
		txCancelValorServico = new JTextField();
		txCancelValorServico.setBounds(255,405,97,20);
		txCancelValorServico.setEnabled(false);
		txCancelValorServico.setFont(new Font("Dialog", Font.PLAIN, 18));
		pnCancel.add(txCancelValorServico);
		
		btCancelarApolice = new JButton("Buscar");
		btCancelarApolice.setBounds(362, 127, 90, 30);
		btCancelarApolice.setFont(new Font("Dialog", Font.BOLD, 15));
		btCancelarApolice.setBackground(Color.decode("#007256"));
		btCancelarApolice.setForeground(Color.WHITE);
		btCancelarApolice.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnCancel.add(btCancelarApolice);
		
		btCancelarDelete = new JButton("Finalizar");
		btCancelarDelete.setBounds(283, 455, 165, 65);
		btCancelarDelete.setFont(new Font("", Font.BOLD, 20));
		btCancelarDelete.setBackground(Color.decode("#007256"));
		btCancelarDelete.setForeground(Color.WHITE);
		btCancelarDelete.setCursor(new Cursor(Cursor.HAND_CURSOR));;
		btCancelarDelete.setEnabled(false);
		pnCancel.add(btCancelarDelete);
		
		btCancelCancelar = new JButton("Cancelar");
		btCancelCancelar.setBounds(89, 455, 165, 65);
		btCancelCancelar.setFont(new Font("", Font.BOLD, 20));
		btCancelCancelar.setBackground(Color.decode("#007256"));
		btCancelCancelar.setForeground(Color.WHITE);
		btCancelCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnCancel.add(btCancelCancelar);

		
		

		
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
		btMyClients.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btMyClients.setBackground(Color.decode("#00574f"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btMyClients.setBackground(Color.decode("#007256"));
			}

		});

		btOcorrencias.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btOcorrencias.setBackground(Color.decode("#00574f"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btOcorrencias.setBackground(Color.decode("#007256"));
			}

		});
		btFinalServices.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btFinalServices.setBackground(Color.decode("#00574f"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btFinalServices.setBackground(Color.decode("#007256"));
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
		
		////////////////////////////////COMANDOS DE A��ES/////////////////////////////////////
		btMainServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				if(pnCancel.isVisible()) {
					pnCancel.setVisible(false);
					
					pnMainServices.setVisible(true);
					getContentPane().add(pnMainServices);
				}

			}
		});
		btFinalServices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				if(pnMainServices.isVisible()) {
					pnMainServices.setVisible(false);
					
					pnCancel.setVisible(true);
					getContentPane().add(pnCancel);
				}

			}
		});
		
		rbCancelImobiliario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				txCancelNomeEmpresa.setVisible(true);
				lbCancelNomeEmpresa.setVisible(true);
				
				btCancelarDelete.setEnabled(false);
				txCancelApolice.setText(""); 
				txCancelNome.setText(""); 
				txCancelEndereco.setText("");
				txCancelRural.setText("");
				txCancelPortaria.setText("");
				txCancelAlvenaria.setText("");
				txCancelValorServico.setText("");
				txCancelNomeEmpresa.setText("");
				txCancelValorImovel.setText("");
				txCancelTipo.setText("");

			}
		});
		rbCancelFianca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				txCancelNomeEmpresa.setVisible(false);
				lbCancelNomeEmpresa.setVisible(false);
				
				btCancelarDelete.setEnabled(false);
				txCancelApolice.setText(""); 
				txCancelNome.setText(""); 
				txCancelEndereco.setText("");
				txCancelRural.setText("");
				txCancelPortaria.setText("");
				txCancelAlvenaria.setText("");
				txCancelValorServico.setText("");
				txCancelNomeEmpresa.setText("");
				txCancelValorImovel.setText("");
				txCancelTipo.setText("");
			}
		});
		rbCancelResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				txCancelNomeEmpresa.setVisible(false);
				lbCancelNomeEmpresa.setVisible(false);

				btCancelarDelete.setEnabled(false);
				txCancelApolice.setText(""); 
				txCancelNome.setText(""); 
				txCancelEndereco.setText("");
				txCancelRural.setText("");
				txCancelPortaria.setText("");
				txCancelAlvenaria.setText("");
				txCancelValorServico.setText("");
				txCancelNomeEmpresa.setText("");
				txCancelValorImovel.setText("");
				txCancelTipo.setText("");
			}
		});
		
		btCancelarApolice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				if(txCancelApolice.getText().equals("")) {
					txCancelApolice.requestFocus();
				}else{
					// verificar se tem um servi�o com essa apolice
					//Se sim buscar e colocar nos textfields
					
					btCancelarDelete.setEnabled(true);
					if(rbCancelResidencial.isSelected()) {
						
						///Fazer a busca na tabela residencial e colocar nos textfields 
						txCancelNome.setText("Julinho"); 
						txCancelEndereco.setText("RUAZINHA");
						txCancelRural.setText("Sim");
						txCancelPortaria.setText("Nao");
						txCancelAlvenaria.setText("Sim");
						txCancelValorServico.setText("700");
						txCancelValorImovel.setText("700000");
						txCancelTipo.setText("apartamento");
						
						
					}else if(rbCancelImobiliario.isSelected()) {
						
						///Fazer a busca na tabela imobliario e colocar nos textfields
						txCancelNome.setText("Guedes"); 
						txCancelEndereco.setText("ONDE JUDAS PERDEU AS BOTAS");
						txCancelRural.setText("Nao");
						txCancelPortaria.setText("Nao");
						txCancelAlvenaria.setText("Nao");
						txCancelValorServico.setText("2000");
						txCancelNomeEmpresa.setText("SLA");
						txCancelValorImovel.setText("1000000");
						txCancelTipo.setText("SAL");
						
						btCancelarDelete.setEnabled(true);
						
					}else {
						///Fazer a busca na tabela Fianca aluguel e colocar nos textfields
						txCancelNome.setText("LUIzao"); 
						txCancelEndereco.setText("RUAona");
						txCancelRural.setText("Sim");
						txCancelPortaria.setText("Sim");
						txCancelAlvenaria.setText("Sim");
						txCancelValorServico.setText("1000");
						txCancelValorImovel.setText("750000");
						txCancelTipo.setText("apartamentao");
						
						btCancelarDelete.setEnabled(true);
						
					}
				}

			}
		});
		btCancelarDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				

			}
		});
		btCancelCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {
				btCancelarDelete.setEnabled(false);
				txCancelApolice.setText(""); 
				txCancelNome.setText(""); 
				txCancelEndereco.setText("");
				txCancelRural.setText("");
				txCancelPortaria.setText("");
				txCancelAlvenaria.setText("");
				txCancelValorServico.setText("");
				txCancelNomeEmpresa.setText("");
				txCancelValorImovel.setText("");
				txCancelTipo.setText("");
				
				pnCancel.setVisible(false);
				pnMainServices.setVisible(true);
				getContentPane().add(pnMainServices);

			}
		});

	}

	public void close() {
		this.setVisible(false);
	}
}
