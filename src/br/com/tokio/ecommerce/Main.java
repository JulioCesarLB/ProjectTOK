package br.com.tokio.ecommerce;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String[] area = {"Area do Cliente","Area do Corretor"}, login={"Fazer login","Realizar cadastro"};
		
		if(JOptionPane.showInputDialog(null,"Seja bem vindo! Qual �rea deseja acessar?", "Bem Vindo!!!",JOptionPane.INFORMATION_MESSAGE, null,area, area[0]).equals("Area do Cliente")) {
			
			if(JOptionPane.showInputDialog(null,"O que deseja fazer na area de CLIENTE?", "Ol�, Cliente",JOptionPane.INFORMATION_MESSAGE, null,login, login[0]).equals("Fazer login")){
				//pedir email e senha
			}else {
				//realizar o cadastro
			}
		}else {
			if(JOptionPane.showInputDialog(null,"O que deseja fazer na area de CORRETOR?", "Ol�, Corretor",JOptionPane.INFORMATION_MESSAGE, null,login, login[0]).equals("Fazer login")){
				//pedir email e senha
			}else {
				//realizar o cadastro
			}
		}
	}
}
