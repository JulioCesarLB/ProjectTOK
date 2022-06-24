package br.com.tokio.ecommerce;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.event.*;
import java.text.ParseException;
import java.awt.*;



public class Login extends JFrame {

	private String user = "Cliente", passworld, login;
	private JTextField txLogin, txPassworld;
	private JLabel lbLogin, lbPassworld, lbHello, imgLogo;
	private JButton btSend, btRegister;
	private JPanel pnLogin, pnRegister;

	// panel register
	private JTextField txName, txCpfCnpj, txDtNasc, txCep, txRg, txEmail, txJob, txRenda, txTel;
	private JLabel lbTitleRegister,lbName, lbCpfCnpj, lbDtNasc, lbCep, lbRg, lbSexo, lbEmail, lbJob, lbRenda, lbTel;
	private JComboBox cbSexo;
	private String[] vetCbSexo= {"Masculino","Feminino","Outro"};
	private JButton btRegisterDone, btBack;

	public Login(String user) {

		this.user = user;
		componentes();
		eventos();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setUndecorated(true);
		this.setBounds(0, 0, 450, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setIconImage(new ImageIcon("images//icon.png").getImage());
	}

	public void componentes() {
		pnLogin = new JPanel();
		pnLogin.setLayout(null);

		imgLogo = new JLabel(new ImageIcon("images//tokio-marine-sem-fundo190x168.png"));
		imgLogo.setBounds(130, 30, 190, 168);
		pnLogin.add(imgLogo);

		lbHello = new JLabel("Olá, " + user);
		lbHello.setFont(new Font("", Font.BOLD, 25));
		lbHello.setBounds(150, 230, 240, 30);
		pnLogin.add(lbHello);

		lbLogin = new JLabel("Login:");
		lbLogin.setFont(new Font("", Font.BOLD, 27));
		lbLogin.setBounds(50, 285, 100, 35);
		pnLogin.add(lbLogin);

		lbPassworld = new JLabel("Senha:");
		lbPassworld.setFont(new Font("", Font.BOLD, 27));
		lbPassworld.setBounds(50, 340, 100, 35);
		pnLogin.add(lbPassworld);

		txLogin = new JTextField();
		txPassworld = new JPasswordField();

		txLogin.setBounds(150, 280, 240, 45);
		txLogin.setFont(new Font("", Font.BOLD, 20));
		pnLogin.add(txLogin);

		txPassworld.setBounds(150, 335, 240, 45);
		txPassworld.setFont(new Font("", Font.BOLD, 20));
		pnLogin.add(txPassworld);

		btSend = new JButton("Logar");
		btSend.setBounds(50, 400, 165, 50);
		btSend.setFont(new Font("", Font.BOLD, 20));
		btSend.setBackground(Color.decode("#007256"));
		btSend.setForeground(Color.WHITE);
		btSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnLogin.add(btSend);

		if (user.equals("Cliente")) {
			btRegister = new JButton("Registrar");
			btRegister.setBounds(225, 400, 165, 50);
			btRegister.setFont(new Font("", Font.BOLD, 20));
			btRegister.setBackground(Color.decode("#007256"));
			btRegister.setForeground(Color.WHITE);
			btRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
			pnLogin.add(btRegister);

			pnRegister = new JPanel();
			pnRegister.setLayout(null);
			pnRegister.setVisible(false);
			
			lbTitleRegister = new JLabel("NOVO CLIENTE");
			lbTitleRegister.setForeground(Color.decode("#007256"));
			lbTitleRegister.setFont(new Font("", Font.BOLD, 26));
			lbTitleRegister.setBounds(121,57,200,27);
			pnRegister.add(lbTitleRegister);
			
			btBack = new JButton("Voltar");
			btBack.setBounds(10,10,60,30);
			btBack.setFont(new Font("Dialog", Font.PLAIN, 9));
			btBack.setBackground(Color.decode("#007256"));
			btBack.setForeground(Color.WHITE);
			btBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
			pnRegister.add(btBack);

			txName = new JTextField();
			txName.setBounds(100, 120, 320, 30);
			pnRegister.add(txName);

			try {
				txDtNasc = new JFormattedTextField(new MaskFormatter("##/##/####"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			txDtNasc.setBounds(160, 165, 100, 30);
			pnRegister.add(txDtNasc);

			txCpfCnpj = new JTextField();
			txCpfCnpj.setBounds(100, 213, 160, 30);
			pnRegister.add(txCpfCnpj);

			try {
				txCep = new JFormattedTextField(new MaskFormatter("#####-###"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			txCep.setBounds(60, 260, 151, 30);
			pnRegister.add(txCep);

			try {
				txRg = new JFormattedTextField(new MaskFormatter("##.###.###-#"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			txRg.setBounds(309, 213, 111, 30);
			pnRegister.add(txRg);
			
			//Combobox
			cbSexo = new JComboBox(vetCbSexo);
			cbSexo.setBounds(320, 165, 100, 30);
			cbSexo.setForeground(Color.decode("#007256"));
			pnRegister.add(cbSexo);

			txEmail = new JTextField();
			txEmail.setBounds(70, 395, 350, 30);
			pnRegister.add(txEmail);

			txJob = new JTextField();
			txJob.setBounds(100, 306, 320, 30);
			pnRegister.add(txJob);

			txRenda = new JTextField();
			txRenda.setBounds(221, 351, 121, 30);
			pnRegister.add(txRenda);

			try {
				txTel = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			txTel.setBounds(296, 260, 124, 30);
			pnRegister.add(txTel);

			lbName = new JLabel("Nome: ");
			lbName.setFont(new Font("", Font.BOLD, 22));
			lbName.setForeground(Color.decode("#007256"));
			lbName.setBounds(20, 120, 73, 23);
			pnRegister.add(lbName);

			lbDtNasc = new JLabel("Data de nascimento: ");
			lbDtNasc.setFont(new Font("", Font.BOLD, 13));
			lbDtNasc.setForeground(Color.decode("#007256"));
			lbDtNasc.setBounds(20, 168, 134, 23);
			pnRegister.add(lbDtNasc);
			
			lbSexo = new JLabel("Sexo: ");
			lbSexo.setBounds(272, 168,49, 23);
			lbSexo.setFont(new Font("", Font.BOLD, 14));
			lbSexo.setForeground(Color.decode("#007256"));
			pnRegister.add(lbSexo);
			
			lbCpfCnpj = new JLabel("CPF/CNPJ: ");
			lbCpfCnpj.setFont(new Font("", Font.BOLD, 14));
			lbCpfCnpj.setForeground(Color.decode("#007256"));
			lbCpfCnpj.setBounds(20, 215,77, 23);
			pnRegister.add(lbCpfCnpj);

			lbRg = new JLabel("RG: ");
			lbRg.setBounds(272, 215,29,23);
			lbRg.setFont(new Font("", Font.BOLD, 14));
			lbRg.setForeground(Color.decode("#007256"));
			pnRegister.add(lbRg);

			lbCep = new JLabel("CEP: ");
			lbCep.setBounds(20,262,36,23);
			lbCep.setFont(new Font("", Font.BOLD, 14));
			lbCep.setForeground(Color.decode("#007256"));
			pnRegister.add(lbCep);


			lbEmail = new JLabel("Email: ");
			lbEmail.setBounds(20,398,49,23);
			lbEmail.setFont(new Font("", Font.BOLD, 14));
			lbEmail.setForeground(Color.decode("#007256"));
			pnRegister.add(lbEmail);

			lbJob = new JLabel("Profissão: ");
			lbJob.setBounds(20,308,77,23);
			lbJob.setFont(new Font("", Font.BOLD, 14));
			lbJob.setForeground(Color.decode("#007256"));
			pnRegister.add(lbJob);

			lbRenda = new JLabel("Renda Mensal: ");
			lbRenda.setBounds(110,353,111,23);
			lbRenda.setFont(new Font("", Font.BOLD, 14));
			lbRenda.setForeground(Color.decode("#007256"));
			pnRegister.add(lbRenda);

			lbTel = new JLabel("Tel: ");
			lbTel.setBounds(261,262,29,23);
			lbTel.setFont(new Font("", Font.BOLD, 14));
			lbTel.setForeground(Color.decode("#007256"));
			pnRegister.add(lbTel);

			btRegisterDone = new JButton("Registrar");
			btRegisterDone.setFont(new Font("", Font.BOLD, 20));
			btRegisterDone.setBackground(Color.decode("#007256"));
			btRegisterDone.setForeground(Color.WHITE);
			btRegisterDone.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btRegisterDone.setBounds(134,458,175,60);
			pnRegister.add(btRegisterDone);

		} else {
			btSend.setBounds(150, 400, 165, 50);
		}

		getContentPane().add(pnLogin);
	}

	public void eventos() {

		btSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argse) {

				if (txLogin.getText().equals("")) {
					txLogin.requestFocus();

				} else if (txPassworld.getText().equals("")) {
					txPassworld.requestFocus();

				} else {

					login = txLogin.getText();
					passworld = txPassworld.getText();

					System.out.println(login + " " + passworld);

				}
			}
		});

		if (user.equals("Cliente")) {
			btRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent argse) {
					pnLogin.setVisible(false);
					pnRegister.setVisible(true);
					getContentPane().add(pnRegister);

				}
			});
			btBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent argse) {
					pnRegister.setVisible(false);
					pnLogin.setVisible(true);
					getContentPane().add(pnLogin);

				}
			});
			btRegisterDone.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent argse) {
					
						
					
					if(txName.getText().equals("")) {
						txName.requestFocus();
					}else if(txDtNasc.getText().equals("")) {
						txDtNasc.requestFocus();
					}else if(txCpfCnpj.getText().equals("")) {
						txCpfCnpj.requestFocus();
					}else if(txRg.getText().equals("")) {
						txRg.requestFocus();
					}else if(txCep.getText().equals("")) {
						txCep.requestFocus();
					}else if(txTel.getText().equals("")) {
						txTel.requestFocus();
					}else if(txJob.getText().equals("")) {
						txJob.requestFocus();
					}else if(txRenda.getText().equals("")) {
						txRenda.requestFocus();
					}else if(txEmail.getText().equals("")) {
						txEmail.requestFocus();
					}else {
						String name = txName.getText();
						String dtNasc = txDtNasc.getText();
						String cpfCnpj = txCpfCnpj.getText();
						String rg = txRg.getText();
						String cep = txCep.getText();
						String tel =txTel.getText();
						String job = txJob.getText();
						String renda = txRenda.getText();
						String email= txEmail.getText();
						String sexo = (String) cbSexo.getSelectedItem();
						
						//Validar dados (Tamanhos)
						
						
						if(cpfCnpj.equals("1234")) { // verificar se não existe ninguém cadastrado 
							  JOptionPane.showMessageDialog(null,"Parabéns, "+name+"! \nVocê foi cadastrado com sucesso ", "Cadastrad0 com sucesso!!!!", JOptionPane.INFORMATION_MESSAGE);
							
						}else {
							System.out.println("Já existe alguém cadastrado com esse CPF");
						}
						
					}
					pnLogin.setVisible(false);
					pnRegister.setVisible(true);
					getContentPane().add(pnRegister);


				}
			});
		}
	}
}
