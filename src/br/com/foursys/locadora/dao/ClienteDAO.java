package br.com.foursys.locadora.dao;

/**
 * Responsável pelo CRUD do Cliente;
 * @author mpoda
 *
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import br.com.foursys.locadora.model.Cidade;
import br.com.foursys.locadora.model.Cliente;
import br.com.foursys.locadora.model.Estado;

public class ClienteDAO {
	private Connection bd;

	public ClienteDAO(Connection bd) {
		this.bd = bd;
	}

	// Método de inserir Cliente;
	public void inserirCliente(Cliente cliente) throws SQLException {

		String sql = "INSERT INTO cliente(nome, logradouro, numero_logradouro, bairro,"
				+ "cidade, estado, telefone, cpf, rg, sexo, data_nascimento, idade) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(1, cliente.getNome());
		comando.setString(2, cliente.getLogradouro());
		comando.setInt(3, cliente.getNumero_logradouro());
		comando.setString(4, cliente.getBairro());
		comando.setString(5, cliente.getCidade().getNome());
		comando.setString(6, cliente.getEstado().getNome() + "-" + cliente.getEstado().getUf());
		comando.setString(7, cliente.getTelefone());
		comando.setString(8, cliente.getCpf());
		comando.setString(9, cliente.getRg());
		comando.setString(10, cliente.getSexo() + "");
		comando.setString(11, cliente.getData_nascimento());
		comando.setInt(12, cliente.getIdade());
		comando.execute();
	}

	// Método alterar Clientes
	public void alterarCliente(Cliente cliente) throws SQLException {
		String sql = "UPDATE cliente SET logradouro=?, numero_logradouro = ?, bairro = ?, cidade = ?, estado = ?, telefone = ? WHERE cpf=?";
		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(7, cliente.getCpf());
		comando.setString(6, cliente.getTelefone());
		comando.setString(5, cliente.getEstado().getNome() + "-" + cliente.getEstado().getUf());
		comando.setString(4, cliente.getCidade().getNome());
		comando.setString(3, cliente.getBairro());
		comando.setInt(2, cliente.getNumero_logradouro());
		comando.setString(1, cliente.getLogradouro());
		comando.execute();
	}

	// Método excluir cliente
	public void excluirCliente(Cliente cliente) throws SQLException {

		String sql = "DELETE FROM cliente WHERE cpf=?";
		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(1, cliente.getCpf());
		comando.execute();
	}

	// Método listar Clientes
	public List<Cliente> buscarTodosClientes() throws SQLException {
		String sql = "SELECT * FROM cliente ORDER BY nome";
		PreparedStatement comando = bd.prepareStatement(sql);
		ResultSet cursor = comando.executeQuery();
		List<Cliente> listaClientes = new ArrayList<Cliente>();

		while (cursor.next()) {
			Cliente cliente = new Cliente();
			Cidade cidadeCliente = new Cidade(cursor.getString("cidade"));

			cliente.setNome(cursor.getString("nome"));
			cliente.setLogradouro(cursor.getString("logradouro"));
			cliente.setNumero_logradouro(cursor.getInt("numero_logradouro"));
			cliente.setBairro(cursor.getString("bairro"));
			cliente.setCidade(cidadeCliente);
			String texto[] = cursor.getString("estado").split("-");
			String nomeEstado = texto[0];
			String ufEstado = texto[1];
			Estado estadoCliente = new Estado(nomeEstado, ufEstado);
			cliente.setEstado(estadoCliente);
			cliente.setTelefone(cursor.getString("telefone"));
			cliente.setCpf(cursor.getString("cpf"));
			cliente.setRg(cursor.getString("rg"));
			cliente.setSexo(cursor.getString("sexo").charAt(0));
			cliente.setData_nascimento(cursor.getString("data_nascimento"));
			cliente.setIdade(cursor.getInt("idade"));
			listaClientes.add(cliente);

		}
		return listaClientes;

	}
}
