package br.com.tokio.repository;

import java.sql.*;
import java.util.*;

import br.com.tokio.connectionFactory.*;
import br.com.tokio.model.*;

public class CorretorDAO {
	private Connection conexao;

	public CorretorDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public Corretor login(String email, String senha) throws SQLException {
		String sql = "SELECT * FROM tb_tok_corretor WHERE ob_email_corretor=? AND ob_senha_corretor=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, email);
		stmt.setString(2, senha);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");
				return null;
			} else {
				System.out.println("achou");
				Corretor corretor = new Corretor();
				corretor.setId_corretor(rs.getString("id_corretor"));
				corretor.setNm_corretor(rs.getString("nm_corretor"));
				corretor.setOb_email_corretor(rs.getString("ob_email_corretor"));
				corretor.setOb_senha_corretor(rs.getString("ob_senha_corretor"));

				return corretor;
			}
		}
		return null;

	}

	public List<Cliente> selectClientes(String idCorretor, String sql) throws SQLException {
		//String sql = "SELECT * FROM tb_tok_cliente WHERE id_corretor=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idCorretor);
		ResultSet rs = stmt.executeQuery();
		List<Cliente> clientes = new ArrayList<Cliente>();
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");
				return null;
			} else {
				System.out.println("achou");
				Cliente cliente = new Cliente();
				cliente.setId_cliente(rs.getLong("id_cliente"));
				cliente.setNm_cliente(rs.getString("nm_cliente"));
				cliente.setNr_cpf_cliente(rs.getString("nr_cpf_cliente"));
				cliente.setDt_nasc_cliente(rs.getString("dt_nasc_cliente"));
				cliente.setOb_sexo_cliente(rs.getString("ob_sexo_cliente").charAt(0));
				cliente.setNr_rg_cliente(rs.getString("nr_rg_cliente"));
				cliente.setNr_cep_cliente(rs.getString("nr_cep_cliente"));
				cliente.setNr_tel_cliente(rs.getString("nr_tel_cliente"));
				cliente.setOb_profissao_cliente(rs.getString("ob_profissao_cliente"));
				cliente.setVl_renda_mensal(rs.getFloat("vl_renda_mensal"));
				cliente.setOb_email_cliente(rs.getString("ob_email_cliente"));

				clientes.add(cliente);
			}
		}
		return clientes;

	}

	public List<Cliente> selectClientes(String idCorretor,String sql, String nomeCliente) throws SQLException {
		//String sql = "SELECT * FROM tb_tok_cliente WHERE id_corretor=? AND nm_cliente´?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idCorretor);
		stmt.setString(2, nomeCliente);
		ResultSet rs = stmt.executeQuery();
		List<Cliente> clientes = new ArrayList<Cliente>();
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");
				return null;
			} else {
				System.out.println("achou");
				Cliente cliente = new Cliente();
				cliente.setId_cliente(rs.getLong("id_cliente"));
				cliente.setNm_cliente(rs.getString("nm_cliente"));
				cliente.setNr_cpf_cliente(rs.getString("nr_cpf_cliente"));
				cliente.setDt_nasc_cliente(rs.getString("dt_nasc_cliente"));
				cliente.setOb_sexo_cliente(rs.getString("ob_sexo_cliente").charAt(0));
				cliente.setNr_rg_cliente(rs.getString("nr_rg_cliente"));
				cliente.setNr_cep_cliente(rs.getString("nr_cep_cliente"));
				cliente.setNr_tel_cliente(rs.getString("nr_tel_cliente"));
				cliente.setOb_profissao_cliente(rs.getString("ob_profissao_cliente"));
				cliente.setVl_renda_mensal(rs.getFloat("vl_renda_mensal"));
				cliente.setOb_email_cliente(rs.getString("ob_email_cliente"));

				clientes.add(cliente);
			}
		}
		return clientes;

	}
}
