package br.com.tokio.ecommerce;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame{
	
	private String  user = "Cliente", passworld, login;
	private JTextField txEmail, txPassworld;
	private JLabel lbEmail, lbPassworld, lbHello, imgLogo;
	private JButton btSend, btRegister;
	private JPanel pnLogin, pnRegister;
	
	/*public static void main(String Args[]) {
		Login login= new Login();
	}*/
	public Login(String user) {
		
		this.user = user;
		componentes();
		eventos();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setBounds(0,0,450,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setIconImage(new ImageIcon("images//icon.png").getImage());
	}
	public void componentes() {
		pnLogin = new JPanel();
		pnLogin.setLayout(null);
		
		imgLogo = new JLabel(new ImageIcon("images//tokio-marine-sem-fundo190x168.png"));
		imgLogo.setBounds(125,30,190,168);
		pnLogin.add(imgLogo);
		
		lbHello = new JLabel("Olá, "+user);
		lbHello.setFont(new Font("",Font.BOLD,25));
		lbHello.setBounds(150,230,400,30);
		pnLogin.add(lbHello);
		
		lbEmail = new JLabel("Login:");
		lbEmail.setFont(new Font("",Font.BOLD,27));
		lbEmail.setBounds(50,285,100,35);
		pnLogin.add(lbEmail);
		
		lbPassworld = new JLabel("Senha:");
		lbPassworld.setFont(new Font("",Font.BOLD,27));
		lbPassworld.setBounds(50,340,100,35);
		pnLogin.add(lbPassworld);
		
		txEmail = new JTextField();
		txPassworld = new JTextField();
		
		txEmail.setBounds(150,280,240,45);
		txEmail.setFont(new Font("",Font.BOLD,20));
		pnLogin.add(txEmail);
		
		txPassworld.setBounds(150,335,240,45);
		txPassworld.setFont(new Font("",Font.BOLD,20));
		pnLogin.add(txPassworld);
		
		
		btSend = new JButton("Logar");
		btSend.setBounds(50,400,165,50);
		btSend.setFont(new Font("",Font.BOLD,20));
		btSend.setBackground(Color.decode("#007256"));
		btSend.setForeground(Color.WHITE);
		btSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnLogin.add(btSend);
		
		btRegister = new JButton("Registrar");
		btRegister.setBounds(225,400,165,50);
		btRegister.setFont(new Font("",Font.BOLD,20));
		btRegister.setBackground(Color.decode("#007256"));
		btRegister.setForeground(Color.WHITE);
		btRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
		pnLogin.add(btRegister);
		
		pnRegister = new JPanel();
		pnRegister.setLayout(null);
		
		
		
		
		getContentPane().add(pnLogin);		
	}
	public void eventos() {
		
		btSend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent argse) {
				
				if(txEmail.getText().equals("")) {
					txEmail.requestFocus();
					
				}else if(txPassworld.getText().equals("")) {
					txPassworld.requestFocus();
					
				}else {
					
					login = txEmail.getText();
					passworld = txPassworld.getText();
					
					System.out.println(login+" "+passworld);
					
				}
			}
		});
	}
}
