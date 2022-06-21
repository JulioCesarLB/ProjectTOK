package br.com.tokio.ecommerce;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame {

	private String user = "Cliente", passworld, login;
	private JTextField txLogin, txPassworld;
	private JLabel lbLogin, lbPassworld, lbHello, imgLogo;
	private JButton btSend, btRegister;
	private JPanel pnLogin, pnRegister;

	// panel register
	private JTextField txName, txCpfCnpj, txDtNasc, txCep, txRg, txSexo, txEmail, txJob, txRenda, txTel;
	private JLabel lbName, lbCpfCnpj, lbDtNasc, lbCep, lbRg, lbSexo, lbEmail, lbJob, lbRenda, lbTel;
	private JButton btRegisterDone;

	public Login(String user) {

		this.user = user;
		componentes();
		eventos();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setUndecorated(true);
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
		lbHello.setBounds(150, 230, 400, 30);
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
		txPassworld = new JTextField();

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

			txName = new JTextField();
			txName.setBounds(100, 100, 320, 30);
			pnRegister.add(txName);

			txDtNasc = new JTextField();
			txDtNasc.setBounds(160, 140, 100, 30);
			pnRegister.add(txDtNasc);

			txCpfCnpj = new JTextField();
			txCpfCnpj.setBounds(50, 170, 100, 30);
			pnRegister.add(txCpfCnpj);

			txCep = new JTextField();
			txCep.setBounds(50, 200, 100, 30);
			pnRegister.add(txCep);

			txRg = new JTextField();
			txRg.setBounds(50, 230, 100, 30);
			pnRegister.add(txRg);
			
			//Combobox
			txSexo = new JTextField();
			txSexo.setBounds(50, 260, 100, 30);
			pnRegister.add(txSexo);

			txEmail = new JTextField();
			txEmail.setBounds(50, 290, 100, 30);
			pnRegister.add(txEmail);

			txJob = new JTextField();
			txJob.setBounds(50, 320, 100, 30);
			pnRegister.add(txJob);

			txRenda = new JTextField();
			txRenda.setBounds(50, 350, 100, 30);
			pnRegister.add(txRenda);

			txTel = new JTextField();
			txTel.setBounds(50, 380, 100, 30);
			pnRegister.add(txTel);

			lbName = new JLabel("Nome: ");
			lbName.setFont(new Font("", Font.BOLD, 22));
			lbName.setBounds(20, 100, 100, 23);
			pnRegister.add(lbName);

			lbDtNasc = new JLabel("Data de nascimento: ");
			lbDtNasc.setFont(new Font("", Font.BOLD, 13));
			lbDtNasc.setBounds(20, 140, 150, 23);
			pnRegister.add(lbDtNasc);
			
			lbCpfCnpj = new JLabel("CPF/CNPJ: ");
			pnRegister.add(lbCpfCnpj);


			lbCep = new JLabel("CEP: ");
			pnRegister.add(lbCep);

			lbRg = new JLabel("RG: ");
			pnRegister.add(lbRg);

			lbSexo = new JLabel("Sexo: ");
			pnRegister.add(lbSexo);

			lbEmail = new JLabel("Email: ");
			pnRegister.add(lbEmail);

			lbJob = new JLabel("Profissão: ");
			pnRegister.add(lbJob);

			lbRenda = new JLabel("Renda Mensal: ");
			pnRegister.add(lbRenda);

			lbTel = new JLabel("Tel: ");
			pnRegister.add(lbTel);

			btRegisterDone = new JButton("Registrar");

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

					if (user.equals("Cliente")) {

					} else {

					}

				}
			});
		}
	}
}
