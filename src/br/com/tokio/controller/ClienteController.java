package br.com.tokio.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import br.com.tokio.connectionFactory.ConnectionFactory;
import br.com.tokio.model.*;
import br.com.tokio.repository.ClienteDAO;

public class ClienteController {
	private ClienteDAO cliente;
	private Connection conexao = new ConnectionFactory().getConnection();

	public ClienteController() {
		this.cliente = new ClienteDAO(conexao);
	}

	public Cliente login(String cpf, String senha) {
		try {
			return cliente.login(cpf, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String getNomeCorretor(String id) {
		try {
			return cliente.getNomeCorretor(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean register(String idCorretor, String nome, String cpf, String dtNasc, String sexo, String rg,
			String cep, String tel, String profissao, float renda, String email, String senha) {

		try {
			cliente.insertCadastro(idCorretor, nome, cpf, dtNasc, sexo, rg, cep, tel, profissao, renda, email, senha);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean selectByCPF(String cpf) {
		try {
			return cliente.selectByCPF(cpf);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}

	public boolean selectByEmail(String email) {
		try {
			return cliente.selectByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}

	public int numCorretores() {
		try {
			return cliente.numCorretores();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public boolean insertResidencial(String idCliente, String obEndereco, String rural, String portaria,
			String alvenaria, String vlImovel, String tipo, String valor) {
		try {
			cliente.insertResidencial(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel, tipo, valor);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean insertFianca(String idCliente, String obEndereco, String rural, String portaria, String alvenaria,
			String vlImovel, String tipo, String valor) {
		try {
			cliente.insertFianca(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel, tipo, valor);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean insertImobiliario(String idCliente, String obEndereco, String rural, String portaria,
			String alvenaria, String vlImovel, String tipo, String nomeEmpresa, String valor) {
		try {
			cliente.insertImobiliario(idCliente, obEndereco, rural, portaria, alvenaria, vlImovel, tipo, nomeEmpresa,
					valor);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public String[] allServices(String idCliente) {
		try {
			return cliente.allSeguros(idCliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean insertHelp(String tipo, String message, String idCliente, String idCorretor) {
		try {
			cliente.insertHelp(tipo, message, idCliente, idCorretor);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public DefaultTableModel selectMyServices(String idCliente, String sql) {
		Object[] lista = null;
		try {
			lista = cliente.selectMyServicos(idCliente, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Nome do Servico");
		modelo.addColumn("Valor do Servico");
		modelo.addColumn("Endereco assegurado");

		if (lista == null) {
			return null;
		} else {
			modelo.addRow(lista);
			return modelo;
		}
	}
}
