package br.com.tokio.repository;

import java.sql.*;

import br.com.tokio.connectionFactory.*;
import br.com.tokio.model.Corretor;

public class CorretorDAO {
	private Connection conexao;
	
	public CorretorDAO() {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public Corretor login(String email, String senha)throws SQLException {
		String sql = "SELECT * FROM tb_tok_corretor WHERE ob_email_corretor=? AND ob_senha_corretor=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, email);
		stmt.setString(2,senha);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
		if(rs.getRow()==0) {
			System.out.println("não achou");
			return null;
		}else {
			System.out.println("achou");
			Corretor corretor = new Corretor();
			corretor.setId_corretor(rs.getString("id_corretor"));
			corretor.setNm_corretor(rs.getString("nm_corretor"));
			corretor.setOb_email_corretor(rs.getString("ob_email_corretor"));
			corretor.setOb_senha_corretor(rs.getString("ob_senha_corretor"));
			
			return corretor;
		}
		}return null;

	}
}
