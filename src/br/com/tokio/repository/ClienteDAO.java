package br.com.tokio.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.tokio.model.Cliente;

public class ClienteDAO {

	private Connection conexao;

	public ClienteDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void insertCadastro(String idCorretor, String nome, String cpf, String dtNasc, String sexo, String rg,
			String cep, String tel, String profissao, float renda, String email, String senha) throws SQLException {
		String sql = "insert into tb_tok_cliente (id_corretor, nm_cliente, nr_cpf_cliente, dt_nasc_cliente, ob_sexo_cliente, nr_rg_cliente, nr_cep_cliente, nr_tel_cliente, ob_profissao_cliente, vl_renda_mensal, ob_email_cliente, ds_senha_cliente) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, idCorretor);
		stmt.setString(2, nome);
		stmt.setString(3, cpf);
		stmt.setString(4, dtNasc);
		stmt.setString(5, sexo);
		stmt.setString(6, rg);
		stmt.setString(7, cep);
		stmt.setString(8, tel);
		stmt.setString(9, profissao);
		stmt.setFloat(10, renda);
		stmt.setString(11, email);
		stmt.setString(12, senha);

		// ResultSet rs = stmt.executeQuery();

		stmt.execute();
		stmt.close();
	}

	public Cliente login(String cpf, String senha) throws SQLException {
		String sql = "SELECT * FROM tb_tok_cliente WHERE nr_cpf_cliente=? AND ds_senha_cliente=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, cpf);
		stmt.setString(2, senha);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");
				return null;
			} else {
				System.out.println("achou");
				Cliente cliente = new Cliente();

				cliente.setId_cliente(rs.getLong("id_cliente"));
				cliente.setNm_cliente(rs.getString("nm_cliente"));
				cliente.setOb_email_cliente(rs.getString("ob_email_cliente"));
				cliente.setDs_senha_cliente(rs.getString("ds_senha_cliente"));
				cliente.setDt_nasc_cliente(rs.getString("dt_nasc_cliente"));
				cliente.setNr_cpf_cliente(rs.getString("nr_cpf_cliente"));
				cliente.setNr_rg_cliente(rs.getString("nr_rg_cliente"));
				cliente.setNr_cep_cliente(rs.getString("nr_cep_cliente"));
				cliente.setNr_tel_cliente(rs.getString("nr_tel_cliente"));
				cliente.setOb_sexo_cliente(rs.getString("ob_sexo_cliente").charAt(0));
				cliente.setId_corretor(rs.getString("id_corretor"));

				return cliente;
			}

		}
		return null;

	}

	public String getNomeCorretor(String id) throws SQLException {
		String sql = "select nm_corretor from tb_tok_corretor where id_corretor=?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");

				stmt.close();
				rs.close();
				return null;
			} else {
				System.out.println("achou");

				return rs.getString("nm_corretor");
			}

		}
		stmt.close();
		rs.close();
		return null;
	}

	public boolean selectByCPF(String CPF) throws SQLException {
		String sql = "select * from tb_tok_cliente where nr_cpf_cliente=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, CPF);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");

				stmt.close();
				rs.close();
				return false;
			} else {
				System.out.println("achou");

				return true;
			}

		}
		return false;
	}

	public boolean selectByEmail(String email) throws SQLException {
		String sql = "select * from tb_tok_cliente where ob_email_cliente=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, email);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");

				stmt.close();
				rs.close();
				return false;
			} else {
				System.out.println("achou");

				return true;
			}

		}
		return false;
	}

	public int numCorretores() throws SQLException {
		String sql = "select id_corretor from tb_tok_corretor";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		int retorno = 0;
		while (rs.next()) {
			retorno++;
		}
		return retorno;

	}

	public void insertEndereco(String idCliente, String obEndereco, String rural, String portaria, String alvenaria,
			String vlImovel) throws SQLException {
		String sql = "insert into tb_tok_endereco_cliente (id_cliente, ob_endereco, ob_local_rural, ob_portaria_eletr, ob_habitacao_alvenaria, vl_imovel) values(?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, idCliente);
		stmt.setString(2, obEndereco);
		stmt.setString(3, rural);
		stmt.setString(4, portaria);
		stmt.setString(5, alvenaria);
		stmt.setString(6, vlImovel);

		// ResultSet rs = stmt.executeQuery();

		stmt.execute();
	}

	public String getIdEndereco(String idCliente, String obEndereco, String rural, String portaria, String alvenaria,
			String vlImovel) throws SQLException {
		String sql = "select id_endereco from tb_tok_endereco_cliente where id_cliente=? AND ob_endereco=? AND ob_local_rural=? AND ob_portaria_eletr=? AND ob_habitacao_alvenaria=? AND vl_imovel=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, idCliente);
		stmt.setString(2, obEndereco);
		stmt.setString(3, rural);
		stmt.setString(4, portaria);
		stmt.setString(5, alvenaria);
		stmt.setString(6, vlImovel);

		String IdEndereco = "deuerro";

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println("não achou");

				stmt.close();
				rs.close();

			} else {
				System.out.println("achou");
				return IdEndereco = rs.getString("id_endereco");
			}
		}
		return IdEndereco;

	}

	public void insertResidencial(String idCliente, String obEndereco, String rural, String portaria, String alvenaria,
			String vlImovel, String tipo, String valor) throws SQLException {

		insertEndereco(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel);
		String idEndereco = getIdEndereco(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel);
		System.out.println(idEndereco);
		String sql = "insert into tb_tok_corretagem_rp (ob_tipo_habitacao, vl_servico, cd_servico, id_endereco, id_cliente) values(?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, tipo);
		stmt.setString(2, valor);
		stmt.setInt(3, 1);
		stmt.setString(4, idEndereco);
		stmt.setString(5, idCliente);
		stmt.execute();
		stmt.close();

	}

	public void insertFianca(String idCliente, String obEndereco, String rural, String portaria, String alvenaria,
			String vlImovel, String tipo, String valor) throws SQLException {

		insertEndereco(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel);
		String idEndereco = getIdEndereco(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel);
		System.out.println(idEndereco);
		String sql = "insert into tb_tok_corretagem_a (ob_tipo_habitacao, vl_servico, cd_servico, id_endereco, id_cliente) values(?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, tipo);
		stmt.setString(2, valor);
		stmt.setInt(3, 2);
		stmt.setString(4, idEndereco);
		stmt.setString(5, idCliente);
		stmt.execute();
		stmt.close();

	}

	public void insertImobiliario(String idCliente, String obEndereco, String rural, String portaria, String alvenaria,
			String vlImovel, String tipo, String nomeEmpresa, String valor) throws SQLException {

		insertEndereco(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel);
		String idEndereco = getIdEndereco(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel);
		System.out.println(idEndereco);
		String sql = "insert into tb_tok_corretagem_i (ob_tipo_seguimento, vl_servico, cd_servico, id_endereco, id_cliente, nm_empresa_cliente) values(?, ?, ?, ?, ?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, tipo);
		stmt.setString(2, valor);
		stmt.setInt(3, 3);
		stmt.setString(4, idEndereco);
		stmt.setString(5, idCliente);
		stmt.setString(6, nomeEmpresa);
		stmt.execute();
		stmt.close();

	}

	public String[] allSeguros(String idCliente) throws SQLException {
		List<String> lista = new ArrayList<String>();
		String sql = "select crp.cd_consulta, crp.vl_servico, ser.nm_servico from tb_tok_corretagem_rp crp inner join tb_tok_servicos ser on crp.cd_servico = ser.cd_servico WHERE id_cliente=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idCliente);

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String valores = rs.getString("cd_consulta") + "|" + rs.getString("nm_servico") + "|"
					+ rs.getString("vl_servico");
			lista.add(valores);
		}
		sql = "select ca.cd_consulta, ca.vl_servico, ser.nm_servico from tb_tok_corretagem_a ca inner join tb_tok_servicos ser on ca.cd_servico = ser.cd_servico WHERE id_cliente=?";
		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idCliente);
		rs = stmt.executeQuery();
		while (rs.next()) {
			String valores = rs.getString("cd_consulta") + "|" + rs.getString("nm_servico") + "|"
					+ rs.getString("vl_servico");
			lista.add(valores);
		}
		sql = "select ci.cd_consulta, ci.vl_servico, ser.nm_servico from tb_tok_corretagem_i  ci inner join tb_tok_servicos ser on ci.cd_servico = ser.cd_servico WHERE id_cliente=?";
		stmt.setString(1, idCliente);
		rs = stmt.executeQuery();
		while (rs.next()) {
			String valores = rs.getString("cd_consulta") + "|" + rs.getString("nm_servico") + "|"
					+ rs.getString("vl_servico");
			lista.add(valores);
		}
		
		stmt.close();
		rs.close();
		
		String[] retorno = new String[lista.size()];
		int apoio = 0;
		for (String var : lista) {
			retorno[apoio] = var;
			apoio++;
		}
		return retorno;
	}
	public void insertHelp(String tipo, String message, String idCliente, String idCorretor) throws SQLException  {
		String sql="insert into tb_tok_ajuda_cliente (tx_ajuda_cliente,ds_status,id_cliente,id_corretor) VALUES (?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, tipo+"  "+message);
		stmt.setString(2, "Pendente");
		stmt.setString(3, idCliente);
		stmt.setString(4, idCorretor);
		
		stmt.execute();
		stmt.close();
	}
	public Object[] selectMyServicos(String idCliente, String sql) throws SQLException {
		System.out.println("Funfa");
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idCliente);
		System.out.println("Funcionouuuuuuuuuu");
		ResultSet rs = stmt.executeQuery();
		
		System.out.println("Funcionou");
		Object[] objeto= new Object[10];
		
		while (rs.next()) {
			if (rs.getRow() == 0) {
				System.out.println(rs.getRow());
				System.out.println("não achou");
				rs.close();
				stmt.close();
				return null;
			} else {
				System.out.println(rs.getRow());
				System.out.println("achou");
			
				objeto[0]=rs.getString("nm_servico"); 
				objeto[1]=rs.getString("vl_servico");
				objeto[2]=rs.getString("ob_endereco");
		
			}
		}
		rs.close();
		stmt.close();
		return objeto;
		
	}
}