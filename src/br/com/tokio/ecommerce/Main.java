package br.com.tokio.ecommerce;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String[] area = {"Area do Cliente","Area do Corretor"};
		
		if(JOptionPane.showInputDialog(null,"Seja bem vindo! Qual área deseja acessar?", "Bem Vindo!!!",JOptionPane.INFORMATION_MESSAGE, null,area, area[0]).equals("Area do Cliente")) {
			Login login = new Login("Cliente");
		}else {
			Login login = new Login("Corretor");
		}
	}
}
