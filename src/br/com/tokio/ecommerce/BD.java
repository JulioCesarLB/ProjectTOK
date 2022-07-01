package br.com.tokio.ecommerce;


import java.sql.*;
public class BD {
	public Connection conexao = null;
	private String driver ="oracle.jdbc.OracleDriver";
	private String url ="jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user= "TM_JULIO_BATISTA";
	private String senha="310304";

	public boolean getConnection(){
		
		try{
			Class.forName(driver);
			conexao = DriverManager.getConnection(url,user,senha);
			System.out.println("Conectado com sucesso");
		
			return true;
		}
		catch(ClassNotFoundException erro){
			System.out.print("DEU ERRO NO DRIVE, NÃO FOI ENCONTRADO: "+erro.toString());
			return false;
			
		}
		catch(SQLException erro){
			System.out.print("ERRO NO CAMINHO DO BANCO DE DADOS, ERRO NO ACESSO: "+erro.toString());
			return false;	
		}
	}
	
	public void close() {
		try {
			conexao.close();
			System.out.print("Desconectou do bd");
			
		}
		catch(SQLException erro) {
			System.out.print("ERRO AO FECHAR O BD: "+erro.toString());
		}	
	}
}

